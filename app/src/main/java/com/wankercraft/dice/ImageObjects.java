package com.wankercraft.dice;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.contentcapture.DataShareWriteAdapter;

import androidx.core.content.res.ResourcesCompat;


public class ImageObjects extends Activity {

    private Resources res = getResources();

    // Background image after die selection
    public static Drawable DefaultBG(int i) {
        Drawable d4BG = R.id.d4_4;
        Drawable d6BG = R.id.d6_6;
        Drawable d8BG = R.id.d8_8;
        Drawable d10BG = R.id.d10_10;
        Drawable d12BG = R.id.d12_12;
        Drawable d20BG = R.id.d20_20;

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
        Drawable d4Animation = R.id.d4_anim;
        Drawable d6Animation = R.id.d6_anim;
        Drawable d8Animation= R.id.d8_anim;
        Drawable d10Animation = R.id.d10_anim;
        Drawable d12Animation = R.id.d12_anim;
        Drawable d20Animation = R.id.d20_anim;

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

        Drawable d4One = R.drawable.d4_1;
        Drawable d4Two = R.id.d4_2;
        Drawable d4Three = R.id.d4_3;
        Drawable d4Four = R.id.d4_4;

        switch (i) {
            case 5: {
                return d4Animation;
                break;
            }
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
        Drawable d6One = R.id.d6_1;
        Drawable d6Two = R.id.d6_2;
        Drawable d6Three = R.id.d6_3;
        Drawable d6Four = R.id.d6_4;
        Drawable d6Five = R.id.d6_5;
        Drawable d6Six = R.id.d6_6;

        switch (i) {
            case 7: {
                return d6Animation;
                break;
            }
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
        Drawable d8One = R.id.d8_1;
        Drawable d8Two = R.id.d8_2;
        Drawable d8Three = R.id.d8_3;
        Drawable d8Four = R.id.d8_4;
        Drawable d8Five = R.id.d8_5;
        Drawable d8Six = R.id.d8_6;
        Drawable d8Seven = R.id.d8_7;
        Drawable d8Eight = R.id.d8_8;

        switch (i) {
            case 9: {
                return d8Animation;
                break;
            }
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
        Drawable d10One = R.id.d10_1;
        Drawable d10Two = R.id.d10_2;
        Drawable d10Three = R.id.d10_3;
        Drawable d10Four = R.id.d10_4;
        Drawable d10Five = R.id.d10_5;
        Drawable d10Six = R.id.d10_6;
        Drawable d10Seven = R.id.d10_7;
        Drawable d10Eight = R.id.d10_8;
        Drawable d10Nine = R.id.d10_9;
        Drawable d10Ten = R.id.d10_10;

        switch (i) {
            case 11: {
                return d10Animation;
                break;
            }
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
        Drawable d12One = R.id.d12_1;
        Drawable d12Two = R.id.d12_2;
        Drawable d12Three = R.id.d12_3;
        Drawable d12Four = R.id.d12_4;
        Drawable d12Five = R.id.d12_5;
        Drawable d12Six = R.id.d12_6;
        Drawable d12Seven = R.id.d12_7;
        Drawable d12Eight = R.id.d12_8;
        Drawable d12Nine = R.id.d12_9;
        Drawable d12Ten = R.id.d12_10;
        Drawable d12Eleven = R.id.d12_11;
        Drawable d12Twelve = R.id.d12_12;

        switch (i) {
            case 13: {
                return d12Animation;
                break;
            }
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
        Drawable d20One = R.id.d20_1;
        Drawable d20Two = R.id.d20_2;
        Drawable d20Three = R.id.d20_3;
        Drawable d20Four = R.id.d20_4;
        Drawable d20Five = R.id.d20_5;
        Drawable d20Six = R.id.d20_6;
        Drawable d20Seven = R.id.d20_7;
        Drawable d20Eight = R.id.d20_8;
        Drawable d20Nine = R.id.d20_9;
        Drawable d20Ten = R.id.d20_10;
        Drawable d20Eleven = R.id.d20_11;
        Drawable d20Twelve = R.id.d20_12;
        Drawable d20Thirteen = R.id.d20_13;
        Drawable d20Fourteen = R.id.d20_14;
        Drawable d20Fifteen = R.id.d20_15;
        Drawable d20Sixteen = R.id.d20_16;
        Drawable d20Seventeen = R.id.d20_17;
        Drawable d20Eighteen = R.id.d20_18;
        Drawable d20Nineteen = R.id.d20_19;
        Drawable d20Twenty = R.id.d20_20;

        switch (i) {
            case 21: {
                return d20Animation;
                break;
            }
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
