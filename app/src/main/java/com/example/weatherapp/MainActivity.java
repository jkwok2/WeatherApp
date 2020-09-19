package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tempF;
    EditText tempC;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tempF = (EditText) findViewById(R.id.tempF);
        tempC = (EditText) findViewById(R.id.tempC);
        result = (TextView) findViewById(R.id.result);
        tempF.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String input = tempF.getText().toString();
                if (input.matches("[0-9]+")) {
                    int farTemp = Integer.parseInt(input);
                    int celTemp = (int) ((farTemp - 32) * 0.55);
                    result.setText("The temperature in Farenheit is: " + farTemp + "\n C: " + celTemp);
                } else {
                    result.setText("not a valid temp");
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        tempC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String input = tempC.getText().toString();
                if (input.matches("[0-9]+")) {
                    int celTemp = Integer.parseInt(input);
                    int farTemp = (int) ((celTemp * 1.8) + 32);
                    result.setText("F: " + farTemp + "\n C: " + celTemp);
                } else {
                    result.setText("not a valid temp");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}