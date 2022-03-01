package com.wankercraft.dice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityCoinflipBinding;

public class CoinflipActivity extends Activity {

    private TextView mTextView;
    private ActivityCoinflipBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCoinflipBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}