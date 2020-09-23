package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView x =findViewById(R.id.textView);
        TextView y =findViewById(R.id.textView2);
        Bundle A=getIntent().getExtras();
        String Ab=A.getString("drag");
        String Bc=A.getString("gard");

 y.setText(Bc);
x.setText(Ab);
    }
}