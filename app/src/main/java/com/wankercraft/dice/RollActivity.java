package com.wankercraft.dice;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.widget.ImageButton;
import com.wankercraft.dice.databinding.ActivityRollBinding;

import java.util.Random;


// TO-DO:
// Calculate total for all rolls this session. Possible include reset button

public class RollActivity extends Activity {

    int numberSides = 0; // Variable for number of sides selected by the user
    int rollValue = 0; // Variable for value of the roll
    int rollsTotal = 0; // Variable for Total for all rolls this session
    private boolean isRolling = false; // Variable for whether we are rolling or not
    ImageButton mRollButton;

    private SoundPool soundPool; // Creating Sound container
    final private int[] sound = new int[3]; // Variable for array of sound files


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.wankercraft.dice.databinding.ActivityRollBinding binding = ActivityRollBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        numberSides = intent.getIntExtra("key", 0); // load number of sides into variable

        // Initialiaze audio constructor
        intiSound();

        mRollButton = findViewById(R.id.rollButton); //Roll button object reference
        mRollButton.setBackground(DefaultBG(numberSides)); //Set the button background per dice selected
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
                    /*case 10: {
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
                rollsTotal += rollValue;
                // update rolls total display
            }
        });
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
                //.setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION) //docs recommend .USAGE_MEDIA or USAGE.GAME unless alarm clock
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
        //Drawable d10BG = io.getDrawable(R.drawable.d10_10);
        //Drawable d12BG = io.getDrawable(R.drawable.d12_12);
        //Drawable d20BG = io.getDrawable(R.drawable.d20_20);

        // Logic to return correct image based which number sided die the user selected.
        switch (i) {
            /* case 20: {
                return d20BG;
            }
            case 12: {
                return d12BG;
            }
            case 10: {
                return d10BG;
            }*/
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
    /*
    //D10 images
    public static Drawable D10Image(int i) {
        Drawable d10One = io.getDrawable(R.drawable.d10_1);
        Drawable d10Two = io.getDrawable(R.drawable.d10_2);
        Drawable d10Three = io.getDrawable(R.drawable.d10_3);
        Drawable d10Four = io.getDrawable(R.drawable.d10_4);
        Drawable d10Five = io.getDrawable(R.drawable.d10_5);
        Drawable d10Six = io.getDrawable(R.drawable.d10_6);
        Drawable d10Seven = io.getDrawable(R.drawable.d10_7);
        Drawable d10Eight = io.getDrawable(R.drawable.d10_8);
        Drawable d10Nine = io.getDrawable(R.drawable.d10_9);
        Drawable d10Ten = io.getDrawable(R.drawable.d10_10);

        switch (i) {
            case 10: {
                return d10Ten;
                break;
            }
            case 9: {
                return d10Nine;
                break;
            }
            case 8: {
                return d10Eight;
                break;
            }
            case 7: {
                return d10Seven;
                break;
            }
            case 6: {
                return d10Six;
                break;
            }
            case 5: {
                return d10Five;
                break;
            }
            case 4: {
                return d10Four;
                break;
            }
            case 3: {
                return d10Three;
                break;
            }
            case 2: {
                return d10Two;
                break;
            }
            case 1: {
                return d10One;
                break;
            }
        } return null;
    }

    //D12 images
    public static Drawable D12Image(int i) {
        Drawable d12One = io.getDrawable(R.drawable.d12_1);
        Drawable d12Two = io.getDrawable(R.drawable.d12_2);
        Drawable d12Three = io.getDrawable(R.drawable.d12_3);
        Drawable d12Four = io.getDrawable(R.drawable.d12_4);
        Drawable d12Five = io.getDrawable(R.drawable.d12_5);
        Drawable d12Six = io.getDrawable(R.drawable.d12_6);
        Drawable d12Seven = io.getDrawable(R.drawable.d12_7);
        Drawable d12Eight = io.getDrawable(R.drawable.d12_8);
        Drawable d12Nine = io.getDrawable(R.drawable.d12_9);
        Drawable d12Ten = io.getDrawable(R.drawable.d12_10);
        Drawable d12Eleven = io.getDrawable(R.drawable.d12_11);
        Drawable d12Twelve = io.getDrawable(R.drawable.d12_12);

        switch (i) {
            case 12: {
                return d12Twelve;
                break;
            }
            case 11: {
                return d12Eleven;
                break;
            }
            case 10: {
                return d12Ten;
                break;
            }
            case 9: {
                return d12Nine;
                break;
            }
            case 8: {
                return d12Eight;
                break;
            }
            case 7: {
                return d12Seven;
                break;
            }
            case 6: {
                return d12Six;
                break;
            }
            case 5: {
                return d12Five;
                break;
            }
            case 4: {
                return d12Four;
                break;
            }
            case 3: {
                return d12Three;
                break;
            }
            case 2: {
                return d12Two;
                break;
            }
            case 1: {
                return d12One;
                break;
            }
        } return null;
    }

    //D20 images
    public static Drawable D20Image(int i) {
        Drawable d20One = io.getDrawable(R.drawable.d20_1);
        Drawable d20Two = io.getDrawable(R.drawable.d20_2);
        Drawable d20Three = io.getDrawable(R.drawable.d20_3);
        Drawable d20Four = io.getDrawable(R.drawable.d20_4);
        Drawable d20Five = io.getDrawable(R.drawable.d20_5);
        Drawable d20Six = io.getDrawable(R.drawable.d20_6);
        Drawable d20Seven = io.getDrawable(R.drawable.d20_7);
        Drawable d20Eight = io.getDrawable(R.drawable.d20_8);
        Drawable d20Nine = io.getDrawable(R.drawable.d20_9);
        Drawable d20Ten = io.getDrawable(R.drawable.d20_10);
        Drawable d20Eleven = io.getDrawable(R.drawable.d20_11);
        Drawable d20Twelve = io.getDrawable(R.drawable.d20_12);
        Drawable d20Thirteen = io.getDrawable(R.drawable.d20_13);
        Drawable d20Fourteen = io.getDrawable(R.drawable.d20_14);
        Drawable d20Fifteen = io.getDrawable(R.drawable.d20_15);
        Drawable d20Sixteen = io.getDrawable(R.drawable.d20_16);
        Drawable d20Seventeen = io.getDrawable(R.drawable.d20_17);
        Drawable d20Eighteen = io.getDrawable(R.drawable.d20_18);
        Drawable d20Nineteen = io.getDrawable(R.drawable.d20_19);
        Drawable d20Twenty = io.getDrawable(R.drawable.d20_20);

        switch (i) {
            case 20: {
                return d20Twenty;
                break;
            }
            case 19: {
                return d20Nineteen;
                break;
            }
            case 18: {
                return d20Eighteen;
                break;
            }
            case 17: {
                return d20Seventeen;
                break;
            }
            case 16: {
                return d20Sixteen;
                break;
            }
            case 15: {
                return d20Fifteen;
                break;
            }
            case 14: {
                return d20Fourteen;
                break;
            }
            case 13: {
                return d20Thirteen;
                break;
            }
            case 12: {
                return d20Twelve;
                break;
            }
            case 11: {
                return d20Eleven;
                break;
            }
            case 10: {
                return d20Ten;
                break;
            }
            case 9: {
                return d20Nine;
                break;
            }
            case 8: {
                return d20Eight;
                break;
            }
            case 7: {
                return d20Seven;
                break;
            }
            case 6: {
                return d20Six;
                break;
            }
            case 5: {
                return d20Five;
                break;
            }
            case 4: {
                return d20Four;
                break;
            }
            case 3: {
                return d20Three;
                break;
            }
            case 2: {
                return d20Two;
                break;
            }
            case 1: {
                return d20One;
                break;
            }
        } return null;
    }


     */
    //d100 images yeeeesh

}
