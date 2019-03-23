package com.example.laboratorio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.laboratorio3.utils.AppConstants;

public class NewActivity extends AppCompatActivity {

    private TextView nTextView, pTextView, mTextView, gTextView;
    private Button mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent mIntent = getIntent();
        nTextView = findViewById(R.id.showname);
        pTextView = findViewById(R.id.showpass);
        mTextView = findViewById(R.id.showmail);
        gTextView = findViewById(R.id.showgender);
        mButtonShare = findViewById(R.id.btn_share);

        if (mIntent != null) {
            nTextView.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
            pTextView.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
            mTextView.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
            gTextView.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }

        mButtonShare.setOnClickListener(v -> {
            String nametx = nTextView.getText().toString();
            String passtx = pTextView.getText().toString();
            String mailtx = mTextView.getText().toString();
            String gentx = gTextView.getText().toString();
            Intent sIntent = new Intent();

            sIntent.setType("text/plain");
            sIntent.setAction(Intent.ACTION_SEND);
            sIntent.putExtra(Intent.EXTRA_TEXT, nametx);
            sIntent.putExtra(Intent.EXTRA_TEXT, passtx);
            sIntent.putExtra(Intent.EXTRA_TEXT, mailtx);
            sIntent.putExtra(Intent.EXTRA_TEXT, gentx);
        });
    }
}
