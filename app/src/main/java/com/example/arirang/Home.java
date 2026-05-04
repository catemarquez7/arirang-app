package com.example.arirang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);


        TextView txtResultado = findViewById(R.id.mostrarNombre);
        String nombre = getIntent().getStringExtra("nombre");
        String email = getIntent().getStringExtra("email");
        txtResultado.setText("Hola, " + nombre + "!");

        Button botonArticulo1 = findViewById(R.id.botonArticulo1);
        Button botonArticulo2 = findViewById(R.id.botonArticulo2);
        View imgVideo = findViewById(R.id.imgVideo);

        botonArticulo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://es.rollingstone.com/de-vuelta-al-limite-el-regreso-de-bts/"));
                startActivity(intent);
            }
        });

        botonArticulo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://open.spotify.com/album/3ukkRHDHbN8tNRPKsGZR1h?si=P3v0ufMpREeZ55ueE3rXeA"));
                startActivity(intent);
            }
        });


        imgVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Videos.class);
                intent.putExtra("nombre", nombre);
                startActivity(intent);
            }
        });



    }
}