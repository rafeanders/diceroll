package com.wankercraft.dice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wankercraft.dice.databinding.ActivityMainMenuBinding;

public class MainMenu extends Activity implements View.OnClickListener {

    private TextView mTextView;
    private ActivityMainMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.mainmenuHead;

        // Instantiate Buttons with onlcick listener
        Button mButtonSelectDie = findViewById(R.id.tosidesbutton);
        mButtonSelectDie.setOnClickListener(this);
        Button mButtonSelectColour = findViewById(R.id.todiestylebutton);
        mButtonSelectColour.setOnClickListener(this);
        Button mButtonFlipCoin = findViewById(R.id.tocoinflipbutton);
        mButtonFlipCoin.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            // Start main die roll activity
            case R.id.tosidesbutton: {
                startActivity(new Intent(this, MainActivity.class));
                break;
            }

            // Start colour/style selection activity
            case R.id.todiestylebutton: {
                startActivity(new Intent(this, ColourMenu.class));
                break;
            }
            // Start Coin Flip activity
            //case R.id.tocoinflipbutton: {
            //    startActivity(new Intent(this, CoinFlip.class));
            //    break;
        }
    }
}