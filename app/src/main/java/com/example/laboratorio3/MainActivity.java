package com.example.laboratorio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.laboratorio3.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private EditText nEdit, pEdit, mEdit, gEdit;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nEdit = findViewById(R.id.username);
        pEdit = findViewById(R.id.password);
        mEdit = findViewById(R.id.email);
        gEdit = findViewById(R.id.gender);
        mButton = findViewById(R.id.btn_send);

        mButton.setOnClickListener(v -> {
            String name = nEdit.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, name);
            startActivity(mIntent);
        });

        mButton.setOnClickListener(v -> {
            String pass = pEdit.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, pass);
            startActivity(mIntent);
        });

        mButton.setOnClickListener(v -> {
            String mail = mEdit.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, mail);
            startActivity(mIntent);
        });

        mButton.setOnClickListener(v -> {
            String gender = gEdit.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, gender);
            startActivity(mIntent);
        });
    }
}
