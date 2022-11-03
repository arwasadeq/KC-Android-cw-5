package com.example.arwasadeq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView nametext = findViewById(R.id.textView6);
        TextView agetext = findViewById(R.id.textView);
        TextView longtext = findViewById(R.id.textView10);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("n");
        String age = bundle.getString("a");
        String length = bundle.getString("L");
        nametext.setText(name);
        nametext.setText(age);
        nametext.setText(length);



    }
}