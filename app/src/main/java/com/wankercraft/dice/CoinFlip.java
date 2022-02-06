package com.wankercraft.dice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityCoinFlipBinding;

public class CoinFlip extends Activity {

    private TextView mTextView;
    private ActivityCoinFlipBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCoinFlipBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}