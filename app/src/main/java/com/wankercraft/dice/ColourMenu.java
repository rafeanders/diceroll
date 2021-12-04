package com.wankercraft.dice;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityColourMenuBinding;

public class ColourMenu extends Activity implements View.OnClickListener {

    private TextView mTextView;
    private ActivityColourMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityColourMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
            //Select colour 1
            case R.id.imageButton2:
                // save selection to variable/persistent setting
                // Load Main activity, where number of sides is selected
                startActivity(new Intent(this, MainActivity.class));
                break;
            // Select colour 2
            case R.id.imageButton3:
                // save selection to variable/persistent setting
                // Load Main activity, where number of sides is selected
                break;
            // Select colour 3
            case R.id.imageButton4:
                // save selection to variable/persistent setting
                // Load Main activity, where number of sides is selected
                break;
        }
    }
}