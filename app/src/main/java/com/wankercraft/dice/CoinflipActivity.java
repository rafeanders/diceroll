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

                mFlipButton.animate(). {

                }
                //start flipping animation i may miss understand right now what the 720 is
                mFlipButton.animate().rotationX(mFlipButton.getRotation() - 720).start();
                // while the animation sill has duration i think. i think thats wqhat th 720 is
                while(mFlipButton.animate().getDuration() != 0) {
                    if((mFlipButton.getRotationX() >= 0 && mFlipButton.getRotationX() <= 180) || (mFlipButton.getRotationX() > 360 && mFlipButton.getRotationX() <= 540)) {
                        mFlipButton.setBackground(coinHeads);
                    } else if((mFlipButton.getRotationX() > 180 && mFlipButton.getRotationX() <= 360) || (mFlipButton.getRotationX() > 540 && mFlipButton.getRotationX() <= 720)) {
                        mFlipButton.setBackground(coinTails);
                    }
                }
                mFlipButton.animate().rota
            }
        });
    }

    trying method for this.
    private void TossAnimation() {
        mFlipButton.animate().setDuration(1000).rotationXBy(720f);
    }

    private int CoinToss() {
        Random r = new Random();
        int val;
        val = r.nextInt(1);
        return val;
    }




}