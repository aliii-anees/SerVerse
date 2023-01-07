package com.example.serverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class categories4 extends AppCompatActivity {

    ImageButton ad1 ,ad2;
    Button homepg, ann, prof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories4);

        ad1 = (ImageButton) findViewById(R.id.c4a1);
        ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                link1("https://www.ifixit.com/");
            }
        });

        ad2 = (ImageButton) findViewById(R.id.c4a2);
        ad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                link2("https://www.fixitfishtown.com/");
            }
        });

        homepg=(Button) findViewById(R.id.homebtnh);

        homepg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }


        });

        ann=(Button) findViewById(R.id.homebtna);

        ann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),AnnouncementPage.class);
                startActivity(intent);
            }


        });

        prof = (Button) findViewById(R.id.homebtnp);

        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Profile.class);
                startActivity(intent);
            }
        });


    }

    private void link1(String s)
    {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    private void link2(String s)
    {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}