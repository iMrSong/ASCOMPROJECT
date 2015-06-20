package com.example.tonyshan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonyshan on 15/06/14.
 */
public class SubActivity extends Activity{

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);
        // リストをデータをセット
        List<VideoData> list = new ArrayList<VideoData>();
        for(int i = 1; i < 11; i++){
            list.add(new VideoData(R.drawable.android, "項目：" + i));
        }
        // リストビューをセット
        final ListView listView = (ListView)findViewById(R.id.list_item);

        listView.setAdapter(new VideoAdapter(this, list));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListView listView = (ListView)parent;
                // クリックした位置を取得
                VideoData item = (VideoData)listView.getItemAtPosition(position);

                // 取得したタイトルをToastに表示する 
                //  Toast.makeText(getApplicationContext(),"Text" + item.getText(), Toast.LENGTH_SHORT).show();

                // クッリクを画面遷移
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);

                intent.putExtra("textpath", item.getText());

                startActivity(intent);
            }
        });



    }
}
