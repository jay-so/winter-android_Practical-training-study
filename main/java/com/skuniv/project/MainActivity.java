package com.skuniv.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper vFlipper,viewFlipper2;
    Button btnEvent,btn_Chart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEvent = findViewById(R.id.btnEvent);
        btn_Chart = findViewById(R.id.btn_Chart);

        /**
         * 뷰 플리퍼
         */

        vFlipper = findViewById(R.id.vFlipper);
        viewFlipper2 = findViewById(R.id.vFlipper2);
        vFlipper.startFlipping();
        viewFlipper2.startFlipping();

        /**
         * intro 화면
         */

        Intent intent = new Intent(MainActivity.this, IntroActivity.class);
        startActivity(intent);

        /**
         * Event
         */

        btnEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), EventActivity.class);
                startActivity(intent);
            }
        });
        /**
         * 무비차트
         */

        btn_Chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChartActivity.class);
                startActivity(intent);
            }
        });
    }
}