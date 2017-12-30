package com.example.prakherpratyush.encryption;

import android.app.Activity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

public class Encryption extends Activity {

    EditText text1;
    Button en;
    Button en1;
    Button en2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encryption);

        text1 = (EditText) findViewById(R.id.text);
        en = (Button) findViewById(R.id.en);
        en1 = (Button) findViewById(R.id.en1);
        en2 = (Button)findViewById(R.id.en2);

        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String theTestText = String.valueOf(text1.getText());

                byte[] data = new byte[0];
                try {
                    data = theTestText.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                String text = Base64.encodeToString(data, Base64.DEFAULT);

                text1.setText(text);
            }
        });

        en1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String theTestText = String.valueOf(text1.getText());

                byte[] data = new byte[0];
                try {
                    data = theTestText.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                String text = Base64.encodeToString(data, Base64.DEFAULT);
                String textfinal = Base64.encodeToString(text.getBytes(), Base64.DEFAULT);

                text1.setText(textfinal);
            }
        });

        en2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String theTestText = String.valueOf(text1.getText());

                byte[] data = new byte[0];
                try {
                    data = theTestText.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                String text = Base64.encodeToString(data, Base64.DEFAULT);
                String textf = Base64.encodeToString(text.getBytes(), Base64.DEFAULT);
                String textfinal = Base64.encodeToString(textf.getBytes(), Base64.DEFAULT);

                text1.setText(textfinal);
            }
        });
    }
}
