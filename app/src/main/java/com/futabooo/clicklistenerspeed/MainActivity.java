package com.futabooo.clicklistenerspeed;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.view.View;


public class MainActivity extends ActionBarActivity implements View.OnTouchListener, View.OnClickListener {

    private long startTime;
    private long endTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnTouchListener(this);
        findViewById(R.id.button1).setOnClickListener(this);

        findViewById(R.id.button2).setOnTouchListener(this);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printTime(startTime);
            }
        });

        findViewById(R.id.button3).setOnTouchListener(this);
        findViewById(R.id.button3).setOnClickListener(myClickListener);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        startTime = System.nanoTime();
        return false;
    }

    @Override
    public void onClick(View v) {
        printTime(startTime);
    }

    private void printTime(long startTime){
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    private View.OnClickListener myClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            printTime(startTime);
        }
    };
}

