package com.example.profilecard;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    EditText editFirst;
    EditText editLast;
    EditText editStreet1;
    EditText editStreet2;
    EditText editDOB;
    SharedPreferences shared;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Gson gson = new Gson();

        shared = getSharedPreferences("A", Context.MODE_PRIVATE);
        editFirst = (EditText)findViewById(R.id.firstName_field);
        editLast = (EditText)findViewById(R.id.lastName_field);
        editStreet1 = (EditText)findViewById(R.id.streetAddress);
        editStreet2 = (EditText)findViewById(R.id.cityStateZip);
        editDOB = (EditText)findViewById(R.id.DOB_field);

        btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first =  editFirst.getText().toString();
                String last = editLast.getText().toString();
                String address1 = editStreet1.getText().toString();
                String address2 = editStreet2.getText().toString();
                String dob = editDOB.getText().toString();

                Profile profile = new Profile(first, last, address1, address2, dob);
                String json = gson.toJson(profile);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                /*intent.putExtra("FIRST", first);
                intent.putExtra("LAST", last);
                intent.putExtra("ADDRESS1", address1);
                intent.putExtra("ADDRESS2", address2);
                intent.putExtra("DOB", dob);*/

                intent.putExtra("JSON", json); // above intents represented as one json string
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
