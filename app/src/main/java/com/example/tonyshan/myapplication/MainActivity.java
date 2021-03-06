package com.example.tonyshan.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/**
 * メイン画面
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // メイン画面のレイアウトを設定
        setContentView(R.layout.activity_main);

    Button VideoListButton = (Button)findViewById(R.id.button2);
    // ボタンをクリックのイベント
    VideoListButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           // 画面を遷移
           Intent intent = new Intent();
            intent.setClass(MainActivity.this,SubActivity.class);
            startActivity(intent);
        }
    });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
