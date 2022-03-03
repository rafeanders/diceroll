package com.wankercraft.dice;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityCoinflipBinding;

import java.util.Random;

public class CoinflipActivity extends Activity {

    private ImageButton mFlipButton;
    private TextView mTextView;
    private ActivityCoinflipBinding binding;

    private boolean isFlipping; // is the coin being flipped

    private float degreesRotation = 720f; // how many degrees of rotation default will land on heads
    private int animationDuration = 1000; // how long it should take

    private Drawable coinHeads;
    private Drawable coinTails;


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

                //start flipping animation i may miss understand right now what the 720 is
                mFlipButton.animate().setDuration(animationDuration).rotationXBy(degreesRotation).start();
                // while the animation sill has duration change image based on position
                // curently this bit locks up haard
                //while(mFlipButton.animate().getDuration() != 0) {
                //    if ((mFlipButton.getRotationX() >= 0 && mFlipButton.getRotationX() <= 90) || (mFlipButton.getRotationX() > 270 && mFlipButton.getRotationX() <= 360)) {
                //        mFlipButton.setBackground(coinHeads);
                //    } else if (mFlipButton.getRotationX() > 90 && mFlipButton.getRotationX() <= 270) {
                //        mFlipButton.setBackground(coinTails);
                //    }
                //}
            }
            isFlipping = false;
        });
    }

    private void CoinToss() {
        Random r = new Random();
        // 0 == heads 1 == tails
        float tossValue = r.nextFloat();
        // set flip rotation total amount based on heads or tails so coin lands on heads or tails. 0/360/720 degrees is heads, 180/540/900 is tails
        degreesRotation = tossValue > 0.5f ? 900f : 720f;
    }
}