package com.wankercraft.dice;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityRollBinding;

import java.util.Random;


// TO-DO:
// Noting atm on this one

public class RollActivity extends Activity {

    int numberSides = 0; // Variable for number of sides selected by the user
    int rollValue = 0; // Variable for value of the roll
    int rollsTotal = 0; // Variable for Total for all rolls this session
    private boolean isRolling = false; // Variable for whether we are rolling or not
    ImageButton mRollButton;
    TextView mRollsTotal;
    private SoundPool soundPool; // Creating Sound container
    final private int[] sound = new int[3]; // Variable for array of sound files

    // need variable and related shit for saved preferences for die colour chosen
    // need to implement seperate class for providing the drawable object based on number of sides
    // and colour of die selected. Ex: a D4 die with Colour 1 chosen.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.wankercraft.dice.databinding.ActivityRollBinding binding = ActivityRollBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View d = getLayoutInflater().inflate(R.layout.activity_roll, null);
        RollImage rollImage = new RollImage(this, d);


        Intent intent = getIntent();
        numberSides = intent.getIntExtra("key", 0); // load number of sides into variable

        mRollsTotal = findViewById(R.id.totalallrolls);
        mRollsTotal.setText(String.valueOf(rollsTotal));
        // Initialiaze audio constructor
        intiSound();

        mRollButton = findViewById(R.id.rollButton); //Roll button object reference
        mRollButton.setBackground(rollImage.StartBG(numberSides)); //Set the button background per dice selected
        mRollButton.setOnClickListener(v -> { //listener for click on roll button
            if(!isRolling) {
                isRolling = true; // We are now rolling the die
                // play sound of die rolling
                rollSound();
                // Play animation
                mRollButton.animate().rotation(mRollButton.getRotation() - 720).start();
                // Figure out a way to delay x seconds before doing the roll and changing the image to the result
                rollDie();
                // display die side corresponding to random number generated
                switch (numberSides) {
                    case 4: {
                        //v.setBackground(D4Image(rollValue)); // Assigns background image for roll value
                        v.setBackground(rollImage.D4Image(rollValue)); //new implementation
                        isRolling = false; // We are done rolling
                        break;
                    }
                    case 6: {
                        //v.setBackground(D6Image(rollValue));
                        v.setBackground(rollImage.D6Image(rollValue)); //new implementation
                        isRolling = false;
                        break;
                    }
                    case 8: {
                        //v.setBackground(D8Image(rollValue));
                        v.setBackground(rollImage.D8Image(rollValue)); //new implementation
                        isRolling = false;
                        break;
                    }
                    case 10: {
                        //v.setBackground(D10Image(rollValue));
                        v.setBackground(rollImage.D10Image(rollValue)); //new implementation
                        isRolling = false;
                        break;
                    }
                    case 12: {
                        //v.setBackground(D12Image(rollValue));
                        v.setBackground(rollImage.D12Image(rollValue)); //new implementation
                        isRolling = false;
                        break;
                    }
                    case 20: {
                        //v.setBackground(D20Image(rollValue));
                        v.setBackground(rollImage.D20Image(rollValue)); //new implementation
                        if (rollValue == 20) {
                            mRollsTotal.setTextColor(Color.GREEN);
                        } else if (rollValue == 1) {
                            mRollsTotal.setTextColor(Color.RED);
                        } else {
                            mRollsTotal.setTextColor(Color.WHITE);
                        }
                        isRolling = false;
                        break;
                    }
                }
                updateTotal(); // Update total
            }
        });
    }

    //Increment total tally for all rolls, and update textview
    private void updateTotal() {
        rollsTotal += rollValue;
        mRollsTotal.setText(String.valueOf(rollsTotal));
    }

    // This method "roll" the die, returns a random int in the range of the selected die
    private void rollDie() {
        Random r = new Random();
        rollValue = r.nextInt((numberSides - 1) + 1) + 1;
    }

    //region AUDIO

    // Initialize sound manager and load sounds into array
    private void intiSound() {
        AudioAttributes aa = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(1)
                .setAudioAttributes(aa)
                .build();

        sound[0] = soundPool.load(this, R.raw.roll, 1);
        sound[1] = soundPool.load(this, R.raw.roll2, 1);
        sound[2] = soundPool.load(this, R.raw.roll3, 1);
    }


    // Play random rolling sound when called
    public void rollSound() {
        Random r = new Random();
        int rn = r.nextInt(3);

        switch (rn) {
            case 0:
                soundPool.play(sound[0], 1, 1, 1, 0, 1f);
                break;
            case 1:
                soundPool.play(sound[1], 1, 1, 1, 0, 1f);
                break;
            case 2:
                soundPool.play(sound[2], 1, 1, 1, 0, 1f);
                break;
        }
    }

    //endregion
}
