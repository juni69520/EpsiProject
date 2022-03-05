package com.example.epsiproject;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.zxing.WriterException;
import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class LoginActivity extends AppCompatActivity {
    private EditText prenom ;
    private EditText email ;
    private EditText adresse;
    private EditText zipCode ;
    private EditText city ;
    private EditText cardRef;


    private ImageView qrCodeIV;
    private EditText dataEdt;
    private Button generateQrBtn;
    Bitmap bitmap;
    Bitmap bitmap1;
    Bitmap bitmap2;
    Bitmap bitmap3;
    Bitmap bitmap4;
    Bitmap bitmap5;
    Bitmap bitmap6;

    QRGEncoder qrgEncoder;
    QRGEncoder qrgEncoder1;
    QRGEncoder qrgEncoder2;
    QRGEncoder qrgEncoder3;
    QRGEncoder qrgEncoder4;
    QRGEncoder qrgEncoder5;
    QRGEncoder qrgEncoder6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        qrCodeIV = findViewById(R.id.idIVQrcode);
        dataEdt = findViewById(R.id.idEdt);
        generateQrBtn = findViewById(R.id.idBtnGenerateQR);

        prenom= findViewById(R.id.prenom) ;
        email = findViewById(R.id.email) ;
        adresse= findViewById(R.id.adresse) ;
        zipCode = findViewById(R.id.zipCode) ;
        city = findViewById(R.id.city) ;
        cardRef = findViewById(R.id.cardRef) ;



        generateQrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(dataEdt.getText().toString()) || TextUtils.isEmpty(prenom.getText().toString()) || TextUtils.isEmpty(email.getText().toString())
                || TextUtils.isEmpty(adresse.getText().toString()) || TextUtils.isEmpty(zipCode.getText().toString())
                || TextUtils.isEmpty(city.getText().toString()) || TextUtils.isEmpty(cardRef.getText().toString())) {

                    // if the edittext inputs are empty then execute
                    // this method showing a toast message.
                    Toast.makeText(LoginActivity.this, "Enter some text to generate QR Code", Toast.LENGTH_SHORT).show();
                } else {
                    WindowManager manager = (WindowManager) getSystemService(WINDOW_SERVICE);
                    Display display = manager.getDefaultDisplay();

                    Point point = new Point();
                    display.getSize(point);

                    int width = point.x;
                    int height = point.y;
                    int dimen = width < height ? width : height;
                    dimen = dimen * 3 / 4;

                    qrgEncoder = new QRGEncoder(dataEdt.getText().toString(), null, QRGContents.Type.TEXT, dimen);
                    qrgEncoder1 = new QRGEncoder(prenom.getText().toString(), null, QRGContents.Type.TEXT, dimen);
                    qrgEncoder2 = new QRGEncoder(email.getText().toString(), null, QRGContents.Type.TEXT, dimen);

                    qrgEncoder3 = new QRGEncoder(adresse.getText().toString(), null, QRGContents.Type.TEXT, dimen);
                    qrgEncoder4 = new QRGEncoder(zipCode.getText().toString(), null, QRGContents.Type.TEXT, dimen);
                    qrgEncoder5 = new QRGEncoder(city.getText().toString(), null, QRGContents.Type.TEXT, dimen);
                    qrgEncoder6 = new QRGEncoder(cardRef.getText().toString(), null, QRGContents.Type.TEXT, dimen);


                    try {
                        // getting our qrcode in the form of bitmap.
                        bitmap = qrgEncoder.encodeAsBitmap();
                        bitmap1 = qrgEncoder1.encodeAsBitmap() ;
                        bitmap2 = qrgEncoder2.encodeAsBitmap();
                        bitmap3 = qrgEncoder3.encodeAsBitmap() ;
                        bitmap4 = qrgEncoder4.encodeAsBitmap();
                        bitmap5 = qrgEncoder5.encodeAsBitmap() ;
                        bitmap6 = qrgEncoder6.encodeAsBitmap();

                        // the bitmap is set inside our image
                        // view using .setimagebitmap method.

                        qrCodeIV.setImageBitmap(bitmap);
                        qrCodeIV.setImageBitmap(bitmap1);
                        qrCodeIV.setImageBitmap(bitmap2);
                        qrCodeIV.setImageBitmap(bitmap3);
                        qrCodeIV.setImageBitmap(bitmap4);
                        qrCodeIV.setImageBitmap(bitmap5);
                        qrCodeIV.setImageBitmap(bitmap6);
                    } catch (WriterException e) {
                        // this method is called for
                        // exception handling.
                        Log.e("Tag", e.toString());
                    }
                }

            }
        });
    }
}