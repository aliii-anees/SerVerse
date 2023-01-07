package com.example.serverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AnnouncementPage extends AppCompatActivity {

    Button homepg, prof;
    Button ad1, ad2, ad3, ad4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement_page);

        ad1 = (Button) findViewById(R.id.annad1);
        ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), categories1.class);
                startActivity(intent);
            }
        });

        ad2 = (Button) findViewById(R.id.annad2);
        ad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), categories2.class);
                startActivity(intent);
            }
        });

        ad3 = (Button) findViewById(R.id.annad3);
        ad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), categories3.class);
                startActivity(intent);
            }
        });

        ad4 = (Button) findViewById(R.id.annad4);
        ad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), categories4.class);
                startActivity(intent);
            }
        });

        homepg=(Button) findViewById(R.id.annbtnh);

        homepg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }


        });



        prof = (Button) findViewById(R.id.annbtnp);

        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Profile.class);
                startActivity(intent);
            }
        });
    }
}