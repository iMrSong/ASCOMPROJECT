package com.example.tonyshan.myapplication;

/**
 * Created by tonyshan on 15/06/07.
 */
public class VideoData {

    int resourceId;
    String text;

    /**
     * コンストラクタ
     * @param resourceId リソースID
     * @param text テキスト
     */
    public VideoData(int resourceId, String text){
        this.resourceId = resourceId;
        this.text = text;
    }

    public int getId(){
        return  resourceId;
    }

    public String getText(){
        return text;
    }
}
