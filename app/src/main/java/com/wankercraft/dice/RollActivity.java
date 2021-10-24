package com.wankercraft.dice;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RemoteViewsService;
import android.widget.TextView;
import android.widget.Toast;

import com.wankercraft.dice.databinding.ActivityRollBinding;
import java.util.Random;
import java.util.Timer;

public class RollActivity extends Activity {

    private TextView mTextView;
    private ActivityRollBinding binding;
    int numberSides = 0;
    int rollValue = 0;
    private boolean isRolling = false;
    AnimationDrawable rollingAnimation;
    Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRollBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;

        Intent intent = getIntent();
        numberSides = intent.getIntExtra("key", 0);
        //imageToDisplay = numberSides;

        ImageButton mRollButton = (ImageButton) findViewById(R.id.rollButton);
        mRollButton.setBackground(ImageObjects.DefaultBG(numberSides)); //Set the button background per dice selected
        mRollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isRolling) {
                    isRolling = true; // We are now rolling the die
                    ;// Change button image to animation of die rolling
                    // play sound of die rolling
                    rollDie();
                    v.setBackground(ImageObjects.Animation(numberSides));
                    timer.wait(3000);
                    // Wait x seconds for roll animation
                    // display die side corresponding to random number generated
                    switch (numberSides) {
                        case 4: {
                            v.setBackground(ImageObjects.D4Image(rollValue)); // Assigns background image for roll value
                            break;
                        }
                        case 6: {
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
                        }
                    }
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
}