package com.example.epsiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Inscription_CompteActivity extends AppCompatActivity {
    private EditText editTextTextPersonName ;
    private EditText editTextTextPersonName2  ;
    private EditText editTextTextEmailAddress ;
    private EditText editTextTextPostalAddress ;
    private EditText editTextTextPostalAddress2 ;
    private EditText editTextTextPersonName7 ;
    private EditText editTextNumber ;
    private Button button2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription_compte);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName) ;
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2) ;
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress) ;
        editTextTextPostalAddress = findViewById(R.id.editTextTextPostalAddress) ;
        editTextTextPostalAddress2 = findViewById(R.id.editTextTextPostalAddress2) ;
        editTextTextPersonName7 = findViewById(R.id.editTextTextPersonName7) ;
        editTextNumber = findViewById(R.id.editTextNumber) ;
        button2 = findViewById(R.id.button2) ;


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inscription_CompteActivity.this,HomeActivity.class) ;
                startActivity(intent);
            }
        });
    }
}