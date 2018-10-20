package com.example.ama.albertdam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registra);
    }

    public void ajuda(View view) {
        Intent intent = new Intent(this, Ajuda.class);
        startActivity(intent);

    }

    public void crear(View view){
        EditText user = (EditText) findViewById(R.id.user);
        EditText mail = (EditText) findViewById(R.id.mail);
        EditText phone = (EditText) findViewById(R.id.phone);
        EditText pass1 = (EditText) findViewById(R.id.pass);
        EditText pass2 = (EditText) findViewById(R.id.pass2);

        if (user.getText().toString().equals("") || mail.getText().toString().equals("") || phone.getText().toString().equals("") || pass1.getText().toString().equals("") || pass2.getText().toString().equals("")) {
            Toast.makeText(this,"Error: field is empty", Toast.LENGTH_SHORT).show();
        }else{
            if (pass1.getText().toString().equals((pass2.getText().toString()))){
                Toast.makeText(this, "Registered", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this,"Pass dont match", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
