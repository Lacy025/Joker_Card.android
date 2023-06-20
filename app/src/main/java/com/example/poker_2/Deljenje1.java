package com.example.poker_2;

import static com.example.poker_2.First.audiokarta12345;

import android.app.Activity;
import java.util.Timer;
import java.util.TimerTask;

public class Deljenje1 extends Activity {
    public Deljenje1(Runnable deljenje1) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                audiokarta12345.start();
            }
        }, 500);
    }
}
