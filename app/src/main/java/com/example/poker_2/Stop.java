package com.example.poker_2;

import static com.example.poker_2.Jokers.audiostop;
import static com.example.poker_2.Jokers.stop1;
import static com.example.poker_2.Jokers.stop2;
import static com.example.poker_2.Jokers.stop3;
import static com.example.poker_2.Jokers.stop4;
import static com.example.poker_2.Jokers.stop5;

import android.app.Activity;
import android.graphics.Color;

import java.util.Timer;
import java.util.TimerTask;

public class Stop extends Activity {
    Stop(Runnable runnable) {

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if(Jokers.stop == 1) {
                    Jokers.stop = 0;

                    if(Dobitak1.hold1 == 1) {
                        try {
                            Thread.sleep(350);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop1.setBackgroundColor(Color.RED);
                        audiostop.start();
                    }
                    if(Dobitak1.hold2 == 1) {
                        try {
                            Thread.sleep(350);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop2.setBackgroundColor(Color.RED);
                        audiostop.start();
                    }
                    if(Dobitak1.hold3 == 1) {
                        try {
                            Thread.sleep(350);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop3.setBackgroundColor(Color.RED);
                        audiostop.start();
                    }
                    if(Dobitak1.hold4 == 1) {
                        try {
                            Thread.sleep(350);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop4.setBackgroundColor(Color.RED);
                        audiostop.start();
                    }
                    if(Dobitak1.hold5 == 1) {
                        try {
                            Thread.sleep(350);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop5.setBackgroundColor(Color.RED);
                        audiostop.start();
                    }
                }
            }
        }, 100,100);

    }

}
