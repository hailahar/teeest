package com.example.hailah.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  void viewage (View view){

        EditText myage =(EditText) findViewById(R.id.age);
       int a= Integer.parseInt(myage.getText().toString());
        Toast.makeText(this, "Yora age is"+ String.valueOf(a), Toast.LENGTH_SHORT).show();
    }

}
