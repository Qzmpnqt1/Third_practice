package com.example.trpp_practice_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.trpp_practice_2.databinding.ActivitySecondBinding;

public class Second_activity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.secondButton.setOnClickListener(view -> {
            String dataToReturn = binding.secondEditText.getText().toString();

            Bundle resultData = new Bundle();
            resultData.putString("result_key", dataToReturn);

            setResult(RESULT_OK, getIntent().putExtras(resultData));
            finish();
        });
    }
}