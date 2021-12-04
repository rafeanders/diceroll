package com.wankercraft.dice;

import android.app.Activity;
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

    //instantiating shared preference
    SharedPreferences settings = context.getSharedPreferences("colourSetting", Activity.MODE_PRIVATE);
    // setting value selected by user for die colour
    int colourSetting = settings.getInt("colourSetting", 0);

    //Method to initialize context and view containers
    public RollImage(Context context, View v) {
        this.context = context;
        this.v = v;
    }

    public Drawable DefaultBG(int i) {
        //Drawable references to image assets
        Drawable d4BG = context.getDrawable(R.drawable.d4_4);
        Drawable d6BG = context.getDrawable(R.drawable.d6_6);
        Drawable d8BG = context.getDrawable(R.drawable.d8_8);
        Drawable d10BG = context.getDrawable(R.drawable.d10_10);
        Drawable d12BG = context.getDrawable(R.drawable.d12_12);
        Drawable d20BG = context.getDrawable(R.drawable.d20_20);

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

    public Drawable D4Image(int i) {
        Drawable d4One = context.getDrawable(R.drawable.d4_1);
        Drawable d4Two = context.getDrawable(R.drawable.d4_2);
        Drawable d4Three = context.getDrawable(R.drawable.d4_3);
        Drawable d4Four = context.getDrawable(R.drawable.d4_4);

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

    public Drawable D6Image(int i) {
        Drawable d6One = context.getDrawable(R.drawable.d6_1);
        Drawable d6Two = context.getDrawable(R.drawable.d6_2);
        Drawable d6Three = context.getDrawable(R.drawable.d6_3);
        Drawable d6Four = context.getDrawable(R.drawable.d6_4);
        Drawable d6Five = context.getDrawable(R.drawable.d6_5);
        Drawable d6Six = context.getDrawable(R.drawable.d6_6);

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
        Drawable d8One = context.getDrawable(R.drawable.d8_1);
        Drawable d8Two = context.getDrawable(R.drawable.d8_2);
        Drawable d8Three = context.getDrawable(R.drawable.d8_3);
        Drawable d8Four = context.getDrawable(R.drawable.d8_4);
        Drawable d8Five = context.getDrawable(R.drawable.d8_5);
        Drawable d8Six = context.getDrawable(R.drawable.d8_6);
        Drawable d8Seven = context.getDrawable(R.drawable.d8_7);
        Drawable d8Eight = context.getDrawable(R.drawable.d8_8);

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
        Drawable d10One = context.getDrawable(R.drawable.d10_1);
        Drawable d10Two = context.getDrawable(R.drawable.d10_2);
        Drawable d10Three = context.getDrawable(R.drawable.d10_3);
        Drawable d10Four = context.getDrawable(R.drawable.d10_4);
        Drawable d10Five = context.getDrawable(R.drawable.d10_5);
        Drawable d10Six = context.getDrawable(R.drawable.d10_6);
        Drawable d10Seven = context.getDrawable(R.drawable.d10_7);
        Drawable d10Eight = context.getDrawable(R.drawable.d10_8);
        Drawable d10Nine = context.getDrawable(R.drawable.d10_9);
        Drawable d10Ten = context.getDrawable(R.drawable.d10_10);

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
        Drawable d12One = context.getDrawable(R.drawable.d12_1);
        Drawable d12Two = context.getDrawable(R.drawable.d12_2);
        Drawable d12Three = context.getDrawable(R.drawable.d12_3);
        Drawable d12Four = context.getDrawable(R.drawable.d12_4);
        Drawable d12Five = context.getDrawable(R.drawable.d12_5);
        Drawable d12Six = context.getDrawable(R.drawable.d12_6);
        Drawable d12Seven = context.getDrawable(R.drawable.d12_7);
        Drawable d12Eight = context.getDrawable(R.drawable.d12_8);
        Drawable d12Nine = context.getDrawable(R.drawable.d12_9);
        Drawable d12Ten = context.getDrawable(R.drawable.d12_10);
        Drawable d12Eleven = context.getDrawable(R.drawable.d12_11);
        Drawable d12Twelve = context.getDrawable(R.drawable.d12_12);

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
        Drawable d20One = context.getDrawable(R.drawable.d20_1);
        Drawable d20Two = context.getDrawable(R.drawable.d20_2);
        Drawable d20Three = context.getDrawable(R.drawable.d20_3);
        Drawable d20Four = context.getDrawable(R.drawable.d20_4);
        Drawable d20Five = context.getDrawable(R.drawable.d20_5);
        Drawable d20Six = context.getDrawable(R.drawable.d20_6);
        Drawable d20Seven = context.getDrawable(R.drawable.d20_7);
        Drawable d20Eight = context.getDrawable(R.drawable.d20_8);
        Drawable d20Nine = context.getDrawable(R.drawable.d20_9);
        Drawable d20Ten = context.getDrawable(R.drawable.d20_10);
        Drawable d20Eleven = context.getDrawable(R.drawable.d20_11);
        Drawable d20Twelve = context.getDrawable(R.drawable.d20_12);
        Drawable d20Thirteen = context.getDrawable(R.drawable.d20_13);
        Drawable d20Fourteen = context.getDrawable(R.drawable.d20_14);
        Drawable d20Fifteen = context.getDrawable(R.drawable.d20_15);
        Drawable d20Sixteen = context.getDrawable(R.drawable.d20_16);
        Drawable d20Seventeen = context.getDrawable(R.drawable.d20_17);
        Drawable d20Eighteen = context.getDrawable(R.drawable.d20_18);
        Drawable d20Nineteen = context.getDrawable(R.drawable.d20_19);
        Drawable d20Twenty = context.getDrawable(R.drawable.d20_20);

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
