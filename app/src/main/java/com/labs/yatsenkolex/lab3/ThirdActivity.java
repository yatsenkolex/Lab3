package com.labs.yatsenkolex.lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ThirdActivity extends Activity implements View.OnClickListener {

    final String TAG = "States";
    Button btnActThree;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);
        btnActThree = findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);
        Log.d(TAG, "ThirdActivity: onCreate()");

        LinearLayout linear = findViewById(R.id.linearlayout3);
        linear.setOnTouchListener(new SwipeTouchListener(this));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ThirdActivity: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ThirdActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ThirdActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ThirdActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ThirdActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ThirdActivity: onDestroy()");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
