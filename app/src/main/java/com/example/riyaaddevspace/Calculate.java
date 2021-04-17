package com.example.riyaaddevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    private Button calculate, clear, back;
    private EditText input, output;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        input = (EditText) findViewById(R.id.input);
        output = (EditText) findViewById(R.id.output);
        total = (TextView) findViewById(R.id.txtOutput);
        calculate = (Button) findViewById(R.id.btnCalc);
        clear = (Button) findViewById(R.id.btnClear);
        back = (Button) findViewById(R.id.btnBack);


        //takes the values in the textview and performs the calculation
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().length() == 0) {
                    input.setText("0");
                }

                if (output.getText().toString().length() == 0) {
                    output.setText("0");
                }

                double num1 = Integer.parseInt(input.getText().toString());
                double num2 = Integer.parseInt(output.getText().toString());
                double num3 = 1;
                double sum = num1 * num2 / num3;

                total.setText(String.valueOf(sum));
            }
        });

        // clears all textviews and edittext
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total.setText("0");
                input.setText("");
                output.setText("");
            }
        });

        // Back button
        Button back = findViewById(R.id.btnBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calculate.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}