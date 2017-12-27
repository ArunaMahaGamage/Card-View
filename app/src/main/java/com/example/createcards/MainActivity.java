package com.example.createcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initilize();
    }

    public void initilize() {
        cv_main = (CardView) findViewById(R.id.cv_main);

        cv_main.setCardElevation(50);
        cv_main.setRadius(90);
    }
}
