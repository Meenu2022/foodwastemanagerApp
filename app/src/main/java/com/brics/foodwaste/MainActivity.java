package com.brics.foodwaste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends Activity  {
    Button b1,b2;
    EditText ed1,ed2;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button1);
        ed1 = (EditText)findViewById(R.id.euser);
        ed2 = (EditText)findViewById(R.id.epass);
        b2 = (Button) findViewById(R.id.signup);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.getText().toString().equals("admin");
                ed2.getText().toString().equals("admin");{
                    Toast.makeText(getApplicationContext(),
                            "Login success",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                };
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {

                    Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                };
            }
        });


    }
}