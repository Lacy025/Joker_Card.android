package com.example.joker_card;

import static com.example.joker_card.MainClass.k2;
import static com.example.joker_card.MainClass.delaying;
import static com.example.joker_card.MainClass.dealing;
import static com.example.joker_card.MainClass.audio_card_2;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;

public class Card_2 extends Activity {
    public static int n2;
    public static int b2;

    public Card_2(Context context_field_card_2) {

        ImageView field_card_2 = (ImageView) ((Activity)context_field_card_2).findViewById(R.id.field_card_2);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {

            field_card_2.setVisibility(View.INVISIBLE);

            if (k2 == 0) {
                field_card_2.setImageResource(R.drawable.k00);
                n2 = 0;
                b2 = 0;
            }
            if (k2 == 1) {
                field_card_2.setImageResource(R.drawable.k01);
                n2 = 14;
                b2 = 1;
            }
            if (k2 == 2) {
                field_card_2.setImageResource(R.drawable.k02);
                n2 = 2;
                b2 = 1;
            }
            if (k2 == 3) {
                field_card_2.setImageResource(R.drawable.k03);
                n2 = 3;
                b2 = 1;
            }
            if (k2 == 4) {
                field_card_2.setImageResource(R.drawable.k04);
                n2 = 4;
                b2 = 1;
            }
            if (k2 == 5) {
                field_card_2.setImageResource(R.drawable.k05);
                n2 = 5;
                b2 = 1;
            }
            if (k2 == 6) {
                field_card_2.setImageResource(R.drawable.k06);
                n2 = 6;
                b2 = 1;
            }
            if (k2 == 7) {
                field_card_2.setImageResource(R.drawable.k07);
                n2 = 7;
                b2 = 1;
            }
            if (k2 == 8) {
                field_card_2.setImageResource(R.drawable.k08);
                n2 = 8;
                b2 = 1;
            }
            if (k2 == 9) {
                field_card_2.setImageResource(R.drawable.k09);
                n2 = 9;
                b2 = 1;
            }
            if (k2 == 10) {
                field_card_2.setImageResource(R.drawable.k10);
                n2 = 10;
                b2 = 1;
            }
            if (k2 == 11) {
                field_card_2.setImageResource(R.drawable.k11);
                n2 = 11;
                b2 = 1;
            }
            if (k2 == 12) {
                field_card_2.setImageResource(R.drawable.k12);
                n2 = 12;
                b2 = 1;
            }
            if (k2 == 13) {
                field_card_2.setImageResource(R.drawable.k13);
                n2 = 13;
                b2 = 1;
            }
            if (k2 == 14) {
                field_card_2.setImageResource(R.drawable.k14);
                n2 = 14;
                b2 = 2;
            }
            if (k2 == 15) {
                field_card_2.setImageResource(R.drawable.k15);
                n2 = 2;
                b2 = 2;
            }
            if (k2 == 16) {
                field_card_2.setImageResource(R.drawable.k16);
                n2 = 3;
                b2 = 2;
            }
            if (k2 == 17) {
                field_card_2.setImageResource(R.drawable.k17);
                n2 = 4;
                b2 = 2;
            }
            if (k2 == 18) {
                field_card_2.setImageResource(R.drawable.k18);
                n2 = 5;
                b2 = 2;
            }
            if (k2 == 19) {
                field_card_2.setImageResource(R.drawable.k19);
                n2 = 6;
                b2 = 2;
            }
            if (k2 == 20) {
                field_card_2.setImageResource(R.drawable.k20);
                n2 = 7;
                b2 = 2;
            }
            if (k2 == 21) {
                field_card_2.setImageResource(R.drawable.k21);
                n2 = 8;
                b2 = 2;
            }
            if (k2 == 22) {
                field_card_2.setImageResource(R.drawable.k22);
                n2 = 9;
                b2 = 2;
            }
            if (k2 == 23) {
                field_card_2.setImageResource(R.drawable.k23);
                n2 = 10;
                b2 = 2;
            }
            if (k2 == 24) {
                field_card_2.setImageResource(R.drawable.k24);
                n2 = 11;
                b2 = 2;
            }
            if (k2 == 25) {
                field_card_2.setImageResource(R.drawable.k25);
                n2 = 12;
                b2 = 2;
            }
            if (k2 == 26) {
                field_card_2.setImageResource(R.drawable.k26);
                n2 = 13;
                b2 = 2;
            }
            if (k2 == 27) {
                field_card_2.setImageResource(R.drawable.k27);
                n2 = 14;
                b2 = 3;
            }
            if (k2 == 28) {
                field_card_2.setImageResource(R.drawable.k28);
                n2 = 2;
                b2 = 3;
            }
            if (k2 == 29) {
                field_card_2.setImageResource(R.drawable.k29);
                n2 = 3;
                b2 = 3;
            }
            if (k2 == 30) {
                field_card_2.setImageResource(R.drawable.k30);
                n2 = 4;
                b2 = 3;
            }
            if (k2 == 31) {
                field_card_2.setImageResource(R.drawable.k31);
                n2 = 5;
                b2 = 3;
            }
            if (k2 == 32) {
                field_card_2.setImageResource(R.drawable.k32);
                n2 = 6;
                b2 = 3;
            }
            if (k2 == 33) {
                field_card_2.setImageResource(R.drawable.k33);
                n2 = 7;
                b2 = 3;
            }
            if (k2 == 34) {
                field_card_2.setImageResource(R.drawable.k34);
                n2 = 8;
                b2 = 3;
            }
            if (k2 == 35) {
                field_card_2.setImageResource(R.drawable.k35);
                n2 = 9;
                b2 = 3;
            }
            if (k2 == 36) {
                field_card_2.setImageResource(R.drawable.k36);
                n2 = 10;
                b2 = 3;
            }
            if (k2 == 37) {
                field_card_2.setImageResource(R.drawable.k37);
                n2 = 11;
                b2 = 3;
            }
            if (k2 == 38) {
                field_card_2.setImageResource(R.drawable.k38);
                n2 = 12;
                b2 = 3;
            }
            if (k2 == 39) {
                field_card_2.setImageResource(R.drawable.k39);
                n2 = 13;
                b2 = 3;
            }
            if (k2 == 40) {
                field_card_2.setImageResource(R.drawable.k40);
                n2 = 14;
                b2 = 4;
            }
            if (k2 == 41) {
                field_card_2.setImageResource(R.drawable.k41);
                n2 = 2;
                b2 = 4;
            }
            if (k2 == 42) {
                field_card_2.setImageResource(R.drawable.k42);
                n2 = 3;
                b2 = 4;
            }
            if (k2 == 43) {
                field_card_2.setImageResource(R.drawable.k43);
                n2 = 4;
                b2 = 4;
            }
            if (k2 == 44) {
                field_card_2.setImageResource(R.drawable.k44);
                n2 = 5;
                b2 = 4;
            }
            if (k2 == 45) {
                field_card_2.setImageResource(R.drawable.k45);
                n2 = 6;
                b2 = 4;
            }
            if (k2 == 46) {
                field_card_2.setImageResource(R.drawable.k46);
                n2 = 7;
                b2 = 4;
            }
            if (k2 == 47) {
                field_card_2.setImageResource(R.drawable.k47);
                n2 = 8;
                b2 = 4;
            }
            if (k2 == 48) {
                field_card_2.setImageResource(R.drawable.k48);
                n2 = 9;
                b2 = 4;
            }
            if (k2 == 49) {
                field_card_2.setImageResource(R.drawable.k49);
                n2 = 10;
                b2 = 4;
            }
            if (k2 == 50) {
                field_card_2.setImageResource(R.drawable.k50);
                n2 = 11;
                b2 = 4;
            }
            if (k2 == 51) {
                field_card_2.setImageResource(R.drawable.k51);
                n2 = 12;
                b2 = 4;
            }
            if (k2 == 52) {
                field_card_2.setImageResource(R.drawable.k52);
                n2 = 13;
                b2 = 4;
            }
            field_card_2.setVisibility(View.VISIBLE);
            if (dealing == 3) {
                audio_card_2.start();
            }
        },delaying);
    }
}
