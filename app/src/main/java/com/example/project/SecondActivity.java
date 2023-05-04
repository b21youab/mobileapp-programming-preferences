package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private final String key = String.valueOf(R.string.inputData);
    private Button button;
    private SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedPreferences = getSharedPreferences(key, MODE_PRIVATE);

        button = findViewById(R.id.secondButtonsave);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retainData();
                finish();


            }
        });
    }


    private void retainData() {
        EditText userInputEditText = findViewById(R.id.showInput);
        String userInputData = userInputEditText.getText().toString();

    //    SharedPreferences sharedPreferences = getSharedPreferences("inputData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(key, userInputData);
        String key = "sharedPreferences";

        editor.apply();
    }

}