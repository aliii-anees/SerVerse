package com.example.serverse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class DetailsActivity extends AppCompatActivity {

    Intent intent;
    ListView lv;
    ListAdapter adapter;
    Button bck;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        DbHandler db = new DbHandler(this);
        ArrayList<HashMap<String, String >> userlist = db.GetUsers();
        lv = (ListView) findViewById(R.id.user_list);
        adapter = new SimpleAdapter(DetailsActivity.this, userlist, R.layout.list_row, new String[] {"emailreg", "passwordreg"}, new int[]{R.id.email, R.id.password});
        bck = (Button) findViewById(R.id.btnBack);
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DetailsActivity.this, Register.class);
            }
        });

    }
}