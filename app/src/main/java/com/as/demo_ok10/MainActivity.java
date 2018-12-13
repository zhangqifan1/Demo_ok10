package com.as.demo_ok10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.as.demo_ok10.foldingcell.FoldingCell;

public class MainActivity extends AppCompatActivity {

    private FoldingCell foldingcell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    public void dai(View view) {
        foldingcell.toggle(false);//是否跳过动画
    }

    public void budai(View view) {
        foldingcell.toggle(true);
    }

    private void initView() {
        foldingcell = (FoldingCell) findViewById(R.id.foldingcell);
    }
}
