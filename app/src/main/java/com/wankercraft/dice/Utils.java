package com.wankercraft.dice;

import android.content.Context;
import android.content.SharedPreferences;

public class Utils {

    // List of shared pref keys
    // colour - value for colour chosen in colour selection menu
    // totalrolls - value for cumulative total of all rolls
    // totald4rolls thru totald20rolls - value for cumulative total of all d4-d20 rolls
    // total


    // This method saves a value to Shared preferences under the name userSettings
    public static void saveSetting(Context context, String key, int value) {
        SharedPreferences settings = context.getSharedPreferences("userSettings", Context.MODE_PRIVATE);
        SharedPreferences.Editor settingsEditor = settings.edit();
        settingsEditor.putInt(key, value).commit();
    }
    // This method loads settings from shared preferences under the name userSettings
    public static int loadSetting(Context context, String key) {
        SharedPreferences settings = context.getSharedPreferences("userSettings", Context.MODE_PRIVATE);
        return settings.getInt(key, 0);
    }

    // Method for incrementing the stored total for X die rolled
    // Whenever this is called it increments the stored key value by 1 adding to the cumulative total
    public static void incrementRollTotal(Context context, String key) {
        SharedPreferences rollData = context.getSharedPreferences("userRollData", Context.MODE_PRIVATE);
        SharedPreferences.Editor rollDataEditor = rollData.edit();
        int value = loadRollData(context, "key") + 1;
        rollDataEditor.putInt(key, value).commit();
    }

    // Method to load roll history data from shared prefs
    public static int loadRollData(Context context, String key) {
        SharedPreferences rollData = context.getSharedPreferences("userRollData", Context.MODE_PRIVATE);
        return rollData.getInt(key, 0);
    }

}
