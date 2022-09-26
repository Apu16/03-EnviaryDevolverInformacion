package com.example.a03_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DescifrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descifrar);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        if (bundle != null){
            Usuarios user = (Usuarios) bundle.getSerializable("USER");
            Toast.makeText(this, user.toString(), Toast.LENGTH_LONG).show();
        }
    }
}