package com.shivang.loginrandom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Clickme(View v)
    {
        EditText et1=(EditText)findViewById(R.id.editText);
        EditText et2=(EditText)findViewById(R.id.editText2);

        if(et1.getText().toString().equals("admin")&& et2.getText().toString().equals("admin"))
        {
            Intent it=new Intent(getApplicationContext(),RandomActivity.class);
            startActivity(it);
        }

    }
}
