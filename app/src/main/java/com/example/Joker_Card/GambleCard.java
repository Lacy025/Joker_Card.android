package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.double_card;
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

import android.view.View;
import android.widget.ImageView;

public class GambleCard {
    int dkx;
    ImageView poljeD;
    GambleCard() {
        if(double_card == 1) {
            dkx = dk1;
            poljeD = poljeD1;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 2) {
            dkx = dk2;
            poljeD = poljeD2;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 3) {
            dkx = dk3;
            poljeD = poljeD3;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 4) {
            dkx = dk4;
            poljeD = poljeD4;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 5) {
            dkx = dk5;
            poljeD = poljeD5;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 6) {
            dkx = dk6;
            poljeD = poljeD6;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 7) {
            dkx = dk7;
            poljeD = poljeD7;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 8) {
            dkx = dk8;
            poljeD = poljeD8;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 9) {
            dkx = dk9;
            poljeD = poljeD9;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 10) {
            dkx = dk10;
            poljeD = poljeD10;
            poljeD.setVisibility(View.INVISIBLE);
        }
        if(double_card == 11) {
            dkx = dk11;
            poljeD = poljeD11;
            poljeD.setVisibility(View.INVISIBLE);
        }

        if (dkx == 1) {
            poljeD.setImageResource(R.drawable.k01);
        }
        if (dkx == 2) {
            poljeD.setImageResource(R.drawable.k02);
        }
        if (dkx == 3) {
            poljeD.setImageResource(R.drawable.k03);
        }
        if (dkx == 4) {
            poljeD.setImageResource(R.drawable.k04);
        }
        if (dkx == 5) {
            poljeD.setImageResource(R.drawable.k05);
        }
        if (dkx == 6) {
            poljeD.setImageResource(R.drawable.k06);
        }
        if (dkx == 7) {
            poljeD.setImageResource(R.drawable.k14);
        }
        if (dkx == 8) {
            poljeD.setImageResource(R.drawable.k15);
        }
        if (dkx == 9) {
            poljeD.setImageResource(R.drawable.k16);
        }
        if (dkx == 10) {
            poljeD.setImageResource(R.drawable.k17);
        }
        if (dkx == 11) {
            poljeD.setImageResource(R.drawable.k18);
        }
        if (dkx == 12) {
            poljeD.setImageResource(R.drawable.k19);
        }
        if (dkx == 13) {
            poljeD.setImageResource(R.drawable.k27);
        }
        if (dkx == 14) {
            poljeD.setImageResource(R.drawable.k28);
        }
        if (dkx == 15) {
            poljeD.setImageResource(R.drawable.k29);
        }
        if (dkx == 16) {
            poljeD.setImageResource(R.drawable.k30);
        }
        if (dkx == 17) {
            poljeD.setImageResource(R.drawable.k31);
        }
        if (dkx == 18) {
            poljeD.setImageResource(R.drawable.k32);
        }
        if (dkx == 19) {
            poljeD.setImageResource(R.drawable.k40);
        }
        if (dkx == 20) {
            poljeD.setImageResource(R.drawable.k41);
        }
        if (dkx == 21) {
            poljeD.setImageResource(R.drawable.k42);
        }
        if (dkx == 22) {
            poljeD.setImageResource(R.drawable.k43);
        }
        if (dkx == 23) {
            poljeD.setImageResource(R.drawable.k44);
        }
        if (dkx == 24) {
            poljeD.setImageResource(R.drawable.k45);
        }
        if (dkx == 25) {
            poljeD.setImageResource(R.drawable.k08);
        }
        if (dkx == 26) {
            poljeD.setImageResource(R.drawable.k09);
        }
        if (dkx == 27) {
            poljeD.setImageResource(R.drawable.k10);
        }
        if (dkx == 28) {
            poljeD.setImageResource(R.drawable.k11);
        }
        if (dkx == 29) {
            poljeD.setImageResource(R.drawable.k12);
        }
        if (dkx == 30) {
            poljeD.setImageResource(R.drawable.k13);
        }
        if (dkx == 31) {
            poljeD.setImageResource(R.drawable.k21);
        }
        if (dkx == 32) {
            poljeD.setImageResource(R.drawable.k22);
        }
        if (dkx == 33) {
            poljeD.setImageResource(R.drawable.k23);
        }
        if (dkx == 34) {
            poljeD.setImageResource(R.drawable.k24);
        }
        if (dkx == 35) {
            poljeD.setImageResource(R.drawable.k25);
        }
        if (dkx == 36) {
            poljeD.setImageResource(R.drawable.k26);
        }
        if (dkx == 37) {
            poljeD.setImageResource(R.drawable.k34);
        }
        if (dkx == 38) {
            poljeD.setImageResource(R.drawable.k35);
        }
        if (dkx == 39) {
            poljeD.setImageResource(R.drawable.k36);
        }
        if (dkx == 40) {
            poljeD.setImageResource(R.drawable.k37);
        }
        if (dkx == 41) {
            poljeD.setImageResource(R.drawable.k38);
        }
        if (dkx == 42) {
            poljeD.setImageResource(R.drawable.k39);
        }
        if (dkx == 43) {
            poljeD.setImageResource(R.drawable.k47);
        }
        if (dkx == 44) {
            poljeD.setImageResource(R.drawable.k48);
        }
        if (dkx == 45) {
            poljeD.setImageResource(R.drawable.k49);
        }
        if (dkx == 46) {
            poljeD.setImageResource(R.drawable.k50);
        }
        if (dkx == 47) {
            poljeD.setImageResource(R.drawable.k51);
        }
        if (dkx == 48) {
            poljeD.setImageResource(R.drawable.k52);
        }

        if(double_card == 1) {
            poljeD1 = poljeD;
            poljeD1.setVisibility(View.VISIBLE);
        }
        if(double_card == 2) {
            poljeD2 = poljeD;
            poljeD2.setVisibility(View.VISIBLE);
        }
        if(double_card == 3) {
            poljeD3 = poljeD;
            poljeD3.setVisibility(View.VISIBLE);
        }
        if(double_card == 4) {
            poljeD4 = poljeD;
            poljeD4.setVisibility(View.VISIBLE);
        }
        if(double_card == 5) {
            poljeD5 = poljeD;
            poljeD5.setVisibility(View.VISIBLE);
        }
        if(double_card == 6) {
            poljeD6 = poljeD;
            poljeD6.setVisibility(View.VISIBLE);
        }
        if(double_card == 7) {
            poljeD7 = poljeD;
            poljeD7.setVisibility(View.VISIBLE);
        }
        if(double_card == 8) {
            poljeD8 = poljeD;
            poljeD8.setVisibility(View.VISIBLE);
        }
        if(double_card == 9) {
            poljeD9 = poljeD;
            poljeD9.setVisibility(View.VISIBLE);
        }
        if(double_card == 10) {
            poljeD10 = poljeD;
            poljeD10.setVisibility(View.VISIBLE);
        }
        if(double_card == 11) {
            poljeD11 = poljeD;
            poljeD11.setVisibility(View.VISIBLE);
        }
    }
}
