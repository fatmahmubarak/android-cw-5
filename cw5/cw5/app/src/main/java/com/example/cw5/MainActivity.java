package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText o = findViewById(R.id.name);
        final EditText d = findViewById(R.id.age);
        Button next = findViewById(R.id.nextPage);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = o.getText().toString();
                String age = d.getText().toString();
                Intent n = new Intent(MainActivity.this , MainActivity2.class);
                n.putExtra("name",name);
                n.putExtra("age",age);
                startActivity(n);
            }
        });
    }
}