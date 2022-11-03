package com.example.arwasadeq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText nametext = findViewById(R.id.editTextTextPersonName3);
        EditText agetext = findViewById(R.id.editTextTextPersonName4);
        EditText longtext = findViewById(R.id.editTextTextPersonName5)
        Button next = findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string name, age, long;
                name = nametext.getText().toString();
                age = agetext.getText().toString();
                long = longtext.getText().toString();

                Intent key = new Intent(MainActivity2.this, MainActivity3.class);
                key.putExtra("n", name);
                key.putExtra("a", age);
                key.putExtra("L", long);
                startActivity(key);


            }
        });
    }
