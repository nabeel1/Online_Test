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


        Button btnNextScreen = (Button) findViewById(R.id.btn_add);
        //Listening to button event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), Add_Activity.class);

                startActivity(nextScreen);

            }
        });


        Button btnNextScreen2 = (Button) findViewById(R.id.btn_Show);
        //Listening to button event
        btnNextScreen2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen2 = new Intent(getApplicationContext(), Show_Activity.class);
                startActivity(nextScreen2);

            }
        });


        Button btnDelete = (Button) findViewById(R.id.btn_del);
        //Listening to button event
        btnDelete.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent Intent_Del = new Intent(getApplicationContext(), Delete_Activity.class);
                startActivity(Intent_Del);

            }
        });

        Button btnUpdate = (Button) findViewById(R.id.btn_update);
        //Listening to button event
        btnUpdate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent Intent_update = new Intent(getApplicationContext(), Update_Activity.class);
                startActivity(Intent_update);

            }
        });



    }
}