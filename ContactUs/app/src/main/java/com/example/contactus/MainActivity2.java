package com.example.contactus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    EditText name,password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name= (EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.button);
    }

    public void movepage(View v)
    {
        String id = name.getText().toString();
        String pass = password.getText().toString();

        if (id.equals("admin") && pass.equals("password"))
        {
            Intent in = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(in);

        }

        else if (id.equals("") || pass.equals(""))
        {
            Toast.makeText(getBaseContext(),"Empty Credential!!!! Enter Detail",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getBaseContext(),"Password Or Username Wrong",Toast.LENGTH_SHORT).show();
        }

    }
}


