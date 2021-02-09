package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText t;
    TextView v ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.button1);
        t = (EditText) findViewById(R.id.Text1);
        v = (TextView) findViewById(R.id.textView);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String st = t.getText().toString();
                 v.setText( "Hello, "+ st);
            }
        });

    }
}
