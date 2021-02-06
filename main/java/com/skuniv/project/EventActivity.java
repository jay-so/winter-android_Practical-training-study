package com.skuniv.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity {

    ViewFlipper vFlipper3,vFlipper4;
    Button btnBack2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btnevent);

        vFlipper3 = findViewById(R.id.vFlipper3);
        vFlipper4 = findViewById(R.id.vFlipper4);

        btnBack2 = findViewById(R.id.btnBack2);


        vFlipper3.startFlipping();
        vFlipper4.startFlipping();

        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
