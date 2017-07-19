package com.zz.pos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textview = findViewById(R.id.text);
        final Button button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            textview.setText(textview.getText() + " Click");
        });
    }
}
