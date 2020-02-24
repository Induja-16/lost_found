package com.example.lostandfoundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   private Button buttonlost,buttonfound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonlost =findViewById(R.id.lostbutton);
        buttonfound =findViewById(R.id.foundbutton);
        buttonlost.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                openActivity2();
            }

        });
        buttonfound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

    }
    public void openActivity3(){
        Intent intent1 = new Intent(this,Main3Activity.class);
        startActivity(intent1);
    }
    public void openActivity2(){
        Intent intent2 = new Intent(this,Main2Activity.class);
        startActivity(intent2);
    }
    }





