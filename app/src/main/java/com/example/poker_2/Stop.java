package com.example.poker_2;

import static com.example.poker_2.First.audiostop1;
import static com.example.poker_2.First.audiostop2;
import static com.example.poker_2.First.audiostop3;
import static com.example.poker_2.First.audiostop4;
import static com.example.poker_2.First.audiostop5;
import static com.example.poker_2.First.button_stop1;
import static com.example.poker_2.First.button_stop2;
import static com.example.poker_2.First.button_stop3;
import static com.example.poker_2.First.button_stop4;
import static com.example.poker_2.First.button_stop5;

import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Stop extends AppCompatActivity {
    Stop(Runnable stop) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if (First.stop == 1) {
                    First.stop = 0;

                    if (Dobitak1.hold1 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        button_stop1.setBackgroundColor(Color.RED);
                        audiostop1.start();
                    }
                    if (Dobitak1.hold2 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        button_stop2.setBackgroundColor(Color.RED);
                        audiostop2.start();
                    }
                    if (Dobitak1.hold3 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        button_stop3.setBackgroundColor(Color.RED);
                        audiostop3.start();
                    }
                    if (Dobitak1.hold4 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        button_stop4.setBackgroundColor(Color.RED);
                        audiostop4.start();
                    }
                    if (Dobitak1.hold5 == 1 && First.ah == 1) {
                        try {
                            Thread.sleep(280);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        button_stop5.setBackgroundColor(Color.RED);
                        audiostop5.start();
                    }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    First.izbor = 1;
                }
            }
        }, 0,200);
    }
}

