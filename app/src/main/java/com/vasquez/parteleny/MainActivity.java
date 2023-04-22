package com.vasquez.parteleny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView et1;
    private TextView et2;
    private TextView et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (TextView) findViewById(R.id.text1);
        et2 = (TextView) findViewById(R.id.text2);
        et3 = (TextView) findViewById(R.id.text3);




    }
}