package com.example.tonyshan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * リストビューから遷移した画面
 */
public class ThirdActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        Intent intent = getIntent();
        // タイトルを取得
        String title = intent.getStringExtra("textpath");

        TextView textView = (TextView)findViewById(R.id.title);
        // タイトルを設定
        textView.setText(title);

    }

    /**
     * Test Method
     */
    public void testMethod(){
        Log.d("Test", "Test Source Code From Local Song.");
    }

}
