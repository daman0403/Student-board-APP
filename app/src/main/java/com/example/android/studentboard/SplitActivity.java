package com.example.android.studentboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class SplitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split);


        Objects.requireNonNull(getSupportActionBar()).hide();

        Thread thread = new Thread(){
            public  void run(){
                try {
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplitActivity.this, MainActivity.class);
                    startActivity(intent);
                }


            }
        };thread.start();

    }
}