package com.wankercraft.dice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityStatsMainScreenBinding;

public class StatsMainScreen extends Activity {

    //private TextView mTextView;
    private ActivityStatsMainScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityStatsMainScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //mTextView = binding.totalRollsValue;
        TextView mRollsValue = findViewById(R.id.totalRollsValue);
        mRollsValue.setText(Utils.loadRollData(this, "totalrolls"));
    }
}