package com.example.poker_2;

import static com.example.poker_2.First.centar2;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

public class Kasirano extends Activity {
    public static Handler handler9;
    public static Runnable runnable9;

    Kasirano() {

        handler9 = new Handler();
        runnable9 = () -> {

                if(First.kasiranje == 1) {
                    centar2.setVisibility(View.VISIBLE);
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
                    First.polje1.setVisibility(View.INVISIBLE);
                    First.polje2.setVisibility(View.INVISIBLE);
                    First.polje3.setVisibility(View.INVISIBLE);
                    First.polje4.setVisibility(View.INVISIBLE);
                    First.polje5.setVisibility(View.INVISIBLE);

                    centar2.setText("");
                    centar2.setVisibility(View.INVISIBLE);
                    centar2.setText("");
                    centar2.setVisibility(View.INVISIBLE);

                    Jokers.handler1.removeCallbacks(Jokers.runnable1);
                    Jokers.handler2.removeCallbacks(Jokers.runnable2);
                    Jokers.handler3.removeCallbacks(Jokers.runnable3);
                    Jokers.handler4.removeCallbacks(Jokers.runnable4);
                    Jokers.handler5.removeCallbacks(Jokers.runnable5);
                    Jokers.handler6.removeCallbacks(Jokers.runnable6);
                    Jokers.handler7.removeCallbacks(Jokers.runnable7);
                    Jokers.handler8.removeCallbacks(Jokers.runnable8);

                    First.polje1.setImageResource(R.drawable.k53);
                    First.polje2.setImageResource(R.drawable.k53);
                    First.polje3.setImageResource(R.drawable.k53);
                    First.polje4.setImageResource(R.drawable.k53);
                    First.polje5.setImageResource(R.drawable.k53);
                    First.joker.setText("JOKER");
                    First.card.setText("CARD");
                    First.joker.setVisibility(View.VISIBLE);
                    First.card.setVisibility(View.VISIBLE);
                    First.deljenje = 0;
                    First.kasirano = 0;
                    First.kasiranje = 0;
                    First.biodobitak = 0;
                    First.izbor = 0;
                }
        };
        handler9.postDelayed(runnable9,3600);
    }
}
