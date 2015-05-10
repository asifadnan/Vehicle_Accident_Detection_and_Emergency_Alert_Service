package com.javacodegeeks.androidaccelerometerexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
 
public class timer extends Activity {
    Button start, stop;
    TextView tv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);
        tv  = (TextView)findViewById(R.id.tv);
        stop = (Button)findViewById(R.id.stop);

        tv.setText("10"); // startting from 10.
 
        final MyCounter timer = new MyCounter(10000,1000);
        timer.start();
        stop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            	 timer.cancel();
                finish();
            }
        });
    }
 
    public class MyCounter extends CountDownTimer{
 
        public MyCounter(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }
 
        @Override
        public void onFinish() {
         
            tv.setText("Timer Completed.");
            Intent i =new Intent(timer.this,hello.class);
            startActivity(i);
           
            
        }
 
        @Override
        public void onTick(long millisUntilFinished) {
            tv.setText((millisUntilFinished/1000)+"");
       
        }
    }
}
