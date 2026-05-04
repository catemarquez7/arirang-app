package com.example.arirang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_videos);

        String nombre = getIntent().getStringExtra("nombre");
        Button botonVideo1 = findViewById(R.id.botonVideo1);
        Button botonVideo2 = findViewById(R.id.botonVideo2);
        Button botonVideo3 = findViewById(R.id.botonVideo3);
        View imgHome = findViewById(R.id.imgHome);

        botonVideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/b4iVv91Z6lY?si=thDnq56uBqTPbIkU"));
                startActivity(intent);
            }
        });

        botonVideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/wu6bA3zK_us?si=JO3yPKO6bm_iZL-w"));
                startActivity(intent);
            }
        });

        botonVideo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/4EUyOMwPcQ0?si=16pb_5FZM4i5zpE5"));
                startActivity(intent);
            }
        });


        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Videos.this, Home.class);
                intent.putExtra("nombre", nombre);
                startActivity(intent);
            }
        });



    }
}