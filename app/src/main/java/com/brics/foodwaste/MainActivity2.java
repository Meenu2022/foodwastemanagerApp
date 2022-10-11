package com.brics.foodwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity2 extends AppCompatActivity {
RelativeLayout explorefood,offerfood,updatefood,mycarts,myorder,myprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        explorefood = findViewById(R.id.explorefood);
        offerfood = findViewById(R.id.offerfood);
        updatefood = findViewById(R.id.updatefood);
        mycarts = findViewById(R.id.mycarts);
        myorder = findViewById(R.id.myorder);
        myprofile = findViewById(R.id.myprofile);
        explorefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, explorefood.class);
                startActivity(intent);
            }
        });
        offerfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, com.brics.foodwaste.offerfood.class);
                startActivity(intent);

            }
        });
        updatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, updatefood.class);
                startActivity(intent);

            }
        });
        mycarts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, mycarts.class);
                startActivity(intent);

            }
        });
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, myorder.class);
                startActivity(intent);

            }
        });
        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, myprofile.class);
                startActivity(intent);

            }
        });

    }
}