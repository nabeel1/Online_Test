package com.example.online_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnNextScreen2 = (Button) findViewById(R.id.btn_Show);
        //Listening to button event
        btnNextScreen2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen2 = new Intent(getApplicationContext(), Show_Activity.class);
                startActivity(nextScreen2);

            }
        });



    }
}