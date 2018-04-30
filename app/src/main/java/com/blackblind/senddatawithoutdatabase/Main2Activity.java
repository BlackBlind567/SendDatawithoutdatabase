package com.blackblind.senddatawithoutdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.tv);

        Bundle bn = getIntent().getExtras();
        String name = bn.getString("fname");
        textView.setText(String.valueOf(name));

    }
}
