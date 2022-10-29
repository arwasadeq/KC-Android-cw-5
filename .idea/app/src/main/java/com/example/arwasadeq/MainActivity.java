package com.example.arwasadeq;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText firstnumber = findViewById(R.id.editTextTextPersonName);
        EditText secondnomber = findViewById(R.id.editTextTextPersonName2);
        Button calculate = findViewById(R.id.button);
        TextView resolt = findViewById(R.id.textView2);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = firstnumber.getText().toString();
                String b = secondnomber.getText().toString();

                int x =Integer.parseInt(a);
                int y =Integer.parseInt(b);
                int z = x + y;
                resolt.setText(z);



            }
        });
    }
}