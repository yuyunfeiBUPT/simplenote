package com.example.yuyunfei.simplenote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class notelistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notelist);
    }

    public void onNewNote(View view) {
        Intent intent = new Intent(this, EditNoteActivity.class);
        startActivity(intent);
        // 启动新建页面
    }
    public void onReadNote(View view) {
        Intent intent = new Intent(this, ReadNoteActivity.class);
        startActivity(intent);
        // 启动阅读页面
    }
}
