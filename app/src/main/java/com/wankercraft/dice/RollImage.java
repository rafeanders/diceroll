package com.wankercraft.dice;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;

//region TO-DO:

// TO-DO:
// This class needs to return an image based on die colour saved in shared preferences.
// Need to add all the new images etc
// replacing d4 and d6 with correct color and adding two other color sets.

//endregion

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
        colourSetting = settings.getInt("colour", 0); // Assigning value from shared settings
    }

    //region Main Drawable Return Methods

    // main method called to return the background drawable recourse
    public Drawable StartBG(int i) {
        switch (colourSetting) {
            case 0: {
                return GreenBlackBG(i); //rename GreenBlackBG
            }
            case 1: {
                return BlackBG(i);
            }
            case 2: {
                return GreenBG(i);
            }
        }return null;
    }

    public Drawable D4Image(int i) {
        switch (colourSetting) {
            case 0: {
                return D4GreenBlack(i); //return green black die image
            }
            case 1: {
                return D4Black(i); // return black die image
            }
            case 2: {
                return D4Green(i); // return green die image
            }
        }return null;
    }

    public Drawable D6Image(int i) {
        switch (colourSetting) {
            case 0: {
                return D6GreenBlack(i);
            }
            case 1: {
                return D6Black(i);
            }
            case 2: {
                return D6Green(i);
            }
        }return null;
    }

    public Drawable D8Image(int i) {
        switch (colourSetting) {
            case 0: {
                return D8GreenBlack(i);
            }
            case 1: {
                return D8Black(i);
            }
            case 2: {
                return D8Green(i);
            }
        }return null;
    }

    public Drawable D10Image(int i) {
        switch (colourSetting) {
            case 0: {
                return D10GreenBlack(i);
            }
            case 1: {
                return D10Black(i);
            }
            case 2: {
                return D10Green(i);
            }
        }return null;
    }

    public Drawable D12Image(int i) {
        switch (colourSetting) {
            case 0: {
                return D12GreenBlack(i);
            }
            case 1: {
                return D12Black(i);
            }
            case 2: {
                return D12Green(i);
            }
        }return null;
    }

    public Drawable D20Image(int i) {
        switch (colourSetting) {
            case 0: {
                return D20GreenBlack(i);
            }
            case 1: {
                return D20Black(i);
            }
            case 2: {
                return D20Green(i);
            }
        }return null;
    }

    //endregion

    //region Background Images

    // this method returns default background for green/black colour die
    // rename GreenBlackBG
    public Drawable GreenBlackBG(int i) {
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

    // this method returns default background for black colour die
    public Drawable BlackBG(int i) {
        //Drawable references to image assets for black die colour
        Drawable d4BG_B = context.getDrawable(R.drawable.d4_4_black);
        Drawable d6BG_B = context.getDrawable(R.drawable.d6_6_black);
        Drawable d8BG_B = context.getDrawable(R.drawable.d8_8_black);
        Drawable d10BG_B = context.getDrawable(R.drawable.d10_10_black);
        Drawable d12BG_B= context.getDrawable(R.drawable.d12_12_black);
        Drawable d20BG_B = context.getDrawable(R.drawable.d20_20_black);
        // Logic to return correct image based which number sided die the user selected, and the colour chosen in settings
        switch (i) {
            case 20: {
                return d20BG_B;
            }
            case 12: {
                return d12BG_B;
            }
            case 10: {
                return d10BG_B;
            }
            case 8: {
                return d8BG_B;
            }
            case 6: {
                return d6BG_B;
            }
            case 4: {
                return d4BG_B;
            }
        } return null;
    }

    // this method returns default background for green colour die
    public Drawable GreenBG(int i) {
        //Drawable reference to image assets for green die colour
        Drawable d4BG_G = context.getDrawable(R.drawable.d4_4_green);
        Drawable d6BG_G = context.getDrawable(R.drawable.d6_6_green);
        Drawable d8BG_G = context.getDrawable(R.drawable.d8_8_green);
        Drawable d10BG_G = context.getDrawable(R.drawable.d10_10_green);
        Drawable d12BG_G = context.getDrawable(R.drawable.d12_12_green);
        Drawable d20BG_G = context.getDrawable(R.drawable.d20_20_green);

        // Logic to return correct image based which number sided die the user selected, and the colour chosen in settings
        switch (i) {
            case 20: {
                return d20BG_G;
            }
            case 12: {
                return d12BG_G;
            }
            case 10: {
                return d10BG_G;
            }
            case 8: {
                return d8BG_G;
            }
            case 6: {
                return d6BG_G;
            }
            case 4: {
                return d4BG_G;
            }
        } return null;
    }
    //endregion

    //region D4 Die Images

    // rename D4GreenBlack
    //experimenting with if to handle colour setting
    public Drawable D4GreenBlack(int i) {
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

    // returns black die image drawable object
    public Drawable D4Black(int i) {
        Drawable d4One = context.getDrawable(R.drawable.d4_1_black);
        Drawable d4Two = context.getDrawable(R.drawable.d4_2_black);
        Drawable d4Three = context.getDrawable(R.drawable.d4_3_black);
        Drawable d4Four = context.getDrawable(R.drawable.d4_4_black);
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

    // Returns green die image drawable object
    public Drawable D4Green(int i) {
        Drawable d4One = context.getDrawable(R.drawable.d4_1_green);
        Drawable d4Two = context.getDrawable(R.drawable.d4_2_green);
        Drawable d4Three = context.getDrawable(R.drawable.d4_3_green);
        Drawable d4Four = context.getDrawable(R.drawable.d4_4_green);
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

    //endregion

    //region D6 Die Images

    public Drawable D6GreenBlack(int i) {
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

    public Drawable D6Black(int i) {
        Drawable d6One = context.getDrawable(R.drawable.d6_1_black);
        Drawable d6Two = context.getDrawable(R.drawable.d6_2_black);
        Drawable d6Three = context.getDrawable(R.drawable.d6_3_black);
        Drawable d6Four = context.getDrawable(R.drawable.d6_4_black);
        Drawable d6Five = context.getDrawable(R.drawable.d6_5_black);
        Drawable d6Six = context.getDrawable(R.drawable.d6_6_black);

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

    public Drawable D6Green(int i) {
        Drawable d6One = context.getDrawable(R.drawable.d6_1_green);
        Drawable d6Two = context.getDrawable(R.drawable.d6_2_green);
        Drawable d6Three = context.getDrawable(R.drawable.d6_3_green);
        Drawable d6Four = context.getDrawable(R.drawable.d6_4_green);
        Drawable d6Five = context.getDrawable(R.drawable.d6_5_green);
        Drawable d6Six = context.getDrawable(R.drawable.d6_6_green);

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

    //endregion

    //region D8 Die Images

    // rename D8GreenBlack
    public Drawable D8GreenBlack(int i) {
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

    public Drawable D8Black(int i) {
        Drawable d8One = context.getDrawable(R.drawable.d8_1_black);
        Drawable d8Two = context.getDrawable(R.drawable.d8_2_black);
        Drawable d8Three = context.getDrawable(R.drawable.d8_3_black);
        Drawable d8Four = context.getDrawable(R.drawable.d8_4_black);
        Drawable d8Five = context.getDrawable(R.drawable.d8_5_black);
        Drawable d8Six = context.getDrawable(R.drawable.d8_6_black);
        Drawable d8Seven = context.getDrawable(R.drawable.d8_7_black);
        Drawable d8Eight = context.getDrawable(R.drawable.d8_8_black);

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

    public Drawable D8Green(int i) {
        Drawable d8One = context.getDrawable(R.drawable.d8_1_green);
        Drawable d8Two = context.getDrawable(R.drawable.d8_2_green);
        Drawable d8Three = context.getDrawable(R.drawable.d8_3_green);
        Drawable d8Four = context.getDrawable(R.drawable.d8_4_green);
        Drawable d8Five = context.getDrawable(R.drawable.d8_5_green);
        Drawable d8Six = context.getDrawable(R.drawable.d8_6_green);
        Drawable d8Seven = context.getDrawable(R.drawable.d8_7_green);
        Drawable d8Eight = context.getDrawable(R.drawable.d8_8_green);

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

    //endregion

    //region D10 Die Images

    // rename D10GreenBlack
    public Drawable D10GreenBlack(int i) {
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

    public Drawable D10Black(int i) {
        Drawable d10One = context.getDrawable(R.drawable.d10_1_black);
        Drawable d10Two = context.getDrawable(R.drawable.d10_2_black);
        Drawable d10Three = context.getDrawable(R.drawable.d10_3_black);
        Drawable d10Four = context.getDrawable(R.drawable.d10_4_black);
        Drawable d10Five = context.getDrawable(R.drawable.d10_5_black);
        Drawable d10Six = context.getDrawable(R.drawable.d10_6_black);
        Drawable d10Seven = context.getDrawable(R.drawable.d10_7_black);
        Drawable d10Eight = context.getDrawable(R.drawable.d10_8_black);
        Drawable d10Nine = context.getDrawable(R.drawable.d10_9_black);
        Drawable d10Ten = context.getDrawable(R.drawable.d10_10_black);

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

    public Drawable D10Green(int i) {
        Drawable d10One = context.getDrawable(R.drawable.d10_1_green);
        Drawable d10Two = context.getDrawable(R.drawable.d10_2_green);
        Drawable d10Three = context.getDrawable(R.drawable.d10_3_green);
        Drawable d10Four = context.getDrawable(R.drawable.d10_4_green);
        Drawable d10Five = context.getDrawable(R.drawable.d10_5_green);
        Drawable d10Six = context.getDrawable(R.drawable.d10_6_green);
        Drawable d10Seven = context.getDrawable(R.drawable.d10_7_green);
        Drawable d10Eight = context.getDrawable(R.drawable.d10_8_green);
        Drawable d10Nine = context.getDrawable(R.drawable.d10_9_green);
        Drawable d10Ten = context.getDrawable(R.drawable.d10_10_green);

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

    //endregion

    //region D12 Die Images

    // rename D12GreenBlack
    public Drawable D12GreenBlack(int i) {
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

    public Drawable D12Black(int i) {
        Drawable d12One = context.getDrawable(R.drawable.d12_1_black);
        Drawable d12Two = context.getDrawable(R.drawable.d12_2_black);
        Drawable d12Three = context.getDrawable(R.drawable.d12_3_black);
        Drawable d12Four = context.getDrawable(R.drawable.d12_4_black);
        Drawable d12Five = context.getDrawable(R.drawable.d12_5_black);
        Drawable d12Six = context.getDrawable(R.drawable.d12_6_black);
        Drawable d12Seven = context.getDrawable(R.drawable.d12_7_black);
        Drawable d12Eight = context.getDrawable(R.drawable.d12_8_black);
        Drawable d12Nine = context.getDrawable(R.drawable.d12_9_black);
        Drawable d12Ten = context.getDrawable(R.drawable.d12_10_black);
        Drawable d12Eleven = context.getDrawable(R.drawable.d12_11_black);
        Drawable d12Twelve = context.getDrawable(R.drawable.d12_12_black);

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
    public Drawable D12Green(int i) {
        Drawable d12One = context.getDrawable(R.drawable.d12_1_green);
        Drawable d12Two = context.getDrawable(R.drawable.d12_2_green);
        Drawable d12Three = context.getDrawable(R.drawable.d12_3_green);
        Drawable d12Four = context.getDrawable(R.drawable.d12_4_green);
        Drawable d12Five = context.getDrawable(R.drawable.d12_5_green);
        Drawable d12Six = context.getDrawable(R.drawable.d12_6_green);
        Drawable d12Seven = context.getDrawable(R.drawable.d12_7_green);
        Drawable d12Eight = context.getDrawable(R.drawable.d12_8_green);
        Drawable d12Nine = context.getDrawable(R.drawable.d12_9_green);
        Drawable d12Ten = context.getDrawable(R.drawable.d12_10_green);
        Drawable d12Eleven = context.getDrawable(R.drawable.d12_11_green);
        Drawable d12Twelve = context.getDrawable(R.drawable.d12_12_green);

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
    //endregion

    //region D20 Die Images

    // rename D20GreenBlack
    public Drawable D20GreenBlack(int i) {
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

    public Drawable D20Black(int i) {
        Drawable d20One = context.getDrawable(R.drawable.d20_1_black);
        Drawable d20Two = context.getDrawable(R.drawable.d20_2_black);
        Drawable d20Three = context.getDrawable(R.drawable.d20_3_black);
        Drawable d20Four = context.getDrawable(R.drawable.d20_4_black);
        Drawable d20Five = context.getDrawable(R.drawable.d20_5_black);
        Drawable d20Six = context.getDrawable(R.drawable.d20_6_black);
        Drawable d20Seven = context.getDrawable(R.drawable.d20_7_black);
        Drawable d20Eight = context.getDrawable(R.drawable.d20_8_black);
        Drawable d20Nine = context.getDrawable(R.drawable.d20_9_black);
        Drawable d20Ten = context.getDrawable(R.drawable.d20_10_black);
        Drawable d20Eleven = context.getDrawable(R.drawable.d20_11_black);
        Drawable d20Twelve = context.getDrawable(R.drawable.d20_12_black);
        Drawable d20Thirteen = context.getDrawable(R.drawable.d20_13_black);
        Drawable d20Fourteen = context.getDrawable(R.drawable.d20_14_black);
        Drawable d20Fifteen = context.getDrawable(R.drawable.d20_15_black);
        Drawable d20Sixteen = context.getDrawable(R.drawable.d20_16_black);
        Drawable d20Seventeen = context.getDrawable(R.drawable.d20_17_black);
        Drawable d20Eighteen = context.getDrawable(R.drawable.d20_18_black);
        Drawable d20Nineteen = context.getDrawable(R.drawable.d20_19_black);
        Drawable d20Twenty = context.getDrawable(R.drawable.d20_20_black);

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
    public Drawable D20Green(int i) {
        Drawable d20One = context.getDrawable(R.drawable.d20_1_green);
        Drawable d20Two = context.getDrawable(R.drawable.d20_2_green);
        Drawable d20Three = context.getDrawable(R.drawable.d20_3_green);
        Drawable d20Four = context.getDrawable(R.drawable.d20_4_green);
        Drawable d20Five = context.getDrawable(R.drawable.d20_5_green);
        Drawable d20Six = context.getDrawable(R.drawable.d20_6_green);
        Drawable d20Seven = context.getDrawable(R.drawable.d20_7_green);
        Drawable d20Eight = context.getDrawable(R.drawable.d20_8_green);
        Drawable d20Nine = context.getDrawable(R.drawable.d20_9_green);
        Drawable d20Ten = context.getDrawable(R.drawable.d20_10_green);
        Drawable d20Eleven = context.getDrawable(R.drawable.d20_11_green);
        Drawable d20Twelve = context.getDrawable(R.drawable.d20_12_green);
        Drawable d20Thirteen = context.getDrawable(R.drawable.d20_13_green);
        Drawable d20Fourteen = context.getDrawable(R.drawable.d20_14_green);
        Drawable d20Fifteen = context.getDrawable(R.drawable.d20_15_green);
        Drawable d20Sixteen = context.getDrawable(R.drawable.d20_16_green);
        Drawable d20Seventeen = context.getDrawable(R.drawable.d20_17_green);
        Drawable d20Eighteen = context.getDrawable(R.drawable.d20_18_green);
        Drawable d20Nineteen = context.getDrawable(R.drawable.d20_19_green);
        Drawable d20Twenty = context.getDrawable(R.drawable.d20_20_green);

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

    //endregion
}
