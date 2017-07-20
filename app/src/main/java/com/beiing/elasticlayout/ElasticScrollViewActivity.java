package com.beiing.elasticlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ScrollView;

public class ElasticScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elastic_scroll_view);
        ScrollView srContent = (ScrollView) findViewById(R.id.sr_content);
        srContent.setOverScrollMode(View.OVER_SCROLL_ALWAYS );
    }
}
