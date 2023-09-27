package com.example.practica4_android;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2,btn3,btn4,implicito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        implicito = (Button) findViewById(R.id.btn5);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        implicito.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btn1) {


        } else if (v.getId()==R.id.btn2) {

            Intent abrircamara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(abrircamara);
        }
        else if (v.getId()==R.id.btn3) {

            Intent llamada = new Intent(Intent.ACTION_DIAL);
            startActivity(llamada);
        }
        else if (v.getId()==R.id.btn4) {

        }
        else if (v.getId()==R.id.btn5) {

            startActivity(new Intent(this,MainActivity2.class));
        }
    }
}