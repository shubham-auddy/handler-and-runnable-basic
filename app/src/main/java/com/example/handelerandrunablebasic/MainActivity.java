package com.example.handelerandrunablebasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int number=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                Log.d("lpg", "onTick: I am hero");
            }

            @Override
            public void onFinish() {
                Log.d("lpg", "Khatam ho gaya");
            }
        }.start();

    /*
     final Handler handler=new Handler();
     Runnable runnable=new Runnable() {
         @Override
         public void run() {
             number++;
             Toast.makeText(MainActivity.this, "this "+number+"times", Toast.LENGTH_SHORT).show();
            handler.postDelayed(this,1000);
         }
     };
     handler.post(runnable);

     */
    }
}