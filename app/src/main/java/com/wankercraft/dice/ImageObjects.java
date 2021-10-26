package com.wankercraft.dice;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.contentcapture.DataShareWriteAdapter;

import androidx.core.content.res.ResourcesCompat;


public class ImageObjects extends Activity {

   static ImageObjects io = new ImageObjects();

    // Background image after die selection
    public static Drawable DefaultBG(int i) {
        Drawable d4BG = io.getDrawable(R.drawable.d4_4);
        Drawable d6BG = io.getDrawable(R.drawable.d6_6);
        Drawable d8BG = io.getDrawable(R.drawable.d8_8);
        Drawable d10BG = io.getDrawable(R.drawable.d10_10);
        Drawable d12BG = io.getDrawable(R.drawable.d12_12);
        Drawable d20BG = io.getDrawable(R.drawable.d20_20);

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

    //Animation to play while rolling
    public static Drawable Animation(int i) {
        Drawable d4Animation = io.getDrawable(R.drawable.d4_anim);
        Drawable d6Animation = io.getDrawable(R.drawable.d6_anim);
        Drawable d8Animation= io.getDrawable(R.drawable.d8_anim);
        Drawable d10Animation = io.getDrawable(R.drawable.d10_anim);
        Drawable d12Animation = io.getDrawable(R.drawable.d12_anim);
        Drawable d20Animation = io.getDrawable(R.drawable.d20_anim);

        switch (i) {
            case 20: {
                return d20Animation;
            }
            case 12: {
                return d12Animation;
            }
            case 10: {
                return d10Animation;
            }
            case 8: {
                return d8Animation;
            }
            case 6: {
                return d6Animation;
            }
            case 4: {
                return d4Animation;
            }
        } return null;
    }

    // D4 images
    public static Drawable D4Image(int i) {
        //Instance of this class to call non static method


        Drawable d4One = io.getDrawable(R.drawable.d4_1);
        Drawable d4Two = io.getDrawable(R.drawable.d4_2);
        Drawable d4Three = io.getDrawable(R.drawable.d4_3);
        Drawable d4Four = io.getDrawable(R.drawable.d4_4);

        switch (i) {
            case 4: {
                return d4Four;
                break;
            }
            case 3: {
                return d4Three;
                break;
            }
            case 2: {
                return d4Two;
                break;
            }
            case 1: {
                return d4One;
                break;
            }
        } return null;
    }

    //D6 images
    public static Drawable D6Image(int i) {
        Drawable d6One = io.getDrawable(R.drawable.d6_1);
        Drawable d6Two = io.getDrawable(R.drawable.d6_2);
        Drawable d6Three = io.getDrawable(R.drawable.d6_3);
        Drawable d6Four = io.getDrawable(R.drawable.d6_4);
        Drawable d6Five = io.getDrawable(R.drawable.d6_5);
        Drawable d6Six = io.getDrawable(R.drawable.d6_6);

        switch (i) {
            case 6: {
                return d6Six;
                break;
            }
            case 5: {
                return d6Five;
                break;
            }
            case 4: {
                return d6Four;
                break;
            }
            case 3: {
                return d6Three;
                break;
            }
            case 2: {
                return d6Two;
                break;
            }
            case 1: {
                return d6One;
                break;
            }
        } return null;
    }

    //D8 images
    public static Drawable D8Image(int i) {
        Drawable d8One = io.getDrawable(R.drawable.d8_1);
        Drawable d8Two = io.getDrawable(R.drawable.d8_2);
        Drawable d8Three = io.getDrawable(R.drawable.d8_3);
        Drawable d8Four = io.getDrawable(R.drawable.d8_4);
        Drawable d8Five = io.getDrawable(R.drawable.d8_50;
        Drawable d8Six = io.getDrawable(R.drawable.d8_6);
        Drawable d8Seven = io.getDrawable(R.drawable.d8_7);
        Drawable d8Eight = io.getDrawable(R.drawable.d8_8);

        switch (i) {
            case 8: {
                return d8Eight;
                break;
            }
            case 7: {
                return d8Seven;
                break;
            }
            case 6: {
                return d8Six;
                break;
            }
            case 5: {
                return d8Five;
                break;
            }
            case 4: {
                return d8Four;
                break;
            }
            case 3: {
                return d8Three;
                break;
            }
            case 2: {
                return d8Two;
                break;
            }
            case 1: {
                return d8One;
                break;
            }
        } return null;
    }

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

    //d100 images yeeeesh




}
