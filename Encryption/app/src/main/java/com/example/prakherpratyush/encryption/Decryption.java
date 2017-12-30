package com.example.prakherpratyush.encryption;

import android.os.Bundle;
import android.text.Editable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

public class Decryption extends Encryption {

    EditText text1;
    Editable t1;
    String t;
    Button en;
    Button en1;
    Button en2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decryption);

        text1 = (EditText) findViewById(R.id.text);
        en = (Button) findViewById(R.id.en);
        en1 = (Button)findViewById(R.id.en1);
        en2 = (Button)findViewById(R.id.en2);

        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1 = text1.getText();
                t = String.valueOf(t1);
                byte[] data = Base64.decode(t, Base64.DEFAULT);
                try {
                    String t2 = new String(data, "UTF-8");
                    text1.setText(t2);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });

        en1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1 = text1.getText();
                t = String.valueOf(t1);
                byte[] data = Base64.decode(t, Base64.DEFAULT);
                byte[] data1 = Base64.decode(data, Base64.DEFAULT);
                try {
                    String t2 = new String(data1, "UTF-8");
                    text1.setText(t2);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });

        en2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1 = text1.getText();
                t = String.valueOf(t1);
                byte[] data = Base64.decode(t, Base64.DEFAULT);
                byte[] data1 = Base64.decode(data, Base64.DEFAULT);
                byte[] data2 = Base64.decode(data1, Base64.DEFAULT);

                try {
                    String t2 = new String(data2, "UTF-8");
                    text1.setText(t2);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

