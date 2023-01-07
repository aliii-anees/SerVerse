package com.example.serverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.DatabaseMetaData;
import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    EditText email, pass;
    Button regbtn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = (EditText) findViewById(R.id.Emailedit);
        pass = (EditText) findViewById(R.id.Passwordedit);
        regbtn = (Button) findViewById(R.id.regisbtn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailreg = email.getText().toString() + "\n";
                String passreg = pass.getText().toString();

                DbHandler dbHandler = new DbHandler(Register.this);
                dbHandler.insertUserDetails(emailreg, passreg);
                intent = new Intent(Register.this, DetailsActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Account Created", Toast.LENGTH_SHORT).show();

            }
        });

    }
}