package com.wankercraft.dice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.wankercraft.dice.databinding.ActivityColourMenuBinding;

public class ColourMenu extends Activity implements View.OnClickListener {

    SharedPreferences settings;
    SharedPreferences.Editor settingsEditor;
    int colourSetting = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //private TextView mTextView;
        com.wankercraft.dice.databinding.ActivityColourMenuBinding binding = ActivityColourMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        settings = getSharedPreferences("userSettings", Context.MODE_PRIVATE);
        settingsEditor = settings.edit();
        // instantiating settings
        LoadSettings();
        //mTextView = binding.text;

        // instantiating buttons to select die colour
        ImageButton mColourButton1 = findViewById(R.id.imageButton2);
        mColourButton1.setOnClickListener(this);
        ImageButton mColourButton2 = findViewById(R.id.imageButton3);
        mColourButton2.setOnClickListener(this);
        ImageButton mColourButton3 = findViewById(R.id.imageButton4);
        mColourButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            //Select colour 1. Also the default setting
            case R.id.imageButton2:
                // save selection to variable/persistent setting
                SaveSetting("colour", 0);
                // Load Main activity, where number of sides is selected
                startActivity(new Intent(this, MainActivity.class));
                break;
            // Select colour 2
            case R.id.imageButton3:
                // save selection to variable/persistent setting
                SaveSetting("colour", 1);
                // Load Main activity, where number of sides is selected
                startActivity(new Intent(this, MainActivity.class));
                break;
            // Select colour 3
            case R.id.imageButton4:
                // save selection to variable/persistent setting
                SaveSetting("colour", 2);
                // Load Main activity, where number of sides is selected
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }

    //region SETTINGS

    private void SaveSetting(String setting, int value) {
        settingsEditor.putInt(setting, value);
        settingsEditor.apply();
    }

    private void LoadSettings() {
        colourSetting = settings.getInt("colour", 0);
    }

    //endregion

}