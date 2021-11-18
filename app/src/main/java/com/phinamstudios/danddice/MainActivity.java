package com.phinamstudios.danddice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import com.phinamstudios.danddice.databinding.ActivityMainBinding;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        com.phinamstudios.danddice.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Button objects and listener declarations
        Button mButtonD4 = findViewById(R.id.button_d4);
        mButtonD4.setOnClickListener(this);
        Button mButtonD6 = findViewById(R.id.button_d6);
        mButtonD6.setOnClickListener(this);
        Button mButtonD8 = findViewById(R.id.button_d8);
        mButtonD8.setOnClickListener(this);
        Button mButtonD10 = findViewById(R.id.button_d10);
        mButtonD10.setOnClickListener(this);
        Button mButtonD12 = findViewById(R.id.button_d12);
        mButtonD12.setOnClickListener(this);
        Button mButtonD20 = findViewById(R.id.button_d20);
        mButtonD20.setOnClickListener(this);
        //Button mButtonD100 = findViewById(R.id.button_d100);
        //mButtonD100.setOnClickListener(this);
    }

    public void onClick(View v) {
        // intent object to pass die selection value to roll activity
        Intent intent = new Intent(getApplicationContext(), RollActivity.class);

        switch (v.getId()) {
            case R.id.button_d4: {
                // Open roll activity push value of "4" to roll activity intent
                intent.putExtra("key", 4);
                startActivity(intent);
                break;
            }
            case R.id.button_d6: {
                // Open roll activity push value of "6" to roll activity intent
                intent.putExtra("key", 6);
                startActivity(intent);
                break;
            }
            case R.id.button_d8: {
                // Open roll activity push value of "8" to roll activity intent
                intent.putExtra("key", 8);
                startActivity(intent);
                break;
            }
            case R.id.button_d10: {
                // Open roll activity push value of "10" to roll activity intent
                intent.putExtra("key", 10);
                startActivity(intent);
                break;
            }
            case R.id.button_d12: {
                // Open roll activity push value of "12" to roll activity intent
                intent.putExtra("key", 12);
                startActivity(intent);
                break;
            }
            case R.id.button_d20: {
                // Open roll activity push value of "20" to roll activity intent
                intent.putExtra("key", 20);
                startActivity(intent);
                break;
            }
            //case R.id.button_d100: {
            //    // Open roll activity push value of "100" to roll activity intent
            //    intent.putExtra("key", 100);
            //    startActivity(intent);
            //    break;
            //}
        }
    }
}