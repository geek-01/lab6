package com.example.sagar.lab6;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
TextView t1;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.text);
    }

    public void color(View view) {

        if(count==0){
        t1.setTextColor(Color.RED);
        count=+1;}
        if(count==1){
        t1.setTextColor(Color.GREEN);}
        else {
        count=0;
        t1.setTextColor(Color.BLUE);}
    }

    public void font(View view) {
        if(count==0){
            t1.setTypeface(Typeface.MONOSPACE);
            count=+1;
        }else {
            count=0;
            t1.setTypeface(Typeface.SANS_SERIF);
        }
    }

    public void style(View view) {
        if(count==0){
            t1.setTypeface(Typeface.DEFAULT_BOLD);
        }else {
            count=0;
            t1.setTypeface(Typeface.DEFAULT);
        }
    }
}
