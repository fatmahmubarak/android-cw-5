package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView name = findViewById(R.id.textView);
        TextView age = findViewById(R.id.textView2);
        Button but = findViewById(R.id.button);

        Bundle a = getIntent().getExtras();
        String m = a.getString("name");
        name.setText("اسم المريض"+m);

        String t = a.getString("age");
        age.setText("عمر المريض"+t);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(MainActivity2.this , MainActivity.class);
                startActivity(n);
            }
        });

    }
}