package com.example.poker_2;

import static com.example.poker_2.First.audiocount100;
import static com.example.poker_2.First.audiointro;
import static com.example.poker_2.First.centar2;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Kasiranje extends Activity {
    Timer timer4;
    //Timer timer5;
    Kasiranje() {

        centar2.setText("POBEDIO !");
        centar2.setVisibility(View.VISIBLE);
        First.audiodobitnik.stop();

        timer4 = new Timer();
        //timer5 = new Timer();

        Handler handler1 = new Handler();

        Runnable runnable = new Runnable() {
            boolean isVisible = true;

            @Override
            public void run() {
                isVisible = !isVisible;
                centar2.setVisibility(isVisible ? View.INVISIBLE : View.VISIBLE);
                handler1.postDelayed(this, 400);
            }
        };

        handler1.post(runnable);

        timer4.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(Dobitak2.cifra == 0) {
                                            Dobitak2.cifra = -1;
                                            handler1.removeCallbacks(runnable);
                                            centar2.setText("POBEDIO !");
                                            centar2.setVisibility(View.VISIBLE);
                                            audiocount100.start();
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                throw new RuntimeException(e);
                                            }
                                            audiointro.start();
                                            First.polje1.setImageResource(R.drawable.k53);
                                            First.polje2.setImageResource(R.drawable.k53);
                                            First.polje3.setImageResource(R.drawable.k53);
                                            First.polje4.setImageResource(R.drawable.k53);
                                            First.polje5.setImageResource(R.drawable.k53);
                                            First.stop1.setVisibility(View.VISIBLE);
                                            First.stop2.setVisibility(View.VISIBLE);
                                            First.stop3.setVisibility(View.VISIBLE);
                                            First.stop4.setVisibility(View.VISIBLE);
                                            First.stop5.setVisibility(View.VISIBLE);
                                            First.table.setVisibility(View.INVISIBLE);
                                            First.dobitak.setVisibility(View.INVISIBLE);
                                            First.dobitak1.setVisibility(View.INVISIBLE);
                                            First.dobitak2.setVisibility(View.INVISIBLE);
                                            First.dobitak3.setVisibility(View.INVISIBLE);
                                            First.dobitak4.setVisibility(View.INVISIBLE);
                                            First.dobitak5.setVisibility(View.INVISIBLE);
                                            First.dobitak6.setVisibility(View.INVISIBLE);
                                            First.dobitak7.setVisibility(View.INVISIBLE);
                                            First.dobitak8.setVisibility(View.INVISIBLE);
                                            First.dobitak9.setVisibility(View.INVISIBLE);
                                            First.dobitak10.setVisibility(View.INVISIBLE);
                                            First.dobitakdb.setVisibility(View.INVISIBLE);
                                            First.levodole2.setVisibility(View.INVISIBLE);
                                            First.desnodole2.setVisibility(View.INVISIBLE);

                                            try {
                                                Thread.sleep(4000);
                                            } catch (InterruptedException e) {
                                                throw new RuntimeException(e);
                                            }
                                            centar2.setText("");
                                            centar2.setVisibility(View.INVISIBLE);

                                            Dobitak2.dobitak = 0;
                                            First.kasiranje = 0;
                                            First.izbor = 0;
                                            First.deljenje = 0;
                                        }
                                        if(Dobitak2.cifra > 0) {
                                            minusjedan();
                                        }

                                    }
                                }, 60);
                    }
                });
            }
        }, 0, 60);


/*
        timer5.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                      if(cifra > 0) {
                                          centar2.setText("POBEDIO !");
                                          centar2.setVisibility(View.VISIBLE);
                                      }

                                    }
                                }, 400);
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(cifra > 0) {
                                            centar2.setText("");
                                            centar2.setVisibility(View.INVISIBLE);
                                        }

                                    }
                                }, 800);
                    }
                });
            }
        }, 0, 800);

 */
    }


    public void minusjedan() {
        First.c +=1;
        First.c1.setText(Integer.toString(First.c));
        Dobitak2.cifra -=1;
        First.dobitakdb.setText(Integer.toString(Dobitak2.cifra));
        First.audiocount1.start();
    }
    public void minussto() {
        First.c +=100;
        First.c1.setText(Integer.toString(First.c));
        Dobitak2.cifra -=100;
        First.dobitakdb.setText(Integer.toString(Dobitak2.cifra));
        audiocount100.start();
    }

}
