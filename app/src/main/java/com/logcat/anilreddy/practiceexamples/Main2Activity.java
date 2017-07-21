package com.logcat.anilreddy.practiceexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText text;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void buttonClicked(View view){
        text = (EditText) findViewById(R.id.name2);

        Toast.makeText(getApplicationContext(),text.getText().toString(),Toast.LENGTH_SHORT).show();

        intent = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
    }
}
