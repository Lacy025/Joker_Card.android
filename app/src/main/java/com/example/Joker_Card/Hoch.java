package com.example.Joker_Card;

import static com.example.Joker_Card.First.Bingo;
import static com.example.Joker_Card.First.Duplanje;
import static com.example.Joker_Card.First.centar2;
import static com.example.Joker_Card.First.cifra;
import static com.example.Joker_Card.First.dobitakdb;
import static com.example.Joker_Card.First.duplanje;
import static com.example.Joker_Card.First.duplakarta;
import static com.example.Joker_Card.First.promasaj;
import static com.example.Joker_Card.First.dk;
import static com.example.Joker_Card.First.dk1;
import static com.example.Joker_Card.First.dk2;
import static com.example.Joker_Card.First.dk3;
import static com.example.Joker_Card.First.dk4;
import static com.example.Joker_Card.First.dk5;
import static com.example.Joker_Card.First.dk6;
import static com.example.Joker_Card.First.dk7;
import static com.example.Joker_Card.First.dk8;
import static com.example.Joker_Card.First.dk9;
import static com.example.Joker_Card.First.dk10;
import static com.example.Joker_Card.First.dk11;
import static com.example.Joker_Card.First.hoch1;
import static com.example.Joker_Card.First.hoch2;
import static com.example.Joker_Card.First.hoch3;
import static com.example.Joker_Card.First.hoch4;
import static com.example.Joker_Card.First.hoch5;
import static com.example.Joker_Card.First.hoch6;
import static com.example.Joker_Card.First.hoch7;
import static com.example.Joker_Card.First.hoch8;
import static com.example.Joker_Card.First.hoch9;
import static com.example.Joker_Card.First.hoch10;
import static com.example.Joker_Card.First.hoch11;
import static com.example.Joker_Card.First.tief1;
import static com.example.Joker_Card.First.tief2;
import static com.example.Joker_Card.First.tief3;
import static com.example.Joker_Card.First.tief4;
import static com.example.Joker_Card.First.tief5;
import static com.example.Joker_Card.First.tief6;
import static com.example.Joker_Card.First.tief7;
import static com.example.Joker_Card.First.tief8;
import static com.example.Joker_Card.First.tief9;
import static com.example.Joker_Card.First.tief10;
import static com.example.Joker_Card.First.poljeD1;
import static com.example.Joker_Card.First.poljeD2;
import static com.example.Joker_Card.First.poljeD3;
import static com.example.Joker_Card.First.poljeD4;
import static com.example.Joker_Card.First.poljeD5;
import static com.example.Joker_Card.First.poljeD6;
import static com.example.Joker_Card.First.poljeD7;
import static com.example.Joker_Card.First.poljeD8;
import static com.example.Joker_Card.First.poljeD9;
import static com.example.Joker_Card.First.poljeD10;
import static com.example.Joker_Card.First.poljeD11;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
public class Hoch extends Activity {
    public static Handler handler12;
    public static Runnable runnable12;
    Hoch() throws InterruptedException {

        if(duplakarta == 1) {
            poljeD1.setVisibility(View.INVISIBLE);
            hoch1.setVisibility(View.VISIBLE);
            dk = dk1;
        }
        if(duplakarta == 2) {
            poljeD2.setVisibility(View.INVISIBLE);
            tief1.setVisibility(View.INVISIBLE);
            hoch1.setVisibility(View.INVISIBLE);
            hoch2.setVisibility(View.VISIBLE);
            dk = dk2;
        }
        if(duplakarta == 3) {
            poljeD3.setVisibility(View.INVISIBLE);
            tief2.setVisibility(View.INVISIBLE);
            hoch2.setVisibility(View.INVISIBLE);
            hoch3.setVisibility(View.VISIBLE);
            dk = dk3;
        }
        if(duplakarta == 4) {
            poljeD4.setVisibility(View.INVISIBLE);
            tief3.setVisibility(View.INVISIBLE);
            hoch3.setVisibility(View.INVISIBLE);
            hoch4.setVisibility(View.VISIBLE);
            dk = dk4;
        }
        if(duplakarta == 5) {
            poljeD5.setVisibility(View.INVISIBLE);
            tief4.setVisibility(View.INVISIBLE);
            hoch4.setVisibility(View.INVISIBLE);
            hoch5.setVisibility(View.VISIBLE);
            dk = dk5;
        }
        if(duplakarta == 6) {
            poljeD6.setVisibility(View.INVISIBLE);
            tief5.setVisibility(View.INVISIBLE);
            hoch5.setVisibility(View.INVISIBLE);
            hoch6.setVisibility(View.VISIBLE);
            dk = dk6;
        }
        if(duplakarta == 7) {
            poljeD7.setVisibility(View.INVISIBLE);
            tief6.setVisibility(View.INVISIBLE);
            hoch6.setVisibility(View.INVISIBLE);
            hoch7.setVisibility(View.VISIBLE);
            dk = dk7;
        }
        if(duplakarta == 8) {
            poljeD8.setVisibility(View.INVISIBLE);
            tief7.setVisibility(View.INVISIBLE);
            hoch7.setVisibility(View.INVISIBLE);
            hoch8.setVisibility(View.VISIBLE);
            dk = dk8;
        }
        if(duplakarta == 9) {
            poljeD9.setVisibility(View.INVISIBLE);
            tief8.setVisibility(View.INVISIBLE);
            hoch8.setVisibility(View.INVISIBLE);
            hoch9.setVisibility(View.VISIBLE);
            dk = dk9;
        }
        if(duplakarta == 10) {
            poljeD10.setVisibility(View.INVISIBLE);
            tief9.setVisibility(View.INVISIBLE);
            hoch9.setVisibility(View.INVISIBLE);
            hoch10.setVisibility(View.VISIBLE);
            dk = dk10;
        }
        if(duplakarta == 11) {
            poljeD11.setVisibility(View.INVISIBLE);
            tief10.setVisibility(View.INVISIBLE);
            hoch10.setVisibility(View.INVISIBLE);
            hoch11.setVisibility(View.VISIBLE);
            dk = dk11;
        }

        new Duplakarta();

        if (dk > 24) {
            Bingo();
        }
        handler12 = new Handler();
        runnable12 = new Runnable() {
            @Override
            public void run() {
                if (dk > 24) {
                    try {
                        Thread.sleep(1600);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    centar2.setVisibility(View.INVISIBLE);
                    duplanje = 1;
                    handler12.removeCallbacks(runnable12);
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
        handler12.post(runnable12);
    }
}
