package com.shivang.loginrandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class RandomActivity extends AppCompatActivity {
int a,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        Random r=new Random();
        a=r.nextInt(10)+1;
    }

    public void guess(View v)
    {
        EditText editText=(EditText)findViewById(R.id.editText4);
        TextView textView=(TextView)findViewById(R.id.textView2);

        g=Integer.parseInt(editText.getText().toString());
        if(g==a)
        {
            textView.setText("CONGRATS YOU WIN !!");
        }
        else if(g<a)
        {
            Toast.makeText(this, "MAKE IT LARGE", Toast.LENGTH_SHORT).show();

        }
        else if(g>a)
        {
            Toast.makeText(this, "NICHE DEKH", Toast.LENGTH_SHORT).show();
        }
    }
}
