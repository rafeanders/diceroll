package com.wankercraft.dice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
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
    }

    @Override
    public void onClick(View v) {

    }
}