package com.example.poker_2;

import static com.example.poker_2.Jokers.k3;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

public class Karta3 extends Activity {

    public static int n3;
    public static int b3;

    public Karta3(Runnable polje3) {

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Jokers.polje3.setVisibility(View.INVISIBLE);

                if(k3==0) {
                    Jokers.polje3.setImageResource(R.drawable.k00);
                    n3 = 0; b3 = 0;
                }
                if(k3==1) {
                    Jokers.polje3.setImageResource(R.drawable.k01);
                    n3 = 14; b3 = 1;
                }
                if(k3==2) {
                    Jokers.polje3.setImageResource(R.drawable.k02);
                    n3 = 2; b3 = 1;
                }
                if(k3==3) {
                    Jokers.polje3.setImageResource(R.drawable.k03);
                    n3 = 3; b3 = 1;
                }
                if(k3==4) {
                    Jokers.polje3.setImageResource(R.drawable.k04);
                    n3 = 4; b3 = 1;
                }
                if(k3==5) {
                    Jokers.polje3.setImageResource(R.drawable.k05);
                    n3 = 5; b3 = 1;
                }
                if(k3==6) {
                    Jokers.polje3.setImageResource(R.drawable.k06);
                    n3 = 6; b3 = 1;
                }
                if(k3==7) {
                    Jokers.polje3.setImageResource(R.drawable.k07);
                    n3 = 7; b3 = 1;
                }
                if(k3==8) {
                    Jokers.polje3.setImageResource(R.drawable.k08);
                    n3 = 8; b3 = 1;
                }
                if(k3==9) {
                    Jokers.polje3.setImageResource(R.drawable.k09);
                    n3 = 9; b3 = 1;
                }
                if(k3==10) {
                    Jokers.polje3.setImageResource(R.drawable.k10);
                    n3 = 10; b3 = 1;
                }
                if(k3==11) {
                    Jokers.polje3.setImageResource(R.drawable.k11);
                    n3 = 11; b3 = 1;
                }
                if(k3==12) {
                    Jokers.polje3.setImageResource(R.drawable.k12);
                    n3 = 12; b3 = 1;
                }
                if(k3==13) {
                    Jokers.polje3.setImageResource(R.drawable.k13);
                    n3 = 13; b3 = 1;
                }
                if(k3==14) {
                    Jokers.polje3.setImageResource(R.drawable.k14);
                    n3 = 14; b3 = 2;
                }
                if(k3==15) {
                    Jokers.polje3.setImageResource(R.drawable.k15);
                    n3 = 2; b3 = 2;
                }
                if(k3==16) {
                    Jokers.polje3.setImageResource(R.drawable.k16);
                    n3 = 3; b3 = 2;
                }
                if(k3==17) {
                    Jokers.polje3.setImageResource(R.drawable.k17);
                    n3 = 4; b3 = 2;
                }
                if(k3==18) {
                    Jokers.polje3.setImageResource(R.drawable.k18);
                    n3 = 5; b3 = 2;
                }
                if(k3==19) {
                    Jokers.polje3.setImageResource(R.drawable.k19);
                    n3 = 6; b3 = 2;
                }
                if(k3==20) {
                    Jokers.polje3.setImageResource(R.drawable.k20);
                    n3 = 7; b3 = 2;
                }
                if(k3==21) {
                    Jokers.polje3.setImageResource(R.drawable.k21);
                    n3 = 8; b3 = 2;
                }
                if(k3==22) {
                    Jokers.polje3.setImageResource(R.drawable.k22);
                    n3 = 9; b3 = 2;
                }
                if(k3==23) {
                    Jokers.polje3.setImageResource(R.drawable.k23);
                    n3 = 10; b3 = 2;
                }
                if(k3==24) {
                    Jokers.polje3.setImageResource(R.drawable.k24);
                    n3 = 11; b3 = 2;
                }
                if(k3==25) {
                    Jokers.polje3.setImageResource(R.drawable.k25);
                    n3 = 12; b3 = 2;
                }
                if(k3==26) {
                    Jokers.polje3.setImageResource(R.drawable.k26);
                    n3 = 13; b3 = 2;
                }
                if(k3==27) {
                    Jokers.polje3.setImageResource(R.drawable.k27);
                    n3 = 14; b3 = 3;
                }
                if(k3==28) {
                    Jokers.polje3.setImageResource(R.drawable.k28);
                    n3 = 2; b3 = 3;
                }
                if(k3==29) {
                    Jokers.polje3.setImageResource(R.drawable.k29);
                    n3 = 3; b3 = 3;
                }
                if(k3==30) {
                    Jokers.polje3.setImageResource(R.drawable.k30);
                    n3 = 4; b3 = 3;
                }
                if(k3==31) {
                    Jokers.polje3.setImageResource(R.drawable.k31);
                    n3 = 5; b3 = 3;
                }
                if(k3==32) {
                    Jokers.polje3.setImageResource(R.drawable.k32);
                    n3 = 6; b3 = 3;
                }
                if(k3==33) {
                    Jokers.polje3.setImageResource(R.drawable.k33);
                    n3 = 7; b3 = 3;
                }
                if(k3==34) {
                    Jokers.polje3.setImageResource(R.drawable.k34);
                    n3 = 8; b3 = 3;
                }
                if(k3==35) {
                    Jokers.polje3.setImageResource(R.drawable.k35);
                    n3 = 9; b3 = 3;
                }
                if(k3==36) {
                    Jokers.polje3.setImageResource(R.drawable.k36);
                    n3 = 10; b3 = 3;
                }
                if(k3==37) {
                    Jokers.polje3.setImageResource(R.drawable.k37);
                    n3 = 11; b3 = 3;
                }
                if(k3==38) {
                    Jokers.polje3.setImageResource(R.drawable.k38);
                    n3 = 12; b3 = 3;
                }
                if(k3==39) {
                    Jokers.polje3.setImageResource(R.drawable.k39);
                    n3 = 13; b3 = 3;
                }
                if(k3==40) {
                    Jokers.polje3.setImageResource(R.drawable.k40);
                    n3 = 14; b3 = 4;
                }
                if(k3==41) {
                    Jokers.polje3.setImageResource(R.drawable.k41);
                    n3 = 2; b3 = 4;
                }
                if(k3==42) {
                    Jokers.polje3.setImageResource(R.drawable.k42);
                    n3 = 3; b3 = 4;
                }
                if(k3==43) {
                    Jokers.polje3.setImageResource(R.drawable.k43);
                    n3 = 4; b3 = 4;
                }
                if(k3==44) {
                    Jokers.polje3.setImageResource(R.drawable.k44);
                    n3 = 5; b3 = 4;
                }
                if(k3==45) {
                    Jokers.polje3.setImageResource(R.drawable.k45);
                    n3 = 6; b3 = 4;
                }
                if(k3==46) {
                    Jokers.polje3.setImageResource(R.drawable.k46);
                    n3 = 7; b3 = 4;
                }
                if(k3==47) {
                    Jokers.polje3.setImageResource(R.drawable.k47);
                    n3 = 8; b3 = 4;
                }
                if(k3==48) {
                    Jokers.polje3.setImageResource(R.drawable.k48);
                    n3 = 9; b3 = 4;
                }
                if(k3==49) {
                    Jokers.polje3.setImageResource(R.drawable.k49);
                    n3 = 10; b3 = 4;
                }
                if(k3==50) {
                    Jokers.polje3.setImageResource(R.drawable.k50);
                    n3 = 11; b3 = 4;
                }
                if(k3==51) {
                    Jokers.polje3.setImageResource(R.drawable.k51);
                    n3 = 12; b3 = 4;
                }
                if(k3==52) {
                    Jokers.polje3.setImageResource(R.drawable.k52);
                    n3 = 13; b3 = 4;
                }
                    Jokers.polje3.setVisibility(View.VISIBLE);
            }
        }, 700);
    }
}
