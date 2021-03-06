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
            nTextView.setText(mIntent.getStringExtra(AppConstants.NAME_KEY));
            pTextView.setText(mIntent.getStringExtra(AppConstants.PASS_KEY));
            mTextView.setText(mIntent.getStringExtra(AppConstants.MAIL_KEY));
            gTextView.setText(mIntent.getStringExtra(AppConstants.GEN_KEY));
        }

        mButtonShare.setOnClickListener(v -> {
            String textU = nTextView.getText().toString() + "\n";
            textU = textU + pTextView.getText().toString() + "\n";
            textU = textU + mTextView.getText().toString() + "\n";
            textU = textU + gTextView.getText().toString();
            Intent sIntent = new Intent();
            sIntent.setType("text/plain");
            sIntent.setAction(Intent.ACTION_SEND);
            sIntent.putExtra(Intent.EXTRA_TEXT, textU);
            startActivity(sIntent);
        });

       /*mButtonShare.setOnClickListener(v -> {
            String text1 = nTextView.getText().toString();
            Intent sIntent = new Intent();
            sIntent.setType("text/plain");
            sIntent.setAction(Intent.ACTION_SEND);
            sIntent.putExtra(Intent.EXTRA_TEXT, text1);
            startActivity(sIntent);
        });

        mButtonShare.setOnClickListener(v -> {
            String text2 = pTextView.getText().toString();
            Intent sIntent = new Intent();
            sIntent.setType("text/plain");
            sIntent.setAction(Intent.ACTION_SEND);
            sIntent.putExtra(Intent.EXTRA_TEXT, text2);
            startActivity(sIntent);
        });

        mButtonShare.setOnClickListener(v -> {
            String text3 = mTextView.getText().toString();
            Intent sIntent = new Intent();
            sIntent.setType("text/plain");
            sIntent.setAction(Intent.ACTION_SEND);
            sIntent.putExtra(Intent.EXTRA_TEXT, text3);
            startActivity(sIntent);
        });

        mButtonShare.setOnClickListener(v -> {
            String text4 = gTextView.getText().toString();
            Intent sIntent = new Intent();
            sIntent.setType("text/plain");
            sIntent.setAction(Intent.ACTION_SEND);
            sIntent.putExtra(Intent.EXTRA_TEXT, text4);
            startActivity(sIntent);
        });*/
    }
}
