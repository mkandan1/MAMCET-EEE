package com.example.mamceteee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button web_one;
    Button web_two;
    Button web_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseAuth auth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = auth.getCurrentUser();
       if (currentUser == null) {
           Intent intent = new Intent(this, LoginActivity.class);
           startActivity(intent);
           finish();
           return;
       }

        button1 = (Button) findViewById(R.id.learn_more);
        web_one = (Button) findViewById(R.id.web_1_btn);
        web_two = (Button) findViewById(R.id.web_2_btn);
        web_three = (Button) findViewById(R.id.web_3_btn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityAbout.class);
                startActivity(intent);
            }
        });

        web_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityWebOne.class);
                startActivity(intent);
            }
        });

        web_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityWebTwo.class);
                startActivity(intent);
            }
        });
        web_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityWebThree.class);
                startActivity(intent);
            }
        });



    }
}