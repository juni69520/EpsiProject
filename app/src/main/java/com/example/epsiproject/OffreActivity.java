package com.example.epsiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OffreActivity extends AppCompatActivity {
    private ImageButton imageButton2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offre);
        imageButton2 = findViewById(R.id.imageButton2) ;
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OffreActivity.this,CompteActivity.class) ;
                startActivity(intent);
            }
        });
    }
}