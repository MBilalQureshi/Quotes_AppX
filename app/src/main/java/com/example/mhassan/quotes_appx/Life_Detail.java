package com.example.mhassan.quotes_appx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Life_Detail extends AppCompatActivity {

    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life__detail);

        text1 = (TextView)findViewById(R.id.LFtxtview);

        Bundle mBundle = getIntent().getExtras();

        if (mBundle != null){
            String message1 = mBundle.getString("LIFE QUOTE");
            text1.setText(message1);
        }
    }
}
