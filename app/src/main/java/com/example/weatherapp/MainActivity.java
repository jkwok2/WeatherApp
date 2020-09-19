package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tempF;
    Button button;
    TextView tempC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempF = (EditText) findViewById(R.id.tempF);
        button = (Button) findViewById(R.id.convertButton);
        tempC = (TextView) findViewById(R.id.tempC);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                String input = tempF.getText().toString();
                int temp = Integer.parseInt(input);
                float celsius = (temp - 32) * ((float) 5 / (float) 9);
                tempC.setText(celsius + " degrees C");

            }
        });






    }
}