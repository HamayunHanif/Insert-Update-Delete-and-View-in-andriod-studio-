package com.example.midpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(this,"Welcome to Firts",Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(MainActivity.this,first.class);
                startActivity(i1);
                break;
            case R.id.btn2:
                Toast.makeText(this,"Welcome to Firts",Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(MainActivity.this,second.class);
                startActivity(i2);

        }
    }
}