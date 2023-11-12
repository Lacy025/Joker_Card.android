package com.example.poker_2;

import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Stop extends AppCompatActivity {
    public Stop() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if (First.stop == 1) {
                    First.stop = 0;

                    if (Dobitak1.hold1 == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        First.button_stop1.setBackgroundColor(Color.RED);
                        First.audiostop1.start();
                    }
                    if (Dobitak1.hold2 == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        First.button_stop2.setBackgroundColor(Color.RED);
                        First.audiostop2.start();
                    }
                    if (Dobitak1.hold3 == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        First.button_stop3.setBackgroundColor(Color.RED);
                        First.audiostop3.start();
                    }
                    if (Dobitak1.hold4 == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        First.button_stop4.setBackgroundColor(Color.RED);
                        First.audiostop4.start();
                    }
                    if (Dobitak1.hold5 == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        First.button_stop5.setBackgroundColor(Color.RED);
                        First.audiostop5.start();
                    }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    First.izbor = 1;
                }
            }
        }, 500,500);
    }
}

