package com.wankercraft.dice;

import android.content.Context;
import android.content.SharedPreferences;

public class Utils {

    // This method saves a value to Shared preferences under the name userSettings
    public static void SaveSetting(Context context, String key, int value) {
        SharedPreferences settings = context.getSharedPreferences("userSettings", Context.MODE_PRIVATE);
        SharedPreferences.Editor settingsEditor = settings.edit();
        settingsEditor.putInt(key, value);
        settingsEditor.commit();
    }
    // This method loads settings from shared preferences under the name userSettings
    public static int LoadSetting(Context context, String key) {
        SharedPreferences settings = context.getSharedPreferences("userSettings", Context.MODE_PRIVATE);
        return settings.getInt(key, 0);
    }

    // Method for saving roll history to shared preferences.
    public static void SaveRollData(Context context, String key, int value) {
        SharedPreferences rollData = context.getSharedPreferences("userRollData", Context.MODE_PRIVATE);
        SharedPreferences.Editor rollDataEditor = rollData.edit();
        rollDataEditor.putInt(key, value);
        rollDataEditor.commit();
    }

    // Method to load roll history data from shared prefs
    public static int LoadRollData(Context context, String key) {
        SharedPreferences rollData = context.getSharedPreferences("userRollData", Context.MODE_PRIVATE);
        return rollData.getInt(key, 0);
    }

}
