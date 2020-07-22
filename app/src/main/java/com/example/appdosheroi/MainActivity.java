package com.example.appdosheroi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btBat = (Button) findViewById(R.id.btnBat);
        Button btAqua = (Button) findViewById(R.id.btnAqua);
        Button btSup = (Button) findViewById(R.id.btnSup);
        Button btFla = (Button) findViewById(R.id.btnFla2);
        ImageButton btGit = (ImageButton) findViewById(R.id.bntGit);


        btGit  = (ImageButton) findViewById(R.id.bntGit);

        btGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Vitor716")));
            }
        });


        btBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irBat = new Intent(MainActivity.this,Batman.class);
                startActivity(irBat);
            }
        });

        btAqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irAqua = new Intent(MainActivity.this,Aquamen.class);
                startActivity(irAqua);
            }
        });

        btSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irSup = new Intent(MainActivity.this,Super.class);
                startActivity(irSup);
            }
        });

        btFla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irFla = new Intent(MainActivity.this,Flash.class);
                startActivity(irFla);
            }
        });
    }
}