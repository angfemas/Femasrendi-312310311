package com.malikverse.malikverse_app_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Menghubungkan layout activity_main.xml

        //referensi button
        Button btnLed = findViewById(R.id.btnLed);
        Button btnFan = findViewById(R.id.btnFan);

        //ledddddd

        //set listener
        btnLed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pindah ke ledcontrol
                Intent intent = new Intent(MainActivity.this, LEDControlActivity.class);
                startActivity(intent);
            }
        });
        //end led

        //fan
        //set listener

        btnFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FANControlActivity.class);
                startActivity(intent);
            }
        });
    }
}
