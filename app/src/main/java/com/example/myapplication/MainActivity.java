

package com.example.myapplication;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mult;
    private Button plus;
    private TextView answer;
    private EditText a;
    private EditText b;
    private Integer a1 = null;
    private Integer b1 = null;

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
                if (a.getText().toString().isEmpty()){
                    answer.setText("Please enter first number");
                    answer.setTextColor(Color.RED);
                }
                else if (b.getText().toString().isEmpty()){
                    answer.setText("Please enter second number");
                    answer.setTextColor(Color.RED);
                } else {
                    a1 = Integer.parseInt(a.getText().toString());
                    b1 = Integer.parseInt(b.getText().toString());
                    answer.setTextColor(Color.BLACK);
                    answer.setText(a1 + b1 + "");
                }
            }
        });

        mult = findViewById(R.id.multiply);

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.getText().toString().isEmpty()){
                    answer.setText("Please enter first number");
                    answer.setTextColor(Color.RED);
                }
                else if (b.getText().toString().isEmpty()){
                    answer.setText("Please enter second number");
                    answer.setTextColor(Color.RED);
                } else {
                    a1 = Integer.parseInt(a.getText().toString());
                    b1 = Integer.parseInt(b.getText().toString());
                    answer.setTextColor(Color.BLACK);
                    answer.setText(a1 * b1 + "");
                }
            }
        }) ;
    }

}