package com.wankercraft.dice;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityColourMenuBinding;

public class ColourMenu extends Activity implements View.OnClickListener {

    private TextView mTextView;
    private ActivityColourMenuBinding binding;
    SharedPreferences settings = getSharedPreferences("colourSetting", Activity.MODE_PRIVATE);
    SharedPreferences.Editor settingsEditor = settings.edit();
    private int colourSetting = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityColourMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // instantiating settings
        LoadSettings();

        mTextView = binding.text;

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
                SaveSetting("colourSetting", 0);
                // Load Main activity, where number of sides is selected
                startActivity(new Intent(this, MainActivity.class));
                break;
            // Select colour 2
            case R.id.imageButton3:
                // save selection to variable/persistent setting
                SaveSetting("colourSetting", 1);
                // Load Main activity, where number of sides is selected
                startActivity(new Intent(this, MainActivity.class));
                break;
            // Select colour 3
            case R.id.imageButton4:
                // save selection to variable/persistent setting
                SaveSetting("colourSetting", 2);
                // Load Main activity, where number of sides is selected
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }

    private void SaveSetting(String setting, int value) {
        settingsEditor.putInt(setting, value);
        settingsEditor.commit();
    }

    private void LoadSettings() {
        colourSetting = settings.getInt("colourSetting", 0);
    }

}