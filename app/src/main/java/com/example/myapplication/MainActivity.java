package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        textView = findViewById(R.id.textView);


    }

    public void clickButton(View v) {
        double a, b, c, x1, x2,D,x;


        String s1 = editText.getText().toString();
        String s2 = editText2.getText().toString();
        String s3 = editText3.getText().toString();


        a = Double.parseDouble(s1);
        b = Double.parseDouble(s2);
        c = Double.parseDouble(s3);


        D=b*b-4*a*c;
        if(D>0){
            x1=(-b-Math.sqrt(D))/(2*a);
            x2=(-b+Math.sqrt(D))/(2*a);
            String s = Double.toString(x1);
            String o = Double.toString(x2);
            textView.setText("x1="+s+"  "+"x2="+o);

        }else if (D==0){
            x=(-b)/(2*a);
            String s = Double.toString(x);
            textView.setText("x="+s);
        }
        else {
            String u ="Решений нет" ;
            textView.setText(u);

        }
    }
}