package com.wankercraft.dice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityStatsMainScrenBinding;

public class StatsMainScren extends Activity {

    private TextView mTextView;
    private ActivityStatsMainScrenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityStatsMainScrenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}