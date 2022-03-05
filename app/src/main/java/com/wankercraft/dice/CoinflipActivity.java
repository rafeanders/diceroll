package com.wankercraft.dice;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.ipsec.ike.TunnelModeChildSessionParams;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.util.Log;

import com.wankercraft.dice.databinding.ActivityCoinflipBinding;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//TODO: fix flipping animation
public class CoinflipActivity extends Activity {

    private ImageButton mFlipButton;
    private TextView mTextView;
    private ActivityCoinflipBinding binding;

    private boolean isFlipping; // is the coin being flipped
    private boolean animRunning; //is animation running
    private boolean isHeads;

    private float degreesRotation = 720f; // how many degrees of rotation default will land on heads
    private int animationDuration = 1000; // how long it should take

    private String flipResult;

    private Drawable coinHeads;
    private Drawable coinTails;
    private Drawable coinSide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCoinflipBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        coinHeads = getDrawable(R.drawable.one_euro_heads);
        coinTails = getDrawable(R.drawable.one_euro_tails);

        mTextView = binding.coinflipTitle;
        mFlipButton = findViewById(R.id.coiflipButton);
        mFlipButton.setBackground(coinHeads);

        mFlipButton.setOnClickListener(v -> {
            if (!isFlipping) {
                isFlipping = true;
                //do the coin flip
                CoinToss();
                //start flipping animation
                mFlipButton.animate().setDuration(animationDuration).rotationXBy(degreesRotation).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        mFlipButton.setBackground(coinSide);
                    }
                }).start();
            }
            isFlipping = false;
        });
    }

    private void CoinToss() {
        Random r = new Random();
        isHeads = r.nextBoolean(); // randomly set isHeads to true or false
        coinSide = isHeads ? coinHeads : coinTails;
        // set flip rotation total amount based on heads or tails so coin lands on heads or tails. 0/360/720 degrees is heads, 180/540/900 is tails
        //degreesRotation = isHeads ? 900f : 720f; // set the final rotation of coin based on heads or tails
        flipResult = isHeads ? "Heads" : "Tails"; // set the result string based on flip
        Log.d("CoinTossResult", flipResult);
    }



}