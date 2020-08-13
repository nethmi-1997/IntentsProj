package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button btn;
    EditText num1,num2;
    String no1,no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        btn = findViewById(R.id.btnOk);
    }
    @Override
    protected void onResume(){
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=(EditText)findViewById(R.id.etnum1);
                no1 =num1.getEditableText().toString();
                num2=(EditText)findViewById(R.id.etnum2);
                no2 =num2.getEditableText().toString();

                Intent intent =new Intent( FirstActivity.this, SecondActivity.class);
                intent.putExtra("num1", no1);
                intent.putExtra("num2", no2);
                startActivity(intent);
                Context context = getApplicationContext();
                CharSequence message ="You just click the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity( Gravity.TOP|Gravity.LEFT, 0,0);
                toast.show();
            }
        });

    }
}