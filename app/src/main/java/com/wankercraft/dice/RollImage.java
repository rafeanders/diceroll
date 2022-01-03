package com.wankercraft.dice;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;


// This class needs to return an image based on die colour saved in shared preferences.
// Need to add all the new images etc
// replacing d4 and d6 with correct color and adding two other color sets.

public class RollImage {
    Context context;
    View v;
    // setting value selected by user for die colour
    int colourSetting = 0;

    //Method to initialize context and view containers
    public RollImage(Context context, View v) {
        this.context = context;
        this.v = v;
        //instantiating shared preference
        SharedPreferences settings = context.getSharedPreferences("userSettings", Context.MODE_PRIVATE);
        colourSetting = settings.getInt("colour", 0);
    }

    // main method called to return the background drawable recourse
    public Drawable StartBG(int i) {
        switch (colourSetting) {
            case 0: {
                return DefaultBG(i); //rename BGBlackGreen
            }
            case 1: {
                //return BlackBG(i);
            }
            case 2: {
                //return GreenBG(i);
            }
        }return null;
    }

    // Main method called to return d4 roll result image
    //rename to D4Image
    public Drawable D4ImageTemp(int i) {
        switch (colourSetting) {
            case 0: {
                return D4Image(i); //return D4GreenBlack;
            }
            case 1: {

            }
            case 2: {

            }
        }return null;
    }

    //rename to D6Image
    public Drawable D6ImageTemp(int i) {
        switch (colourSetting) {
            case 0: {

            }
            case 1: {

            }
            case 2: {

            }
        }return null;
    }

    //rename to D8Image
    public Drawable D8ImageTemp(int i) {
        switch (colourSetting) {
            case 0: {

            }
            case 1: {

            }
            case 2: {

            }
        }return null;
    }

    //rename to D10Image
    public Drawable D10ImageTemp(int i) {
        switch (colourSetting) {
            case 0: {

            }
            case 1: {

            }
            case 2: {

            }
        }return null;
    }

    //rename to D12Image
    public Drawable D12ImageTemp(int i) {
        switch (colourSetting) {
            case 0: {

            }
            case 1: {

            }
            case 2: {

            }
        }return null;
    }

    //rename to D20Image
    public Drawable D20ImageTemp(int i) {
        switch (colourSetting) {
            case 0: {

            }
            case 1: {

            }
            case 2: {

            }
        }return null;
    }

    // these methods returns default background for green/black colour die
    // rename GreenBlackBG
    // this should just return a bg drawable object based on what colour is selected. not just be
    // one colour specific. shouldn't need separate methods for all the different colours
    public Drawable DefaultBG(int i) {
        //Drawable references to image assets default green/black colour
        Drawable d4BG_GB = context.getDrawable(R.drawable.d4_4_greenblack);
        Drawable d6BG_GB = context.getDrawable(R.drawable.d6_6_greenblack);
        Drawable d8BG_GB = context.getDrawable(R.drawable.d8_8_greenblack);
        Drawable d10BG_GB = context.getDrawable(R.drawable.d10_10_greenblack);
        Drawable d12BG_GB= context.getDrawable(R.drawable.d12_12_greenblack);
        Drawable d20BG_GB = context.getDrawable(R.drawable.d20_20_greenblack);

        // Logic to return correct image based which number sided die the user selected, and the colour chosen in settings
        switch (i) {
            case 20: {
                return d20BG_GB;
            }
            case 12: {
                return d12BG_GB;
            }
            case 10: {
                return d10BG_GB;
            }
            case 8: {
                return d8BG_GB;
            }
            case 6: {
                return d6BG_GB;
            }
            case 4: {
                return d4BG_GB;
            }
        } return null;
    }

    // rename D4GreenBlack
    public Drawable D4Image(int i) {
        Drawable d4One = context.getDrawable(R.drawable.d4_1_greenblack);
        Drawable d4Two = context.getDrawable(R.drawable.d4_2_greenblack);
        Drawable d4Three = context.getDrawable(R.drawable.d4_3_greenblack);
        Drawable d4Four = context.getDrawable(R.drawable.d4_4_greenblack);

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

    // rename D6GreenBlack
    public Drawable D6Image(int i) {
        Drawable d6One = context.getDrawable(R.drawable.d6_1_greenblack);
        Drawable d6Two = context.getDrawable(R.drawable.d6_2_greenblack);
        Drawable d6Three = context.getDrawable(R.drawable.d6_3_greenblack);
        Drawable d6Four = context.getDrawable(R.drawable.d6_4_greenblack);
        Drawable d6Five = context.getDrawable(R.drawable.d6_5_greenblack);
        Drawable d6Six = context.getDrawable(R.drawable.d6_6_greenblack);

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


    // rename D8GreenBlack
    public Drawable D8Image(int i) {
        Drawable d8One = context.getDrawable(R.drawable.d8_1_greenblack);
        Drawable d8Two = context.getDrawable(R.drawable.d8_2_greenblack);
        Drawable d8Three = context.getDrawable(R.drawable.d8_3_greenblack);
        Drawable d8Four = context.getDrawable(R.drawable.d8_4_greenblack);
        Drawable d8Five = context.getDrawable(R.drawable.d8_5_greenblack);
        Drawable d8Six = context.getDrawable(R.drawable.d8_6_greenblack);
        Drawable d8Seven = context.getDrawable(R.drawable.d8_7_greenblack);
        Drawable d8Eight = context.getDrawable(R.drawable.d8_8_greenblack);

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

    // rename D10GreenBlack
    public Drawable D10Image(int i) {
        Drawable d10One = context.getDrawable(R.drawable.d10_1_greenblack);
        Drawable d10Two = context.getDrawable(R.drawable.d10_2_greenblack);
        Drawable d10Three = context.getDrawable(R.drawable.d10_3_greenblack);
        Drawable d10Four = context.getDrawable(R.drawable.d10_4_greenblack);
        Drawable d10Five = context.getDrawable(R.drawable.d10_5_greenblack);
        Drawable d10Six = context.getDrawable(R.drawable.d10_6_greenblack);
        Drawable d10Seven = context.getDrawable(R.drawable.d10_7_greenblack);
        Drawable d10Eight = context.getDrawable(R.drawable.d10_8_greenblack);
        Drawable d10Nine = context.getDrawable(R.drawable.d10_9_greenblack);
        Drawable d10Ten = context.getDrawable(R.drawable.d10_10_greenblack);

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

    // rename D12GreenBlack
    public Drawable D12Image(int i) {
        Drawable d12One = context.getDrawable(R.drawable.d12_1_greenblack);
        Drawable d12Two = context.getDrawable(R.drawable.d12_2_greenblack);
        Drawable d12Three = context.getDrawable(R.drawable.d12_3_greenblack);
        Drawable d12Four = context.getDrawable(R.drawable.d12_4_greenblack);
        Drawable d12Five = context.getDrawable(R.drawable.d12_5_greenblack);
        Drawable d12Six = context.getDrawable(R.drawable.d12_6_greenblack);
        Drawable d12Seven = context.getDrawable(R.drawable.d12_7_greenblack);
        Drawable d12Eight = context.getDrawable(R.drawable.d12_8_greenblack);
        Drawable d12Nine = context.getDrawable(R.drawable.d12_9_greenblack);
        Drawable d12Ten = context.getDrawable(R.drawable.d12_10_greenblack);
        Drawable d12Eleven = context.getDrawable(R.drawable.d12_11_greenblack);
        Drawable d12Twelve = context.getDrawable(R.drawable.d12_12_greenblack);

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

    // rename D20GreenBlack
    public Drawable D20Image(int i) {
        Drawable d20One = context.getDrawable(R.drawable.d20_1_greenblack);
        Drawable d20Two = context.getDrawable(R.drawable.d20_2_greenblack);
        Drawable d20Three = context.getDrawable(R.drawable.d20_3_greenblack);
        Drawable d20Four = context.getDrawable(R.drawable.d20_4_greenblack);
        Drawable d20Five = context.getDrawable(R.drawable.d20_5_greenblack);
        Drawable d20Six = context.getDrawable(R.drawable.d20_6_greenblack);
        Drawable d20Seven = context.getDrawable(R.drawable.d20_7_greenblack);
        Drawable d20Eight = context.getDrawable(R.drawable.d20_8_greenblack);
        Drawable d20Nine = context.getDrawable(R.drawable.d20_9_greenblack);
        Drawable d20Ten = context.getDrawable(R.drawable.d20_10_greenblack);
        Drawable d20Eleven = context.getDrawable(R.drawable.d20_11_greenblack);
        Drawable d20Twelve = context.getDrawable(R.drawable.d20_12_greenblack);
        Drawable d20Thirteen = context.getDrawable(R.drawable.d20_13_greenblack);
        Drawable d20Fourteen = context.getDrawable(R.drawable.d20_14_greenblack);
        Drawable d20Fifteen = context.getDrawable(R.drawable.d20_15_greenblack);
        Drawable d20Sixteen = context.getDrawable(R.drawable.d20_16_greenblack);
        Drawable d20Seventeen = context.getDrawable(R.drawable.d20_17_greenblack);
        Drawable d20Eighteen = context.getDrawable(R.drawable.d20_18_greenblack);
        Drawable d20Nineteen = context.getDrawable(R.drawable.d20_19_greenblack);
        Drawable d20Twenty = context.getDrawable(R.drawable.d20_20_greenblack);

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
}
