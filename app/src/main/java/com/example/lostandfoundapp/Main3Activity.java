package com.example.lostandfoundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    static final String SHARED_PREFS = "shared prefs";

    public String name = "name";
    public String item = "item";
    public String desc = "desc";
    public String mob = "mob";

private Button submitbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        submitbutton = findViewById(R.id.submit);
        submitbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                submitbutton();

            }

        });
    }
    public void submitbutton()
    {
        name




    }
}
