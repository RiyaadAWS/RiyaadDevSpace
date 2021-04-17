package com.example.riyaaddevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private String Visitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // captures visitors name from the main activity and displays it in the visitorName textview
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            Visitor = extras.getString( "visitorWelcome");
            TextView UserWelcome = (TextView) findViewById(R.id.visitorName);
            UserWelcome.setText(  "Dear " + Visitor );
        }


        Button btn = findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn = findViewById(R.id.btnAbout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, About.class);
                startActivity(intent);
            }
        });

        btn = findViewById(R.id.btnCalc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Calculate.class);
                startActivity(intent);
            }
        });

        btn = findViewById(R.id.btnProfile);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}