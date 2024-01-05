package com.example.joker_card;

import static com.example.joker_card.MainClass.double_card;
import static com.example.joker_card.MainClass.dk1;
import static com.example.joker_card.MainClass.dk2;
import static com.example.joker_card.MainClass.dk3;
import static com.example.joker_card.MainClass.dk4;
import static com.example.joker_card.MainClass.dk5;
import static com.example.joker_card.MainClass.dk6;
import static com.example.joker_card.MainClass.dk7;
import static com.example.joker_card.MainClass.dk8;
import static com.example.joker_card.MainClass.dk9;
import static com.example.joker_card.MainClass.dk10;
import static com.example.joker_card.MainClass.dk11;
import static com.example.joker_card.MainClass.field_win_1;
import static com.example.joker_card.MainClass.field_win_2;
import static com.example.joker_card.MainClass.field_win_3;
import static com.example.joker_card.MainClass.field_win_4;
import static com.example.joker_card.MainClass.field_win_5;
import static com.example.joker_card.MainClass.field_win_6;
import static com.example.joker_card.MainClass.field_win_7;
import static com.example.joker_card.MainClass.field_win_8;
import static com.example.joker_card.MainClass.field_win_9;
import static com.example.joker_card.MainClass.field_win_10;
import static com.example.joker_card.MainClass.field_win_11;

import android.view.View;
import android.widget.ImageView;

public class GambleCard {
    int dkx;
    ImageView field_gamble;
    GambleCard() {
        if(double_card == 1) {
            dkx = dk1;
            field_gamble = field_win_1;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 2) {
            dkx = dk2;
            field_gamble = field_win_2;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 3) {
            dkx = dk3;
            field_gamble = field_win_3;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 4) {
            dkx = dk4;
            field_gamble = field_win_4;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 5) {
            dkx = dk5;
            field_gamble = field_win_5;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 6) {
            dkx = dk6;
            field_gamble = field_win_6;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 7) {
            dkx = dk7;
            field_gamble = field_win_7;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 8) {
            dkx = dk8;
            field_gamble = field_win_8;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 9) {
            dkx = dk9;
            field_gamble = field_win_9;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 10) {
            dkx = dk10;
            field_gamble = field_win_10;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 11) {
            dkx = dk11;
            field_gamble = field_win_11;
            field_gamble.setVisibility(View.INVISIBLE);
        }

        if (dkx == 1) {
            field_gamble.setImageResource(R.drawable.k01);
        }
        if (dkx == 2) {
            field_gamble.setImageResource(R.drawable.k02);
        }
        if (dkx == 3) {
            field_gamble.setImageResource(R.drawable.k03);
        }
        if (dkx == 4) {
            field_gamble.setImageResource(R.drawable.k04);
        }
        if (dkx == 5) {
            field_gamble.setImageResource(R.drawable.k05);
        }
        if (dkx == 6) {
            field_gamble.setImageResource(R.drawable.k06);
        }
        if (dkx == 7) {
            field_gamble.setImageResource(R.drawable.k14);
        }
        if (dkx == 8) {
            field_gamble.setImageResource(R.drawable.k15);
        }
        if (dkx == 9) {
            field_gamble.setImageResource(R.drawable.k16);
        }
        if (dkx == 10) {
            field_gamble.setImageResource(R.drawable.k17);
        }
        if (dkx == 11) {
            field_gamble.setImageResource(R.drawable.k18);
        }
        if (dkx == 12) {
            field_gamble.setImageResource(R.drawable.k19);
        }
        if (dkx == 13) {
            field_gamble.setImageResource(R.drawable.k27);
        }
        if (dkx == 14) {
            field_gamble.setImageResource(R.drawable.k28);
        }
        if (dkx == 15) {
            field_gamble.setImageResource(R.drawable.k29);
        }
        if (dkx == 16) {
            field_gamble.setImageResource(R.drawable.k30);
        }
        if (dkx == 17) {
            field_gamble.setImageResource(R.drawable.k31);
        }
        if (dkx == 18) {
            field_gamble.setImageResource(R.drawable.k32);
        }
        if (dkx == 19) {
            field_gamble.setImageResource(R.drawable.k40);
        }
        if (dkx == 20) {
            field_gamble.setImageResource(R.drawable.k41);
        }
        if (dkx == 21) {
            field_gamble.setImageResource(R.drawable.k42);
        }
        if (dkx == 22) {
            field_gamble.setImageResource(R.drawable.k43);
        }
        if (dkx == 23) {
            field_gamble.setImageResource(R.drawable.k44);
        }
        if (dkx == 24) {
            field_gamble.setImageResource(R.drawable.k45);
        }
        if (dkx == 25) {
            field_gamble.setImageResource(R.drawable.k08);
        }
        if (dkx == 26) {
            field_gamble.setImageResource(R.drawable.k09);
        }
        if (dkx == 27) {
            field_gamble.setImageResource(R.drawable.k10);
        }
        if (dkx == 28) {
            field_gamble.setImageResource(R.drawable.k11);
        }
        if (dkx == 29) {
            field_gamble.setImageResource(R.drawable.k12);
        }
        if (dkx == 30) {
            field_gamble.setImageResource(R.drawable.k13);
        }
        if (dkx == 31) {
            field_gamble.setImageResource(R.drawable.k21);
        }
        if (dkx == 32) {
            field_gamble.setImageResource(R.drawable.k22);
        }
        if (dkx == 33) {
            field_gamble.setImageResource(R.drawable.k23);
        }
        if (dkx == 34) {
            field_gamble.setImageResource(R.drawable.k24);
        }
        if (dkx == 35) {
            field_gamble.setImageResource(R.drawable.k25);
        }
        if (dkx == 36) {
            field_gamble.setImageResource(R.drawable.k26);
        }
        if (dkx == 37) {
            field_gamble.setImageResource(R.drawable.k34);
        }
        if (dkx == 38) {
            field_gamble.setImageResource(R.drawable.k35);
        }
        if (dkx == 39) {
            field_gamble.setImageResource(R.drawable.k36);
        }
        if (dkx == 40) {
            field_gamble.setImageResource(R.drawable.k37);
        }
        if (dkx == 41) {
            field_gamble.setImageResource(R.drawable.k38);
        }
        if (dkx == 42) {
            field_gamble.setImageResource(R.drawable.k39);
        }
        if (dkx == 43) {
            field_gamble.setImageResource(R.drawable.k47);
        }
        if (dkx == 44) {
            field_gamble.setImageResource(R.drawable.k48);
        }
        if (dkx == 45) {
            field_gamble.setImageResource(R.drawable.k49);
        }
        if (dkx == 46) {
            field_gamble.setImageResource(R.drawable.k50);
        }
        if (dkx == 47) {
            field_gamble.setImageResource(R.drawable.k51);
        }
        if (dkx == 48) {
            field_gamble.setImageResource(R.drawable.k52);
        }

        if(double_card == 1) {
            field_win_1 = field_gamble;
            field_win_1.setVisibility(View.VISIBLE);
        }
        if(double_card == 2) {
            field_win_2 = field_gamble;
            field_win_2.setVisibility(View.VISIBLE);
        }
        if(double_card == 3) {
            field_win_3 = field_gamble;
            field_win_3.setVisibility(View.VISIBLE);
        }
        if(double_card == 4) {
            field_win_4 = field_gamble;
            field_win_4.setVisibility(View.VISIBLE);
        }
        if(double_card == 5) {
            field_win_5 = field_gamble;
            field_win_5.setVisibility(View.VISIBLE);
        }
        if(double_card == 6) {
            field_win_6 = field_gamble;
            field_win_6.setVisibility(View.VISIBLE);
        }
        if(double_card == 7) {
            field_win_7 = field_gamble;
            field_win_7.setVisibility(View.VISIBLE);
        }
        if(double_card == 8) {
            field_win_8 = field_gamble;
            field_win_8.setVisibility(View.VISIBLE);
        }
        if(double_card == 9) {
            field_win_9 = field_gamble;
            field_win_9.setVisibility(View.VISIBLE);
        }
        if(double_card == 10) {
            field_win_10 = field_gamble;
            field_win_10.setVisibility(View.VISIBLE);
        }
        if(double_card == 11) {
            field_win_11 = field_gamble;
            field_win_11.setVisibility(View.VISIBLE);
        }
    }
}
