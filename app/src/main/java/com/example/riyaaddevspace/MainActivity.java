package com.example.riyaaddevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Visitor;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Visitor = (EditText)findViewById(R.id.visitorName);
        Submit = (Button)findViewById(R.id.btnNext);
        Submit.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                getVisitor( Visitor.getText().toString());
            }
        });
    }

    private void getVisitor (String user){
        if((user.equals(""))){
            Toast.makeText(MainActivity.this, "Please enter a Valid Username", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            intent.putExtra("visitorWelcome", Visitor.getText().toString());
            startActivity(intent);
        }
    }



}