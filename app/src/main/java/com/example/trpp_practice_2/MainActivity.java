package com.example.trpp_practice_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.trpp_practice_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    public static final int SECOND_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.mainTextView.setText(R.string.privetstvie);
        binding.mainImage.setImageResource(R.drawable.page1_img1);

        binding.mainButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Second_activity.class);
            startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE);
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == SECOND_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            String resultData = data.getStringExtra("result_key");
            binding.mainTextView.setText(resultData);
        }

    }

    /*binding.mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "Кнопка была нажата (программный способ)");
            }
        });*/

    /*public void onButtonClick(View view) {
        Log.d("MainActivity", "Кнопка была нажата (декларативный способ)");
    }*/

}
