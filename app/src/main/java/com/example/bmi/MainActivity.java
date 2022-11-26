package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText weightet;
    EditText heightet;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weightet = findViewById(R.id.et_weight);
        heightet = findViewById(R.id.et_height);
    }
    public void calculatebmi(View view){
        String weight = weightet.getText().toString().trim();
        String height = heightet.getText().toString().trim();
        if(!weight.isEmpty()&&!height.isEmpty()){
            double temp1 = Double.parseDouble(weight);
            double temp2 = Double.parseDouble(height);
            double bmi = temp1/((temp2/100)*(temp2/100));
            Toast.makeText(this, "Your BMI is : "+bmi, Toast.LENGTH_SHORT).show();
        }
    }
}