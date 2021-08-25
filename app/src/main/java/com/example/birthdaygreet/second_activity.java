package com.example.birthdaygreet;

import static com.example.birthdaygreet.R.id.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras=getIntent().getExtras();
        String str2=extras.getString("value");
        TextView textView=findViewById(R.id.textView);
        textView.setText("happy birthday\n"+str2);

    }
    }
