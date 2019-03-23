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
            String pass = pEdit.getText().toString();
            String mail = mEdit.getText().toString();
            String gen = gEdit.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.NAME_KEY, name);
            mIntent.putExtra(AppConstants.PASS_KEY, pass);
            mIntent.putExtra(AppConstants.MAIL_KEY, mail);
            mIntent.putExtra(AppConstants.GEN_KEY, gen);
            startActivity(mIntent);
        });
    }
}
