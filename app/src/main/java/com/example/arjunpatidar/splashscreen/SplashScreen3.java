package com.example.arjunpatidar.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen3 extends AppCompatActivity {
    TextView tv;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen3);
        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv.startAnimation(animation);
        iv.startAnimation(animation);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }; myThread.start();
    }
}
