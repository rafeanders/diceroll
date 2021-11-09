package com.wankercraft.dice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityD100Binding;

public class D100Activity extends Activity {

    private TextView mTextView;
    private ActivityD100Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityD100Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}