package com.example.tonyshan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by tonyshan on 15/06/14.
 */
public class ThirdActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        Intent intent = getIntent();
        String title = intent.getStringExtra("textpath");

        TextView textView = (TextView)findViewById(R.id.title);

        textView.setText(title);

    }

}
