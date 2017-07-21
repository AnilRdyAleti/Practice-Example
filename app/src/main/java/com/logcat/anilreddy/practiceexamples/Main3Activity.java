package com.logcat.anilreddy.practiceexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void changeImage(View view){

        imageView1 = (ImageView) findViewById(R.id.imageId);
        imageView1.setImageResource(R.drawable.cat3);
    }
}
