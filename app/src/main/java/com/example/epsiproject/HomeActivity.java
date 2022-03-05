package com.example.epsiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private Button button3 ;
    private Button button4 ;
    private Button button5 ;

    private EditText editTextTextPersonName3 ;
    private EditText editTextTextPersonName4 ;
    private ImageView imageView2 ;
    private TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button3 = findViewById(R.id.button3) ;
        button4 = findViewById(R.id.button4) ;
        button5 = findViewById(R.id.button5) ;

        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3) ;
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4) ;
        imageView2 = findViewById(R.id.imageView2) ;
        textView = findViewById(R.id.textView) ;

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MapActivity.class) ;
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,OffreActivity.class) ;
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MagasinActivity.class) ;
                startActivity(intent);
            }
        });



    }
}