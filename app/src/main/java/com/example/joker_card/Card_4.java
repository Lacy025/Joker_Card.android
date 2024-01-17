package com.example.joker_card;

import static com.example.joker_card.MainClass.k4;
import static com.example.joker_card.MainClass.delaying;
import static com.example.joker_card.MainClass.dealing;
import static com.example.joker_card.MainClass.audio_card_4;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;

public class Card_4 extends Activity {
    public static int n4;
    public static int b4;

    public Card_4(Context context_field_card_4) {

        ImageView field_card_4 = (ImageView) ((Activity)context_field_card_4).findViewById(R.id.field_card_4);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {

            field_card_4.setVisibility(View.INVISIBLE);

            if (k4 == 0) {
                field_card_4.setImageResource(R.drawable.k00);
                n4 = 0;
                b4 = 0;
            }
            if (k4 == 1) {
                field_card_4.setImageResource(R.drawable.k01);
                n4 = 14;
                b4 = 1;
            }
            if (k4 == 2) {
                field_card_4.setImageResource(R.drawable.k02);
                n4 = 2;
                b4 = 1;
            }
            if (k4 == 3) {
                field_card_4.setImageResource(R.drawable.k03);
                n4 = 3;
                b4 = 1;
            }
            if (k4 == 4) {
                field_card_4.setImageResource(R.drawable.k04);
                n4 = 4;
                b4 = 1;
            }
            if (k4 == 5) {
                field_card_4.setImageResource(R.drawable.k05);
                n4 = 5;
                b4 = 1;
            }
            if (k4 == 6) {
                field_card_4.setImageResource(R.drawable.k06);
                n4 = 6;
                b4 = 1;
            }
            if (k4 == 7) {
                field_card_4.setImageResource(R.drawable.k07);
                n4 = 7;
                b4 = 1;
            }
            if (k4 == 8) {
                field_card_4.setImageResource(R.drawable.k08);
                n4 = 8;
                b4 = 1;
            }
            if (k4 == 9) {
                field_card_4.setImageResource(R.drawable.k09);
                n4 = 9;
                b4 = 1;
            }
            if (k4 == 10) {
                field_card_4.setImageResource(R.drawable.k10);
                n4 = 10;
                b4 = 1;
            }
            if (k4 == 11) {
                field_card_4.setImageResource(R.drawable.k11);
                n4 = 11;
                b4 = 1;
            }
            if (k4 == 12) {
                field_card_4.setImageResource(R.drawable.k12);
                n4 = 12;
                b4 = 1;
            }
            if (k4 == 13) {
                field_card_4.setImageResource(R.drawable.k13);
                n4 = 13;
                b4 = 1;
            }
            if (k4 == 14) {
                field_card_4.setImageResource(R.drawable.k14);
                n4 = 14;
                b4 = 2;
            }
            if (k4 == 15) {
                field_card_4.setImageResource(R.drawable.k15);
                n4 = 2;
                b4 = 2;
            }
            if (k4 == 16) {
                field_card_4.setImageResource(R.drawable.k16);
                n4 = 3;
                b4 = 2;
            }
            if (k4 == 17) {
                field_card_4.setImageResource(R.drawable.k17);
                n4 = 4;
                b4 = 2;
            }
            if (k4 == 18) {
                field_card_4.setImageResource(R.drawable.k18);
                n4 = 5;
                b4 = 2;
            }
            if (k4 == 19) {
                field_card_4.setImageResource(R.drawable.k19);
                n4 = 6;
                b4 = 2;
            }
            if (k4 == 20) {
                field_card_4.setImageResource(R.drawable.k20);
                n4 = 7;
                b4 = 2;
            }
            if (k4 == 21) {
                field_card_4.setImageResource(R.drawable.k21);
                n4 = 8;
                b4 = 2;
            }
            if (k4 == 22) {
                field_card_4.setImageResource(R.drawable.k22);
                n4 = 9;
                b4 = 2;
            }
            if (k4 == 23) {
                field_card_4.setImageResource(R.drawable.k23);
                n4 = 10;
                b4 = 2;
            }
            if (k4 == 24) {
                field_card_4.setImageResource(R.drawable.k24);
                n4 = 11;
                b4 = 2;
            }
            if (k4 == 25) {
                field_card_4.setImageResource(R.drawable.k25);
                n4 = 12;
                b4 = 2;
            }
            if (k4 == 26) {
                field_card_4.setImageResource(R.drawable.k26);
                n4 = 13;
                b4 = 2;
            }
            if (k4 == 27) {
                field_card_4.setImageResource(R.drawable.k27);
                n4 = 14;
                b4 = 3;
            }
            if (k4 == 28) {
                field_card_4.setImageResource(R.drawable.k28);
                n4 = 2;
                b4 = 3;
            }
            if (k4 == 29) {
                field_card_4.setImageResource(R.drawable.k29);
                n4 = 3;
                b4 = 3;
            }
            if (k4 == 30) {
                field_card_4.setImageResource(R.drawable.k30);
                n4 = 4;
                b4 = 3;
            }
            if (k4 == 31) {
                field_card_4.setImageResource(R.drawable.k31);
                n4 = 5;
                b4 = 3;
            }
            if (k4 == 32) {
                field_card_4.setImageResource(R.drawable.k32);
                n4 = 6;
                b4 = 3;
            }
            if (k4 == 33) {
                field_card_4.setImageResource(R.drawable.k33);
                n4 = 7;
                b4 = 3;
            }
            if (k4 == 34) {
                field_card_4.setImageResource(R.drawable.k34);
                n4 = 8;
                b4 = 3;
            }
            if (k4 == 35) {
                field_card_4.setImageResource(R.drawable.k35);
                n4 = 9;
                b4 = 3;
            }
            if (k4 == 36) {
                field_card_4.setImageResource(R.drawable.k36);
                n4 = 10;
                b4 = 3;
            }
            if (k4 == 37) {
                field_card_4.setImageResource(R.drawable.k37);
                n4 = 11;
                b4 = 3;
            }
            if (k4 == 38) {
                field_card_4.setImageResource(R.drawable.k38);
                n4 = 12;
                b4 = 3;
            }
            if (k4 == 39) {
                field_card_4.setImageResource(R.drawable.k39);
                n4 = 13;
                b4 = 3;
            }
            if (k4 == 40) {
                field_card_4.setImageResource(R.drawable.k40);
                n4 = 14;
                b4 = 4;
            }
            if (k4 == 41) {
                field_card_4.setImageResource(R.drawable.k41);
                n4 = 2;
                b4 = 4;
            }
            if (k4 == 42) {
                field_card_4.setImageResource(R.drawable.k42);
                n4 = 3;
                b4 = 4;
            }
            if (k4 == 43) {
                field_card_4.setImageResource(R.drawable.k43);
                n4 = 4;
                b4 = 4;
            }
            if (k4 == 44) {
                field_card_4.setImageResource(R.drawable.k44);
                n4 = 5;
                b4 = 4;
            }
            if (k4 == 45) {
                field_card_4.setImageResource(R.drawable.k45);
                n4 = 6;
                b4 = 4;
            }
            if (k4 == 46) {
                field_card_4.setImageResource(R.drawable.k46);
                n4 = 7;
                b4 = 4;
            }
            if (k4 == 47) {
                field_card_4.setImageResource(R.drawable.k47);
                n4 = 8;
                b4 = 4;
            }
            if (k4 == 48) {
                field_card_4.setImageResource(R.drawable.k48);
                n4 = 9;
                b4 = 4;
            }
            if (k4 == 49) {
                field_card_4.setImageResource(R.drawable.k49);
                n4 = 10;
                b4 = 4;
            }
            if (k4 == 50) {
                field_card_4.setImageResource(R.drawable.k50);
                n4 = 11;
                b4 = 4;
            }
            if (k4 == 51) {
                field_card_4.setImageResource(R.drawable.k51);
                n4 = 12;
                b4 = 4;
            }
            if (k4 == 52) {
                field_card_4.setImageResource(R.drawable.k52);
                n4 = 13;
                b4 = 4;
            }
            field_card_4.setVisibility(View.VISIBLE);
            if (dealing == 3) {
                audio_card_4.start();
            }
        },delaying);
    }
}
