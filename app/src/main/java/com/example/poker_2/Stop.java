package com.example.poker_2;

import static com.example.poker_2.First.audiostop;
import static com.example.poker_2.First.stop1;
import static com.example.poker_2.First.stop2;
import static com.example.poker_2.First.stop3;
import static com.example.poker_2.First.stop4;
import static com.example.poker_2.First.stop5;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;

import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Stop extends Activity {
    Stop(Runnable runnable) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if(First.stop == 1) {
                    First.stop = 0;

                    if(Dobitak1.hold1 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop1.setBackgroundColor(Color.RED);
                        audiostop.start();
                    }
                    if(Dobitak1.hold2 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop2.setBackgroundColor(Color.RED);
                        audiostop.start();
                    }
                    if(Dobitak1.hold3 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop3.setBackgroundColor(Color.RED);
                        audiostop.start();
                    }
                    if(Dobitak1.hold4 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop4.setBackgroundColor(Color.RED);
                        audiostop.start();
                    }
                    if(Dobitak1.hold5 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(300);
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
