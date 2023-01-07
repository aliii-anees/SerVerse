package com.example.serverse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomePage extends AppCompatActivity {

    Button ann, prof;
    ImageButton ad1, ad2, ad3, ad4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

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

        ad1 = (ImageButton) findViewById(R.id.homead1);
        ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                link1("https://www.nerdfitness.com/coaching-overview-page/");
            }
        });
        ad2 = (ImageButton) findViewById(R.id.homead2);
        ad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                link2("https://www.cozymeal.com/online-cooking-classes");
            }
        });
        ad3 = (ImageButton) findViewById(R.id.homead3);
        ad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                link3("https://www.fiverr.com/pedrito2387/do-professional-private-label-product-research-for-amazon-us?context_referrer=logged_in_homepage&source=by_recently_viewed&ref_ctx_id=2154276022749207973f52519ee07997&context=recommendation&pckg_id=1&pos=1&context_alg=recently_viewed");
            }
        });
        ad4 = (ImageButton) findViewById(R.id.homead4);
        ad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                link4("https://twomenandatruck.com/local-moving/home-services");
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
    private void link3(String s)
    {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
    private void link4(String s)
    {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}

