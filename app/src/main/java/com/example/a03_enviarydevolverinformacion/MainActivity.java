package com.example.a03_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private EditText txtPassword;
    private EditText txtEmail;
    private Button btnDescifrar;
    private Button btnCrearDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaVistas();

        btnDescifrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = txtPassword.getText().toString();
                String email = txtEmail.getText().toString();

                Intent intent = new Intent(MainActivity.this, DescifrarActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("USER", new Usuarios(email, password));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btnCrearDireccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }

    private void inicializaVistas() {
        txtPassword = findViewById(R.id.txtPasswordMain);
        btnDescifrar = findViewById(R.id.btnDescifrarMain);
        txtEmail = findViewById(R.id.txtEmailMain);
        btnCrearDireccion = findViewById(R.id.btnCrearDireccionMain);
    }
}