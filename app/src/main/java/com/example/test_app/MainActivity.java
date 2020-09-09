package com.example.test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt=findViewById(R.id.fruit_text);
        txt.setSelected(true);
        TextView txt2=findViewById(R.id.beauty);
        txt2.setSelected(true);
        TextView txt3=findViewById(R.id.kitchen);
        txt3.setSelected(true);
        TextView txt4=findViewById(R.id.baby);
        txt4.setSelected(true);
        TextView txt5=findViewById(R.id.patanjali);
        txt5.setSelected(true);
        TextView txt6=findViewById(R.id.household);
        txt6.setSelected(true);
    }
}