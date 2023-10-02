package com.example.practica4_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {
    TextView contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        contador = findViewById(R.id.contador);
        new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished)
            {
                contador.setText("Segundos: " + millisUntilFinished / 1000);

            }
            @Override
            public void onFinish()
            {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        }.start();
    }
}