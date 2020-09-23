package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name=findViewById(R.id.name);
       final EditText age=findViewById(R.id.age);
        Button a=findViewById(R.id.nextPage);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v= new Intent(MainActivity.this ,MainActivity2.class);
                v.putExtra("drag",name.getText().toString());
                v.putExtra("gard",age.getText().toString());
startActivity(v);
            }
        });

    }
}