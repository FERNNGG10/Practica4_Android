package com.example.practica4_android;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
            //import android.net.Uri;
            //String url = "https://www.youtube.com/watch?v=wSb7mJbnHuk"; esto es implicito
           // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            //startActivity(intent);

        } else if (v.getId()==R.id.btn2) {

        }
        else if (v.getId()==R.id.btn3) {

        }
        else if (v.getId()==R.id.btn4) {

        }
        else if (v.getId()==R.id.btn5) {

            startActivity(new Intent(this,MainActivity2.class));
        }
    }
}