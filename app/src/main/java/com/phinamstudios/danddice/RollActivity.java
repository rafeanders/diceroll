package com.phinamstudios.danddice;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.phinamstudios.danddice.databinding.ActivityRollBinding;

import java.util.Random;


// TO-DO:
// Calculate total for all rolls this session. Possible include reset button

public class RollActivity extends Activity {

    int numberSides = 0; // Variable for number of sides selected by the user
    int rollValue = 0; // Variable for value of the roll
    int rollsTotal = 0; // Variable for Total for all rolls this session
    private boolean isRolling = false; // Variable for whether we are rolling or not
    ImageButton mRollButton;
    TextView mRollsTotal;
    private SoundPool soundPool; // Creating Sound container
    final private int[] sound = new int[3]; // Variable for array of sound files


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.phinamstudios.danddice.databinding.ActivityRollBinding binding = ActivityRollBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        numberSides = intent.getIntExtra("key", 0); // load number of sides into variable

        mRollsTotal = findViewById(R.id.totalallrolls);
        mRollsTotal.setText(String.valueOf(rollsTotal));
        // Initialiaze audio constructor
        intiSound();

        mRollButton = findViewById(R.id.rollButton); //Roll button object reference
        mRollButton.setBackground(DefaultBG(numberSides)); //Set the button background per danddice selected
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
                        v.setBackground(D4Image(rollValue)); // Assigns background image for roll value
                        isRolling = false; // We are done rolling
                        break;
                    }
                    case 6: {
                        v.setBackground(D6Image(rollValue));
                        isRolling = false;
                        break;
                    }
                    case 8: {
                        v.setBackground(D8Image(rollValue));
                        isRolling = false;
                        break;
                    }
                    case 10: {
                        v.setBackground(D10Image(rollValue));
                        isRolling = false;
                        break;
                    }
                    case 12: {
                        v.setBackground(D12Image(rollValue));
                        isRolling = false;
                        break;
                    }
                    case 20: {
                        v.setBackground(D20Image(rollValue));
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

    // This method provides the drawable reference for the initial image on the roll screen based
    // on user input.
    private Drawable DefaultBG(int i) {
        //Drawable references to image assets
        Drawable d4BG = getDrawable(R.drawable.d4_4);
        Drawable d6BG = getDrawable(R.drawable.d6_6);
        Drawable d8BG = getDrawable(R.drawable.d8_8);
        Drawable d10BG = getDrawable(R.drawable.d10_10);
        Drawable d12BG = getDrawable(R.drawable.d12_12);
        Drawable d20BG = getDrawable(R.drawable.d20_20);

        // Logic to return correct image based which number sided die the user selected.
        switch (i) {
            case 20: {
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
            }
            case 4: {
                return d4BG;
            }
        } return null;
    }

    private Drawable D4Image(int i) {
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


    //D8 images
    public Drawable D8Image(int i) {
        Drawable d8One = getDrawable(R.drawable.d8_1);
        Drawable d8Two = getDrawable(R.drawable.d8_2);
        Drawable d8Three = getDrawable(R.drawable.d8_3);
        Drawable d8Four = getDrawable(R.drawable.d8_4);
        Drawable d8Five = getDrawable(R.drawable.d8_5);
        Drawable d8Six = getDrawable(R.drawable.d8_6);
        Drawable d8Seven = getDrawable(R.drawable.d8_7);
        Drawable d8Eight = getDrawable(R.drawable.d8_8);

        switch (i) {
            case 8: {
                return d8Eight;
            }
            case 7: {
                return d8Seven;
            }
            case 6: {
                return d8Six;
            }
            case 5: {
                return d8Five;
            }
            case 4: {
                return d8Four;
            }
            case 3: {
                return d8Three;
            }
            case 2: {
                return d8Two;
            }
            case 1: {
                return d8One;
            }
        } return null;
    }

    //D10 images
    public Drawable D10Image(int i) {
        Drawable d10One = getDrawable(R.drawable.d10_1);
        Drawable d10Two = getDrawable(R.drawable.d10_2);
        Drawable d10Three = getDrawable(R.drawable.d10_3);
        Drawable d10Four = getDrawable(R.drawable.d10_4);
        Drawable d10Five = getDrawable(R.drawable.d10_5);
        Drawable d10Six = getDrawable(R.drawable.d10_6);
        Drawable d10Seven = getDrawable(R.drawable.d10_7);
        Drawable d10Eight = getDrawable(R.drawable.d10_8);
        Drawable d10Nine = getDrawable(R.drawable.d10_9);
        Drawable d10Ten = getDrawable(R.drawable.d10_10);

        switch (i) {
            case 10: {
                return d10Ten;
            }
            case 9: {
                return d10Nine;
            }
            case 8: {
                return d10Eight;
            }
            case 7: {
                return d10Seven;
            }
            case 6: {
                return d10Six;
            }
            case 5: {
                return d10Five;
            }
            case 4: {
                return d10Four;
            }
            case 3: {
                return d10Three;
            }
            case 2: {
                return d10Two;
            }
            case 1: {
                return d10One;
            }
        } return null;
    }

    //D12 images
    public Drawable D12Image(int i) {
        Drawable d12One = getDrawable(R.drawable.d12_1);
        Drawable d12Two = getDrawable(R.drawable.d12_2);
        Drawable d12Three = getDrawable(R.drawable.d12_3);
        Drawable d12Four = getDrawable(R.drawable.d12_4);
        Drawable d12Five = getDrawable(R.drawable.d12_5);
        Drawable d12Six = getDrawable(R.drawable.d12_6);
        Drawable d12Seven = getDrawable(R.drawable.d12_7);
        Drawable d12Eight = getDrawable(R.drawable.d12_8);
        Drawable d12Nine = getDrawable(R.drawable.d12_9);
        Drawable d12Ten = getDrawable(R.drawable.d12_10);
        Drawable d12Eleven = getDrawable(R.drawable.d12_11);
        Drawable d12Twelve = getDrawable(R.drawable.d12_12);

        switch (i) {
            case 12: {
                return d12Twelve;
            }
            case 11: {
                return d12Eleven;
            }
            case 10: {
                return d12Ten;
            }
            case 9: {
                return d12Nine;
            }
            case 8: {
                return d12Eight;
            }
            case 7: {
                return d12Seven;
            }
            case 6: {
                return d12Six;
            }
            case 5: {
                return d12Five;
            }
            case 4: {
                return d12Four;
            }
            case 3: {
                return d12Three;
            }
            case 2: {
                return d12Two;
            }
            case 1: {
                return d12One;
            }
        } return null;
    }

    //D20 images
    public Drawable D20Image(int i) {
        Drawable d20One = getDrawable(R.drawable.d20_1);
        Drawable d20Two = getDrawable(R.drawable.d20_2);
        Drawable d20Three = getDrawable(R.drawable.d20_3);
        Drawable d20Four = getDrawable(R.drawable.d20_4);
        Drawable d20Five = getDrawable(R.drawable.d20_5);
        Drawable d20Six = getDrawable(R.drawable.d20_6);
        Drawable d20Seven = getDrawable(R.drawable.d20_7);
        Drawable d20Eight = getDrawable(R.drawable.d20_8);
        Drawable d20Nine = getDrawable(R.drawable.d20_9);
        Drawable d20Ten = getDrawable(R.drawable.d20_10);
        Drawable d20Eleven = getDrawable(R.drawable.d20_11);
        Drawable d20Twelve = getDrawable(R.drawable.d20_12);
        Drawable d20Thirteen = getDrawable(R.drawable.d20_13);
        Drawable d20Fourteen = getDrawable(R.drawable.d20_14);
        Drawable d20Fifteen = getDrawable(R.drawable.d20_15);
        Drawable d20Sixteen = getDrawable(R.drawable.d20_16);
        Drawable d20Seventeen = getDrawable(R.drawable.d20_17);
        Drawable d20Eighteen = getDrawable(R.drawable.d20_18);
        Drawable d20Nineteen = getDrawable(R.drawable.d20_19);
        Drawable d20Twenty = getDrawable(R.drawable.d20_20);

        switch (i) {
            case 20: {
                return d20Twenty;
            }
            case 19: {
                return d20Nineteen;
            }
            case 18: {
                return d20Eighteen;
            }
            case 17: {
                return d20Seventeen;
            }
            case 16: {
                return d20Sixteen;
            }
            case 15: {
                return d20Fifteen;
            }
            case 14: {
                return d20Fourteen;
            }
            case 13: {
                return d20Thirteen;
            }
            case 12: {
                return d20Twelve;
            }
            case 11: {
                return d20Eleven;
            }
            case 10: {
                return d20Ten;
            }
            case 9: {
                return d20Nine;
            }
            case 8: {
                return d20Eight;
            }
            case 7: {
                return d20Seven;
            }
            case 6: {
                return d20Six;
            }
            case 5: {
                return d20Five;
            }
            case 4: {
                return d20Four;
            }
            case 3: {
                return d20Three;
            }
            case 2: {
                return d20Two;
            }
            case 1: {
                return d20One;
            }
        } return null;
    }



    //d100 images yeeeesh

}
