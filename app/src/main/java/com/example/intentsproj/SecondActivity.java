package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String no3,no4,res;
    TextView txt1,txt2,txt3;
    Button add,sub,mlt,dv;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1 = findViewById(R.id.textView4);
        txt2 = findViewById(R.id.textView5);
        txt3 = findViewById(R.id.result);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        mlt = findViewById(R.id.button3);
        dv = findViewById(R.id.button4);

        Intent myIntent = getIntent();
        no3=myIntent.getStringExtra("num1");
        no4=myIntent.getStringExtra("num2");
    }

    @Override
    protected void onResume(){
        super.onResume();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result=Integer.valueOf(no3)+Integer.valueOf(no4);
                res=result.toString();
                txt3.setText(res);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result=Integer.valueOf(no3)-Integer.valueOf(no4);
                res=result.toString();
                txt3.setText(res);
            }
        });
        mlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result=Integer.valueOf(no3)*Integer.valueOf(no4);
                res=result.toString();
                txt3.setText(res);
            }
        });
        dv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result=Integer.valueOf(no3)/Integer.valueOf(no4);
                res=result.toString();
                txt3.setText(res);
            }
        });




        txt1.setText(no3);
        txt2.setText(no4);
    }
}