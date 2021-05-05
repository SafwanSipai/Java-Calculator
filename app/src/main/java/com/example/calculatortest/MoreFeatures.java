package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MoreFeatures extends AppCompatActivity {

    private Button btnLength, btnMass, btnTemperature, btnArea, btnVolume, btnBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_features);

        getSupportActionBar().setTitle("Conversion");
        btnLength= (Button) findViewById(R.id.length);
        btnMass= (Button) findViewById(R.id.mass);
        btnTemperature= (Button) findViewById(R.id.temperature);
        btnArea = (Button) findViewById(R.id.area);
        btnVolume= (Button) findViewById(R.id.volume);
        btnBMI= (Button) findViewById(R.id.bmi);

        btnLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreFeatures.this, Length_Converter.class);

                startActivity(intent);
            }
        });

        btnMass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreFeatures.this, Mass_Converter.class);

                startActivity(intent);
            }
        });
        btnTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreFeatures.this, Temperature_Converter.class);

                startActivity(intent);
            }
        });
        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreFeatures.this, Area_Converter.class);

                startActivity(intent);
            }
        });
        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreFeatures.this, Volume_Converter.class);

                startActivity(intent);
            }
        });
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreFeatures.this, BMI_Converter.class);

                startActivity(intent);
            }
        });
    }
}