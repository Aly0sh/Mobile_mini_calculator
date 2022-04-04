

package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mult = null;
    private Button plus = null;
    private TextView answer = null;
    private EditText a = null;
    private EditText b = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        a = findViewById(R.id.a);
        b = findViewById(R.id.b);

        plus = findViewById(R.id.plus);

        answer = findViewById(R.id.answer);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText("" + (Integer.parseInt(a.getText().toString()) + Integer.parseInt(b.getText().toString())));
            }
        });

        mult = findViewById(R.id.multiply);

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText("" + (Integer.parseInt(a.getText().toString()) * Integer.parseInt(b.getText().toString())));
            }
        }) ;
    }

}