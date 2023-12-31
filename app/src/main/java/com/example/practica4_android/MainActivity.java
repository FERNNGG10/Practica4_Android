package com.example.practica4_android;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2,btn3,btn4,implicitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        implicitos = (Button) findViewById(R.id.btn5);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        implicitos.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btn1) {

            Intent llamada = new Intent(Intent.ACTION_DIAL);
            llamada.setData(Uri.parse("tel:8713267638"));
            startActivity(llamada);


        } else if (v.getId()==R.id.btn2) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "Este es un mensaje de ejemplo.");
            intent.setPackage("com.whatsapp");
            startActivity(intent);

        }
        else if (v.getId()==R.id.btn3) {

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://docs.adonisjs.com/guides/middleware"));
            intent.setPackage("com.opera.gx");
            startActivity(intent);
        }
        else if (v.getId()==R.id.btn4) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/your_page_id"));
            startActivity(intent);

        }
        else if (v.getId()==R.id.btn5) {
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);

        }

    }
}