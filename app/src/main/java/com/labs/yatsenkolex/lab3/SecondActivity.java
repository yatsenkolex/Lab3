package com.labs.yatsenkolex.lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SecondActivity extends Activity implements View.OnClickListener {

    final String TAG = "States";
    Button btnActTwo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        btnActTwo = findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
        Log.d(TAG, "SecondActivity: onCreate()");

        LinearLayout linear = findViewById(R.id.linearlayout2);
        linear.setOnTouchListener(new SwipeTouchListener(this));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "SecondActivity: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "SecondActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SecondActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SecondActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "SecondActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "SecondActivity: onDestroy()");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
