package com.example.poker_2;

import static com.example.poker_2.Jokers.k1;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;

public class Karta1 extends Activity {

    public static int n1;
    public static int b1;

    public Karta1(Runnable polje1) {

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Jokers.polje1.setVisibility(View.INVISIBLE);

                if(k1==0) {
                    Jokers.polje1.setImageResource(R.drawable.k00);
                    n1 = 0; b1 = 0;
                }
                if(k1==1) {
                    Jokers.polje1.setImageResource(R.drawable.k01);
                    n1 = 14; b1 = 1;
                }
                if(k1==2) {
                    Jokers.polje1.setImageResource(R.drawable.k02);
                    n1 = 2; b1 = 1;
                }
                if(k1==3) {
                    Jokers.polje1.setImageResource(R.drawable.k03);
                    n1 = 3; b1 = 1;
                }
                if(k1==4) {
                    Jokers.polje1.setImageResource(R.drawable.k04);
                    n1 = 4; b1 = 1;
                }
                if(k1==5) {
                    Jokers.polje1.setImageResource(R.drawable.k05);
                    n1 = 5; b1 = 1;
                }
                if(k1==6) {
                    Jokers.polje1.setImageResource(R.drawable.k06);
                    n1 = 6; b1 = 1;
                }
                if(k1==7) {
                    Jokers.polje1.setImageResource(R.drawable.k07);
                    n1 = 7; b1 = 1;
                }
                if(k1==8) {
                    Jokers.polje1.setImageResource(R.drawable.k08);
                    n1 = 8; b1 = 1;
                }
                if(k1==9) {
                    Jokers.polje1.setImageResource(R.drawable.k09);
                    n1 = 9; b1 = 1;
                }
                if(k1==10) {
                    Jokers.polje1.setImageResource(R.drawable.k10);
                    n1 = 10; b1 = 1;
                }
                if(k1==11) {
                    Jokers.polje1.setImageResource(R.drawable.k11);
                    n1 = 11; b1 = 1;
                }
                if(k1==12) {
                    Jokers.polje1.setImageResource(R.drawable.k12);
                    n1 = 12; b1 = 1;
                }
                if(k1==13) {
                    Jokers.polje1.setImageResource(R.drawable.k13);
                    n1 = 13; b1 = 1;
                }
                if(k1==14) {
                    Jokers.polje1.setImageResource(R.drawable.k14);
                    n1 = 14; b1 = 2;
                }
                if(k1==15) {
                    Jokers.polje1.setImageResource(R.drawable.k15);
                    n1 = 2; b1 = 2;
                }
                if(k1==16) {
                    Jokers.polje1.setImageResource(R.drawable.k16);
                    n1 = 3; b1 = 2;
                }
                if(k1==17) {
                    Jokers.polje1.setImageResource(R.drawable.k17);
                    n1 = 4; b1 = 2;
                }
                if(k1==18) {
                    Jokers.polje1.setImageResource(R.drawable.k18);
                    n1 = 5; b1 = 2;
                }
                if(k1==19) {
                    Jokers.polje1.setImageResource(R.drawable.k19);
                    n1 = 6; b1 = 2;
                }
                if(k1==20) {
                    Jokers.polje1.setImageResource(R.drawable.k20);
                    n1 = 7; b1 = 2;
                }
                if(k1==21) {
                    Jokers.polje1.setImageResource(R.drawable.k21);
                    n1 = 8; b1 = 2;
                }
                if(k1==22) {
                    Jokers.polje1.setImageResource(R.drawable.k22);
                    n1 = 9; b1 = 2;
                }
                if(k1==23) {
                    Jokers.polje1.setImageResource(R.drawable.k23);
                    n1 = 10; b1 = 2;
                }
                if(k1==24) {
                    Jokers.polje1.setImageResource(R.drawable.k24);
                    n1 = 11; b1 = 2;
                }
                if(k1==25) {
                    Jokers.polje1.setImageResource(R.drawable.k25);
                    n1 = 12; b1 = 2;
                }
                if(k1==26) {
                    Jokers.polje1.setImageResource(R.drawable.k26);
                    n1 = 13; b1 = 2;
                }
                if(k1==27) {
                    Jokers.polje1.setImageResource(R.drawable.k27);
                    n1 = 14; b1 = 3;
                }
                if(k1==28) {
                    Jokers.polje1.setImageResource(R.drawable.k28);
                    n1 = 2; b1 = 3;
                }
                if(k1==29) {
                    Jokers.polje1.setImageResource(R.drawable.k29);
                    n1 = 3; b1 = 3;
                }
                if(k1==30) {
                    Jokers.polje1.setImageResource(R.drawable.k30);
                    n1 = 4; b1 = 3;
                }
                if(k1==31) {
                    Jokers.polje1.setImageResource(R.drawable.k31);
                    n1 = 5; b1 = 3;
                }
                if(k1==32) {
                    Jokers.polje1.setImageResource(R.drawable.k32);
                    n1 = 6; b1 = 3;
                }
                if(k1==33) {
                    Jokers.polje1.setImageResource(R.drawable.k33);
                    n1 = 7; b1 = 3;
                }
                if(k1==34) {
                    Jokers.polje1.setImageResource(R.drawable.k34);
                    n1 = 8; b1 = 3;
                }
                if(k1==35) {
                    Jokers.polje1.setImageResource(R.drawable.k35);
                    n1 = 9; b1 = 3;
                }
                if(k1==36) {
                    Jokers.polje1.setImageResource(R.drawable.k36);
                    n1 = 10; b1 = 3;
                }
                if(k1==37) {
                    Jokers.polje1.setImageResource(R.drawable.k37);
                    n1 = 11; b1 = 3;
                }
                if(k1==38) {
                    Jokers.polje1.setImageResource(R.drawable.k38);
                    n1 = 12; b1 = 3;
                }
                if(k1==39) {
                    Jokers.polje1.setImageResource(R.drawable.k39);
                    n1 = 13; b1 = 3;
                }
                if(k1==40) {
                    Jokers.polje1.setImageResource(R.drawable.k40);
                    n1 = 14; b1 = 4;
                }
                if(k1==41) {
                    Jokers.polje1.setImageResource(R.drawable.k41);
                    n1 = 2; b1 = 4;
                }
                if(k1==42) {
                    Jokers.polje1.setImageResource(R.drawable.k42);
                    n1 = 3; b1 = 4;
                }
                if(k1==43) {
                    Jokers.polje1.setImageResource(R.drawable.k43);
                    n1 = 4; b1 = 4;
                }
                if(k1==44) {
                    Jokers.polje1.setImageResource(R.drawable.k44);
                    n1 = 5; b1 = 4;
                }
                if(k1==45) {
                    Jokers.polje1.setImageResource(R.drawable.k45);
                    n1 = 6; b1 = 4;
                }
                if(k1==46) {
                    Jokers.polje1.setImageResource(R.drawable.k46);
                    n1 = 7; b1 = 4;
                }
                if(k1==47) {
                    Jokers.polje1.setImageResource(R.drawable.k47);
                    n1 = 8; b1 = 4;
                }
                if(k1==48) {
                    Jokers.polje1.setImageResource(R.drawable.k48);
                    n1 = 9; b1 = 4;
                }
                if(k1==49) {
                    Jokers.polje1.setImageResource(R.drawable.k49);
                    n1 = 10; b1 = 4;
                }
                if(k1==50) {
                    Jokers.polje1.setImageResource(R.drawable.k50);
                    n1 = 11; b1 = 4;
                }
                if(k1==51) {
                    Jokers.polje1.setImageResource(R.drawable.k51);
                    n1 = 12; b1 = 4;
                }
                if(k1==52) {
                    Jokers.polje1.setImageResource(R.drawable.k52);
                    n1 = 13; b1 = 4;
                }
                    Jokers.polje1.setVisibility(View.VISIBLE);
            }
        }, 500);
    }
}
