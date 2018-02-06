package com.example.alexthayn1.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class CreateUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
    }

    public void onClick(View view){
        EditText input = (EditText) findViewById(R.id.username);
        String string = input.getText().toString();
        Toast.makeText(this, "User " + string + " created.", Toast.LENGTH_LONG).show();
    }
}
