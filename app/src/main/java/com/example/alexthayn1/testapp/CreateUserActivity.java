package com.example.alexthayn1.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View;

public class CreateUserActivity extends AppCompatActivity {
    boolean male = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
    }


    public void onClick(View view){
        EditText input = (EditText) findViewById(R.id.username);
        String string = input.getText().toString();



        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gender);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.male:
                        male = true;
                        RadioButton m = (RadioButton) findViewById(R.id.male);
                        break;
                    case R.id.female:
                        male = false;
                        RadioButton f = (RadioButton) findViewById(R.id.female);
                        break;
                }
            }
        });
        RadioButton rb = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());

        Toast.makeText(this,rb.getText()+ " User " + string + " created.", Toast.LENGTH_LONG).show();
    }
}
