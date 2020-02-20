package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void unipeace(View view){
        Intent intent = new Intent(this, unipeaceActivity.class);
        startActivity(intent);
    }

    public void mukhyang(View view){
        //Intent intent = new Intent(MainActivity.this, )
    }

    public void comuse(View view){
        Intent intent = new Intent(this, comuseActivity.class);
        startActivity(intent);
    }
}
