package com.example.epsiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CreationCompte extends AppCompatActivity {
    private ImageButton imageButton ;
    private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_compte);

        imageButton = findViewById(R.id.imageButton) ;
        button = findViewById(R.id.button) ;

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreationCompte.this,LoginActivity.class) ;
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreationCompte.this,Inscription_CompteActivity.class) ;
                startActivity(intent);
            }
        });
    }
}