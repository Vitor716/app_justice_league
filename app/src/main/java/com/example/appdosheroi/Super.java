package com.example.appdosheroi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Super extends AppCompatActivity {

    private Button btnWebsup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super);

        ImageButton btnVolt = (ImageButton) findViewById(R.id.bntVoltar);

        btnVolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irPrincipal = new Intent(Super.this,MainActivity.class);
                startActivity(irPrincipal);
            }
        });


        btnWebsup  = (Button) findViewById(R.id.btnMaisSup);

        btnWebsup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://justiceiros.fandom.com/pt-br/wiki/Superman")));
            }
        });
    }
}