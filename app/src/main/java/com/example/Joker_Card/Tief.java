package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.Bingo;
import static com.example.Joker_Card.MainClass.Duplanje;
import static com.example.Joker_Card.MainClass.centar2;
import static com.example.Joker_Card.MainClass.cifra;
import static com.example.Joker_Card.MainClass.dobitakdb;
import static com.example.Joker_Card.MainClass.duplanje;
import static com.example.Joker_Card.MainClass.duplakarta;
import static com.example.Joker_Card.MainClass.promasaj;
import static com.example.Joker_Card.MainClass.dk;
import static com.example.Joker_Card.MainClass.dk1;
import static com.example.Joker_Card.MainClass.dk2;
import static com.example.Joker_Card.MainClass.dk3;
import static com.example.Joker_Card.MainClass.dk4;
import static com.example.Joker_Card.MainClass.dk5;
import static com.example.Joker_Card.MainClass.dk6;
import static com.example.Joker_Card.MainClass.dk7;
import static com.example.Joker_Card.MainClass.dk8;
import static com.example.Joker_Card.MainClass.dk9;
import static com.example.Joker_Card.MainClass.dk10;
import static com.example.Joker_Card.MainClass.dk11;
import static com.example.Joker_Card.MainClass.hoch1;
import static com.example.Joker_Card.MainClass.hoch2;
import static com.example.Joker_Card.MainClass.hoch3;
import static com.example.Joker_Card.MainClass.hoch4;
import static com.example.Joker_Card.MainClass.hoch5;
import static com.example.Joker_Card.MainClass.hoch6;
import static com.example.Joker_Card.MainClass.hoch7;
import static com.example.Joker_Card.MainClass.hoch8;
import static com.example.Joker_Card.MainClass.hoch9;
import static com.example.Joker_Card.MainClass.hoch10;
import static com.example.Joker_Card.MainClass.tief1;
import static com.example.Joker_Card.MainClass.tief2;
import static com.example.Joker_Card.MainClass.tief3;
import static com.example.Joker_Card.MainClass.tief4;
import static com.example.Joker_Card.MainClass.tief5;
import static com.example.Joker_Card.MainClass.tief6;
import static com.example.Joker_Card.MainClass.tief7;
import static com.example.Joker_Card.MainClass.tief8;
import static com.example.Joker_Card.MainClass.tief9;
import static com.example.Joker_Card.MainClass.tief10;
import static com.example.Joker_Card.MainClass.tief11;
import static com.example.Joker_Card.MainClass.poljeD1;
import static com.example.Joker_Card.MainClass.poljeD2;
import static com.example.Joker_Card.MainClass.poljeD3;
import static com.example.Joker_Card.MainClass.poljeD4;
import static com.example.Joker_Card.MainClass.poljeD5;
import static com.example.Joker_Card.MainClass.poljeD6;
import static com.example.Joker_Card.MainClass.poljeD7;
import static com.example.Joker_Card.MainClass.poljeD8;
import static com.example.Joker_Card.MainClass.poljeD9;
import static com.example.Joker_Card.MainClass.poljeD10;
import static com.example.Joker_Card.MainClass.poljeD11;

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

        new GambleCard();

        if (dk < 25) {
            Bingo();
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
                    new Cashed();
                }
            }
        };
        handler11.post(runnable11);
    }
}
