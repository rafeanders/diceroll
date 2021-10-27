package com.wankercraft.dice;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


import com.wankercraft.dice.databinding.ActivityRollBinding;
import java.util.Random;

public class RollActivity extends Activity {

    //private TextView mTextView;
    private ActivityRollBinding binding;
    int numberSides = 0;
    int rollValue = 0;
    private boolean isRolling = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRollBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //mTextView = binding.text;

        Intent intent = getIntent();
        numberSides = intent.getIntExtra("key", 0);

        ImageButton mRollButton = findViewById(R.id.rollButton);
        mRollButton.setBackground(DefaultBG(numberSides)); //Set the button background per dice selected
        mRollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isRolling) {
                    isRolling = true; // We are now rolling the die
                    rollDie();
                    // Change button image to animation of die rolling
                    // play sound of die rolling
                    // Wait x seconds for roll animation
                    //RollAnimation.rollAnimation();
                    // display die side corresponding to random number generated
                    switch (numberSides) {
                        case 4: {
                            v.setBackground(D4Image(rollValue)); // Assigns background image for roll value
                            break;
                        }
                        /*case 6: {
                            v.setBackground(ImageObjects.D6Image(rollValue));
                            break;
                        }
                        case 8: {
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
                } isRolling = false;
            }
        });
    }

    // This method "roll" the die, returns a random int in the range of the selected die
    private void rollDie() {
        Random r = new Random();
        rollValue = r.nextInt((numberSides - 1) + 1) + 1;
        //return rollValue;
    }

    private Drawable DefaultBG(int i) {
        Drawable d4BG =getDrawable(R.drawable.d4_4);
        /*Drawable d6BG = io.getDrawable(R.drawable.d6_6);
        Drawable d8BG = io.getDrawable(R.drawable.d8_8);
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
            }
            case 6: {
                return d6BG;
            } */
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

}