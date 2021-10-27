package com.wankercraft.dice;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


import com.wankercraft.dice.databinding.ActivityRollBinding;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class RollActivity extends Activity {

    //private TextView mTextView;
    private ActivityRollBinding binding;
    int animationDelay = 1500; // default 1500
    int numberSides = 0;
    int rollValue = 0;
    private boolean isRolling = false;
    ImageButton mRollButton;
    Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRollBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //mTextView = binding.text;

        Intent intent = getIntent();
        numberSides = intent.getIntExtra("key", 0);

        mRollButton = findViewById(R.id.rollButton);
        mRollButton.setBackground(DefaultBG(numberSides)); //Set the button background per dice selected
        mRollButton.setOnClickListener(v -> {
            if(!isRolling) {
                isRolling = true; // We are now rolling the die
                // play sound of die rolling
                // PLay animation and wait x seconds for roll animation
                mRollButton.animate().rotation(mRollButton.getRotation() - 720).start();

                rollDie();

                // display die side corresponding to random number generated
                switch (numberSides) {
                    case 4: {
                        v.setBackground(D4Image(rollValue)); // Assigns background image for roll value
                        isRolling = false;
                        break;
                    }
                    case 6: {
                        v.setBackground(D6Image(rollValue));
                        isRolling = false;
                        break;
                    }
                    /*case 8: {
                        v.setBackground(ImageObjects.D8Image(rollValue));
                        break;
                    }
                    case 10: {
                        v.setBackground(ImageObjects.D10Image(rollValue));
                        break;
                    }
                    case 12: {
                        v.setBackground(ImageObjects.D12Image(rollValue));
                        break;
                    }
                    case 20: {
                        v.setBackground(ImageObjects.D20Image(rollValue));
                        break;
                    }*/
                }
            }
        });
    }

    // This method "roll" the die, returns a random int in the range of the selected die
    private void rollDie() {
        Random r = new Random();
        rollValue = r.nextInt((numberSides - 1) + 1) + 1;
        //return rollValue;
    }

    private void rollAnimation() {
        // get image resource assign to variable roll button
        mRollButton = findViewById(R.id.rollButton);
        // Not my code. Thanks stackoverflow.
        ObjectAnimator anim = ObjectAnimator.ofFloat(mRollButton, "rotationY", 5.0f);
        //duration
        anim.setDuration(animationDelay);
        //repeatability
        anim.setRepeatCount(1);
        //set interpolator
        anim.setInterpolator(new AccelerateDecelerateInterpolator());
        //listener for animation end
        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
            }
        });
        //start anim
        anim.start();
    }

    private Drawable DefaultBG(int i) {
        Drawable d4BG =getDrawable(R.drawable.d4_4);
        Drawable d6BG = getDrawable(R.drawable.d6_6);
        /*Drawable d8BG = io.getDrawable(R.drawable.d8_8);
        Drawable d10BG = io.getDrawable(R.drawable.d10_10);
        Drawable d12BG = io.getDrawable(R.drawable.d12_12);
        Drawable d20BG = io.getDrawable(R.drawable.d20_20);
        */
        switch (i) {
            /* case 20: {
                return d20BG;
            }
            case 12: {
                return d12BG;
            }
            case 10: {
                return d10BG;
            }
            case 8: {
                return d8BG;
            }*/
            case 6: {
                return d6BG;
            }
            case 4: {
                return d4BG;
            }
        } return null;
    }

    private Drawable D4Image(int i) {
        //Instance of this class to call non static method


        Drawable d4One = getDrawable(R.drawable.d4_1);
        Drawable d4Two = getDrawable(R.drawable.d4_2);
        Drawable d4Three = getDrawable(R.drawable.d4_3);
        Drawable d4Four = getDrawable(R.drawable.d4_4);

        switch (i) {
            case 4: {
                return d4Four;
            }
            case 3: {
                return d4Three;
            }
            case 2: {
                return d4Two;
            }
            case 1: {
                return d4One;
            }
        } return null;
    }

    private Drawable D6Image(int i) {
        Drawable d6One = getDrawable(R.drawable.d6_1);
        Drawable d6Two = getDrawable(R.drawable.d6_2);
        Drawable d6Three = getDrawable(R.drawable.d6_3);
        Drawable d6Four = getDrawable(R.drawable.d6_4);
        Drawable d6Five = getDrawable(R.drawable.d6_5);
        Drawable d6Six = getDrawable(R.drawable.d6_6);

        switch (i) {
            case 6: {
                return d6Six;
            }
            case 5: {
                return d6Five;
            }
            case 4: {
                return d6Four;
            }
            case 3: {
                return d6Three;
            }
            case 2: {
                return d6Two;
            }
            case 1: {
                return d6One;
            }
        } return null;
    }

}