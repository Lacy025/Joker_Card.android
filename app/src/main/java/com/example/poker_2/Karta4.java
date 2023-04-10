package com.example.poker_2;

import static com.example.poker_2.Jokers.k4;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

public class Karta4 extends Activity {

    public static int n4;
    public static int b4;

    public Karta4() {

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Jokers.polje4.setVisibility(View.INVISIBLE);

                if(k4==0) {
                    Jokers.polje4.setImageResource(R.drawable.k00);
                    n4 = 0; b4 = 0;
                }
                if(k4==1) {
                    Jokers.polje4.setImageResource(R.drawable.k01);
                    n4 = 14; b4 = 1;
                }
                if(k4==2) {
                    Jokers.polje4.setImageResource(R.drawable.k02);
                    n4 = 2; b4 = 1;
                }
                if(k4==3) {
                    Jokers.polje4.setImageResource(R.drawable.k03);
                    n4 = 3; b4 = 1;
                }
                if(k4==4) {
                    Jokers.polje4.setImageResource(R.drawable.k04);
                    n4 = 4; b4 = 1;
                }
                if(k4==5) {
                    Jokers.polje4.setImageResource(R.drawable.k05);
                    n4 = 5; b4 = 1;
                }
                if(k4==6) {
                    Jokers.polje4.setImageResource(R.drawable.k06);
                    n4 = 6; b4 = 1;
                }
                if(k4==7) {
                    Jokers.polje4.setImageResource(R.drawable.k07);
                    n4 = 7; b4 = 1;
                }
                if(k4==8) {
                    Jokers.polje4.setImageResource(R.drawable.k08);
                    n4 = 8; b4 = 1;
                }
                if(k4==9) {
                    Jokers.polje4.setImageResource(R.drawable.k09);
                    n4 = 9; b4 = 1;
                }
                if(k4==10) {
                    Jokers.polje4.setImageResource(R.drawable.k10);
                    n4 = 10; b4 = 1;
                }
                if(k4==11) {
                    Jokers.polje4.setImageResource(R.drawable.k11);
                    n4 = 11; b4 = 1;
                }
                if(k4==12) {
                    Jokers.polje4.setImageResource(R.drawable.k12);
                    n4 = 12; b4 = 1;
                }
                if(k4==13) {
                    Jokers.polje4.setImageResource(R.drawable.k13);
                    n4 = 13; b4 = 1;
                }
                if(k4==14) {
                    Jokers.polje4.setImageResource(R.drawable.k14);
                    n4 = 14; b4 = 2;
                }
                if(k4==15) {
                    Jokers.polje4.setImageResource(R.drawable.k15);
                    n4 = 2; b4 = 2;
                }
                if(k4==16) {
                    Jokers.polje4.setImageResource(R.drawable.k16);
                    n4 = 3; b4 = 2;
                }
                if(k4==17) {
                    Jokers.polje4.setImageResource(R.drawable.k17);
                    n4 = 4; b4 = 2;
                }
                if(k4==18) {
                    Jokers.polje4.setImageResource(R.drawable.k18);
                    n4 = 5; b4 = 2;
                }
                if(k4==19) {
                    Jokers.polje4.setImageResource(R.drawable.k19);
                    n4 = 6; b4 = 2;
                }
                if(k4==20) {
                    Jokers.polje4.setImageResource(R.drawable.k20);
                    n4 = 7; b4 = 2;
                }
                if(k4==21) {
                    Jokers.polje4.setImageResource(R.drawable.k21);
                    n4 = 8; b4 = 2;
                }
                if(k4==22) {
                    Jokers.polje4.setImageResource(R.drawable.k22);
                    n4 = 9; b4 = 2;
                }
                if(k4==23) {
                    Jokers.polje4.setImageResource(R.drawable.k23);
                    n4 = 10; b4 = 2;
                }
                if(k4==24) {
                    Jokers.polje4.setImageResource(R.drawable.k24);
                    n4 = 11; b4 = 2;
                }
                if(k4==25) {
                    Jokers.polje4.setImageResource(R.drawable.k25);
                    n4 = 12; b4 = 2;
                }
                if(k4==26) {
                    Jokers.polje4.setImageResource(R.drawable.k26);
                    n4 = 13; b4 = 2;
                }
                if(k4==27) {
                    Jokers.polje4.setImageResource(R.drawable.k27);
                    n4 = 14; b4 = 3;
                }
                if(k4==28) {
                    Jokers.polje4.setImageResource(R.drawable.k28);
                    n4 = 2; b4 = 3;
                }
                if(k4==29) {
                    Jokers.polje4.setImageResource(R.drawable.k29);
                    n4 = 3; b4 = 3;
                }
                if(k4==30) {
                    Jokers.polje4.setImageResource(R.drawable.k30);
                    n4 = 4; b4 = 3;
                }
                if(k4==31) {
                    Jokers.polje4.setImageResource(R.drawable.k31);
                    n4 = 5; b4 = 3;
                }
                if(k4==32) {
                    Jokers.polje4.setImageResource(R.drawable.k32);
                    n4 = 6; b4 = 3;
                }
                if(k4==33) {
                    Jokers.polje4.setImageResource(R.drawable.k33);
                    n4 = 7; b4 = 3;
                }
                if(k4==34) {
                    Jokers.polje4.setImageResource(R.drawable.k34);
                    n4 = 8; b4 = 3;
                }
                if(k4==35) {
                    Jokers.polje4.setImageResource(R.drawable.k35);
                    n4 = 9; b4 = 3;
                }
                if(k4==36) {
                    Jokers.polje4.setImageResource(R.drawable.k36);
                    n4 = 10; b4 = 3;
                }
                if(k4==37) {
                    Jokers.polje4.setImageResource(R.drawable.k37);
                    n4 = 11; b4 = 3;
                }
                if(k4==38) {
                    Jokers.polje4.setImageResource(R.drawable.k38);
                    n4 = 12; b4 = 3;
                }
                if(k4==39) {
                    Jokers.polje4.setImageResource(R.drawable.k39);
                    n4 = 13; b4 = 3;
                }
                if(k4==40) {
                    Jokers.polje4.setImageResource(R.drawable.k40);
                    n4 = 14; b4 = 4;
                }
                if(k4==41) {
                    Jokers.polje4.setImageResource(R.drawable.k41);
                    n4 = 2; b4 = 4;
                }
                if(k4==42) {
                    Jokers.polje4.setImageResource(R.drawable.k42);
                    n4 = 3; b4 = 4;
                }
                if(k4==43) {
                    Jokers.polje4.setImageResource(R.drawable.k43);
                    n4 = 4; b4 = 4;
                }
                if(k4==44) {
                    Jokers.polje4.setImageResource(R.drawable.k44);
                    n4 = 5; b4 = 4;
                }
                if(k4==45) {
                    Jokers.polje4.setImageResource(R.drawable.k45);
                    n4 = 6; b4 = 4;
                }
                if(k4==46) {
                    Jokers.polje4.setImageResource(R.drawable.k46);
                    n4 = 7; b4 = 4;
                }
                if(k4==47) {
                    Jokers.polje4.setImageResource(R.drawable.k47);
                    n4 = 8; b4 = 4;
                }
                if(k4==48) {
                    Jokers.polje4.setImageResource(R.drawable.k48);
                    n4 = 9; b4 = 4;
                }
                if(k4==49) {
                    Jokers.polje4.setImageResource(R.drawable.k49);
                    n4 = 10; b4 = 4;
                }
                if(k4==50) {
                    Jokers.polje4.setImageResource(R.drawable.k50);
                    n4 = 11; b4 = 4;
                }
                if(k4==51) {
                    Jokers.polje4.setImageResource(R.drawable.k51);
                    n4 = 12; b4 = 4;
                }
                if(k4==52) {
                    Jokers.polje4.setImageResource(R.drawable.k52);
                    n4 = 13; b4 = 4;
                }
                    Jokers.polje4.setVisibility(View.VISIBLE);
                if(Jokers.deljenje == 2) {
                    Jokers.audiokarta4.start();
                }
            }
        }, Jokers.pauzak);
    }
}
