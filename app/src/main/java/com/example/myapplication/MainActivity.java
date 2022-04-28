package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int value;
    TextView txt;
    CheckBox c,c1,c2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=findViewById(R.id.checkBox);
        c.setOnClickListener(this);
        c1=findViewById(R.id.checkBox2);
        c1.setOnClickListener(this);

        c2=findViewById(R.id.checkBox3);
        c2.setOnClickListener(this);


        txt=findViewById(R.id.display);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button zero=findViewById(R.id.zero);
        plus.setOnClickListener(view -> {
            int value=Integer.parseInt((String) txt.getText());
            value++;
            set(value);
        });
        minus.setOnClickListener(view -> {
            int value=Integer.parseInt((String) txt.getText());
            value--;
            set(value);

        });
        zero.setOnClickListener(view -> {
            int value;
            value=0;
            set(value);
        });
    }
    public void set(int val)
    {

        txt.setText(""+ Integer.toString(val));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.checkBox:
                if(c.isChecked())
                {
                    txt.setText("100");
                }
                break;
            case R.id.checkBox2:
                if(c1.isChecked())
                {
                    txt.setText("200");
                }
                break;
            case R.id.checkBox3:
                if(c2.isChecked())
                {
                    txt.setText("300");
                }
                break;

        }
    }
}