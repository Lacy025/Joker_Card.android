package com.example.poker_2;

import static com.example.poker_2.First.Duplanje;
import static com.example.poker_2.First.audiobingo;
import static com.example.poker_2.First.centar2;
import static com.example.poker_2.First.cifra;
import static com.example.poker_2.First.dobitakdb;
import static com.example.poker_2.First.duplanje;
import static com.example.poker_2.First.duplakarta;
import static com.example.poker_2.First.promasaj;
import static com.example.poker_2.First.dk;
import static com.example.poker_2.First.dk1;
import static com.example.poker_2.First.dk2;
import static com.example.poker_2.First.dk3;
import static com.example.poker_2.First.dk4;
import static com.example.poker_2.First.dk5;
import static com.example.poker_2.First.dk6;
import static com.example.poker_2.First.dk7;
import static com.example.poker_2.First.dk8;
import static com.example.poker_2.First.dk9;
import static com.example.poker_2.First.dk10;
import static com.example.poker_2.First.dk11;
import static com.example.poker_2.First.hoch1;
import static com.example.poker_2.First.hoch2;
import static com.example.poker_2.First.hoch3;
import static com.example.poker_2.First.hoch4;
import static com.example.poker_2.First.hoch5;
import static com.example.poker_2.First.hoch6;
import static com.example.poker_2.First.hoch7;
import static com.example.poker_2.First.hoch8;
import static com.example.poker_2.First.hoch9;
import static com.example.poker_2.First.hoch10;
import static com.example.poker_2.First.tief1;
import static com.example.poker_2.First.tief2;
import static com.example.poker_2.First.tief3;
import static com.example.poker_2.First.tief4;
import static com.example.poker_2.First.tief5;
import static com.example.poker_2.First.tief6;
import static com.example.poker_2.First.tief7;
import static com.example.poker_2.First.tief8;
import static com.example.poker_2.First.tief9;
import static com.example.poker_2.First.tief10;
import static com.example.poker_2.First.tief11;
import static com.example.poker_2.First.poljeD1;
import static com.example.poker_2.First.poljeD2;
import static com.example.poker_2.First.poljeD3;
import static com.example.poker_2.First.poljeD4;
import static com.example.poker_2.First.poljeD5;
import static com.example.poker_2.First.poljeD6;
import static com.example.poker_2.First.poljeD7;
import static com.example.poker_2.First.poljeD8;
import static com.example.poker_2.First.poljeD9;
import static com.example.poker_2.First.poljeD10;
import static com.example.poker_2.First.poljeD11;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
public class Tief extends Activity {
    public static Handler handler11;
    public static Runnable runnable11;
    Tief() throws InterruptedException {

        if(duplakarta == 1) {
            poljeD1.setVisibility(View.INVISIBLE);
            tief1.setVisibility(View.VISIBLE);
            dk = dk1;
        }
        if(duplakarta == 2) {
            poljeD2.setVisibility(View.INVISIBLE);
            tief1.setVisibility(View.INVISIBLE);
            hoch1.setVisibility(View.INVISIBLE);
            tief2.setVisibility(View.VISIBLE);
            dk = dk2;
        }
        if(duplakarta == 3) {
            poljeD3.setVisibility(View.INVISIBLE);
            tief2.setVisibility(View.INVISIBLE);
            hoch2.setVisibility(View.INVISIBLE);
            tief3.setVisibility(View.VISIBLE);
            dk = dk3;
        }
        if(duplakarta == 4) {
            poljeD4.setVisibility(View.INVISIBLE);
            tief3.setVisibility(View.INVISIBLE);
            hoch3.setVisibility(View.INVISIBLE);
            tief4.setVisibility(View.VISIBLE);
            dk = dk4;
        }
        if(duplakarta == 5) {
            poljeD5.setVisibility(View.INVISIBLE);
            tief4.setVisibility(View.INVISIBLE);
            hoch4.setVisibility(View.INVISIBLE);
            tief5.setVisibility(View.VISIBLE);
            dk = dk5;
        }
        if(duplakarta == 6) {
            poljeD6.setVisibility(View.INVISIBLE);
            tief5.setVisibility(View.INVISIBLE);
            hoch5.setVisibility(View.INVISIBLE);
            tief6.setVisibility(View.VISIBLE);
            dk = dk6;
        }
        if(duplakarta == 7) {
            poljeD7.setVisibility(View.INVISIBLE);
            tief6.setVisibility(View.INVISIBLE);
            hoch6.setVisibility(View.INVISIBLE);
            tief7.setVisibility(View.VISIBLE);
            dk = dk7;
        }
        if(duplakarta == 8) {
            poljeD8.setVisibility(View.INVISIBLE);
            tief7.setVisibility(View.INVISIBLE);
            hoch7.setVisibility(View.INVISIBLE);
            tief8.setVisibility(View.VISIBLE);
            dk = dk8;
        }
        if(duplakarta == 9) {
            poljeD9.setVisibility(View.INVISIBLE);
            tief8.setVisibility(View.INVISIBLE);
            hoch8.setVisibility(View.INVISIBLE);
            tief9.setVisibility(View.VISIBLE);
            dk = dk9;
        }
        if(duplakarta == 10) {
            poljeD10.setVisibility(View.INVISIBLE);
            tief9.setVisibility(View.INVISIBLE);
            hoch9.setVisibility(View.INVISIBLE);
            tief10.setVisibility(View.VISIBLE);
            dk = dk10;
        }
        if(duplakarta == 11) {
            poljeD11.setVisibility(View.INVISIBLE);
            tief10.setVisibility(View.INVISIBLE);
            hoch10.setVisibility(View.INVISIBLE);
            tief11.setVisibility(View.VISIBLE);
            dk = dk11;
        }

        new Duplakarta();

        if (dk < 25) {
            tiefbingo();
        }
        handler11 = new Handler();
        runnable11 = new Runnable() {
            @Override
            public void run() {
                if (dk < 25) {
                    try {
                        Thread.sleep(1600);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    centar2.setVisibility(View.INVISIBLE);
                    duplanje = 1;
                    handler11.removeCallbacks(runnable11);
                    duplakarta++;
                    Duplanje();
                }
                else {
                    cifra = 0;
                    dobitakdb.setText(Integer.toString(cifra));
                    promasaj = 1;
                    new Kasirano();
                }
            }
        };
        handler11.post(runnable11);
    }
    void tiefbingo() {
        cifra *= 2;
        dobitakdb.setText(Integer.toString(cifra));
        centar2.setText("YOU WIN !");
        centar2.setVisibility(View.VISIBLE);
        audiobingo.start();
    }
}
