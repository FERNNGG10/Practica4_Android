package com.example.practica4_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.provider.MediaStore;
import android.net.Uri;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    Button btni1,btni2,btni3,btni4,btni5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btni1 = (Button) findViewById(R.id.btni1);
        btni2 = (Button) findViewById(R.id.btni2);
        btni3 = (Button) findViewById(R.id.btni3);
        btni4 = (Button) findViewById(R.id.btni4);
        btni5 = (Button) findViewById(R.id.btni5);
        btni1.setOnClickListener(this);
        btni2.setOnClickListener(this);
        btni3.setOnClickListener(this);
        btni4.setOnClickListener(this);
        btni5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btni1)
        {
            Intent texto = new Intent(Intent.ACTION_SEND);
            texto.setType("text/plain");
            texto.putExtra(Intent.EXTRA_TEXT, "q onda");
            if (texto.resolveActivity(getPackageManager()) != null) {
                startActivity(texto);
            } else {
                Toast.makeText(this, "no hay aplicaciones compatibles para abrir", Toast.LENGTH_SHORT).show();
            }
        }
        else if (v.getId()==R.id.btni2)
        {
            Intent gmail = new Intent(Intent.ACTION_SENDTO);
            gmail.setData(Uri.parse("mailto:fgolmos10@gmail.com"));
            gmail.putExtra(Intent.EXTRA_SUBJECT, "prueba de correo c");
            gmail.putExtra(Intent.EXTRA_TEXT, "esto es una prueba pa ver q jale");
            startActivity(gmail);

        }

        else if (v.getId()==R.id.btni3)
        {
            Intent abrirweb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/java/java_variable_types.htm"));
            startActivity(abrirweb);
        }
        else if (v.getId()==R.id.btni4)
        {

        }
        else if (v.getId()==R.id.btni5)
        {
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}