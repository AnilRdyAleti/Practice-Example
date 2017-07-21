package com.logcat.anilreddy.practiceexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText myEditText,userName,password;
   Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view){

        myEditText = (EditText) findViewById(R.id.myEditText);

        Log.i("info", myEditText.getText().toString());

        Toast.makeText(getApplicationContext(),"Hello ",Toast.LENGTH_SHORT).show();
    }

    public void loginFunction(View view){
        userName = (EditText) findViewById(R.id.uName);
        password =  (EditText) findViewById(R.id.pwd);

        Log.i("userName",userName.getText().toString());
        Log.i("password", password.getText().toString());

        Toast.makeText(getApplicationContext(),"Hello " + userName.getText().toString(),Toast.LENGTH_SHORT).show();

        intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);

    }
}
