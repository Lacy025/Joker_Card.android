package com.example.poker_2;

import static com.example.poker_2.Jokers.audiokarta12345;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class Deljenje1 extends Activity {
    public Deljenje1(Runnable runnable) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                audiokarta12345.start();
            }
        }, 500);
    }
}
