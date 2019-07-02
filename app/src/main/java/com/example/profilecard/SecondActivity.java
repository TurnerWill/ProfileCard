package com.example.profilecard;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class SecondActivity extends AppCompatActivity {

    TextView firstName;
    TextView lastName;
    TextView address1;
    TextView address2;
    TextView dobField;
    SharedPreferences shared;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        shared = getSharedPreferences("A", Context.MODE_PRIVATE);

        Gson gson = new Gson();
        Profile profile = (Profile) gson.fromJson(getIntent().getStringExtra("JSON"), Profile.class);

        firstName = findViewById(R.id.textView_firstName);
        firstName.setText(profile.getFirstName());
        firstName.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        lastName = findViewById(R.id.textView_lastName);
        lastName.setText(profile.getLastName());
        lastName.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        address1 = findViewById(R.id.textView_addressLine1);
        address1.setText(profile.getStreetAddress1());
        address1.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        address2 = findViewById(R.id.textView_addressLine2);
        address2.setText(profile.getStreetAddress2());
        address2.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        dobField = findViewById(R.id.textView_DOB);
        dobField.setText(profile.getDob());
        dobField.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

    }
}
