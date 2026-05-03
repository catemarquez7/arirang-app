package com.example.arirang;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);

        EditText nombreInput = findViewById(R.id.nombre);
        EditText emailInput = findViewById(R.id.email);
        Button botonRegistro = findViewById(R.id.botonRegistro);

        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nombreInput.getText().toString();
                String email = emailInput.getText().toString();

                if (nombre.isEmpty() || email.isEmpty()) {
                    Toast.makeText(Registro.this, "Completá todos los campos.", LENGTH_SHORT).show();
                    return;

                } else {
                    Intent intent = new Intent(Registro.this, Home.class);
                    intent.putExtra("nombre", nombre);
                    intent.putExtra("email", email);
                    startActivity(intent);

                }
            }
        });



    }
}