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

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

public class GambleCard extends Activity {
    int gamble_card;
    ImageView field_gamble;

    GambleCard(Context context_field_win_1, Context context_field_win_2, Context context_field_win_3,
               Context context_field_win_4, Context context_field_win_5, Context context_field_win_6,
               Context context_field_win_7, Context context_field_win_8, Context context_field_win_9,
               Context context_field_win_10, Context context_field_win_11) {

        ImageView field_win_1 = ((Activity)context_field_win_1).findViewById(R.id.field_win_1);
        ImageView field_win_2 = ((Activity)context_field_win_2).findViewById(R.id.field_win_2);
        ImageView field_win_3 = ((Activity)context_field_win_3).findViewById(R.id.field_win_3);
        ImageView field_win_4 = ((Activity)context_field_win_4).findViewById(R.id.field_win_4);
        ImageView field_win_5 = ((Activity)context_field_win_5).findViewById(R.id.field_win_5);
        ImageView field_win_6 = ((Activity)context_field_win_6).findViewById(R.id.field_win_6);
        ImageView field_win_7 = ((Activity)context_field_win_7).findViewById(R.id.field_win_7);
        ImageView field_win_8 = ((Activity)context_field_win_8).findViewById(R.id.field_win_8);
        ImageView field_win_9 = ((Activity)context_field_win_9).findViewById(R.id.field_win_9);
        ImageView field_win_10 = ((Activity)context_field_win_10).findViewById(R.id.field_win_10);
        ImageView field_win_11 = ((Activity)context_field_win_11).findViewById(R.id.field_win_11);

        if(double_card == 1) {
            gamble_card = dk1;
            field_gamble = field_win_1;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 2) {
            gamble_card = dk2;
            field_gamble = field_win_2;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 3) {
            gamble_card = dk3;
            field_gamble = field_win_3;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 4) {
            gamble_card = dk4;
            field_gamble = field_win_4;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 5) {
            gamble_card = dk5;
            field_gamble = field_win_5;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 6) {
            gamble_card = dk6;
            field_gamble = field_win_6;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 7) {
            gamble_card = dk7;
            field_gamble = field_win_7;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 8) {
            gamble_card = dk8;
            field_gamble = field_win_8;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 9) {
            gamble_card = dk9;
            field_gamble = field_win_9;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 10) {
            gamble_card = dk10;
            field_gamble = field_win_10;
            field_gamble.setVisibility(View.INVISIBLE);
        }
        if(double_card == 11) {
            gamble_card = dk11;
            field_gamble = field_win_11;
            field_gamble.setVisibility(View.INVISIBLE);
        }

        if (gamble_card == 1) {
            field_gamble.setImageResource(R.drawable.k01);
        }
        if (gamble_card == 2) {
            field_gamble.setImageResource(R.drawable.k02);
        }
        if (gamble_card == 3) {
            field_gamble.setImageResource(R.drawable.k03);
        }
        if (gamble_card == 4) {
            field_gamble.setImageResource(R.drawable.k04);
        }
        if (gamble_card == 5) {
            field_gamble.setImageResource(R.drawable.k05);
        }
        if (gamble_card == 6) {
            field_gamble.setImageResource(R.drawable.k06);
        }
        if (gamble_card == 7) {
            field_gamble.setImageResource(R.drawable.k14);
        }
        if (gamble_card == 8) {
            field_gamble.setImageResource(R.drawable.k15);
        }
        if (gamble_card == 9) {
            field_gamble.setImageResource(R.drawable.k16);
        }
        if (gamble_card == 10) {
            field_gamble.setImageResource(R.drawable.k17);
        }
        if (gamble_card == 11) {
            field_gamble.setImageResource(R.drawable.k18);
        }
        if (gamble_card == 12) {
            field_gamble.setImageResource(R.drawable.k19);
        }
        if (gamble_card == 13) {
            field_gamble.setImageResource(R.drawable.k27);
        }
        if (gamble_card == 14) {
            field_gamble.setImageResource(R.drawable.k28);
        }
        if (gamble_card == 15) {
            field_gamble.setImageResource(R.drawable.k29);
        }
        if (gamble_card == 16) {
            field_gamble.setImageResource(R.drawable.k30);
        }
        if (gamble_card == 17) {
            field_gamble.setImageResource(R.drawable.k31);
        }
        if (gamble_card == 18) {
            field_gamble.setImageResource(R.drawable.k32);
        }
        if (gamble_card == 19) {
            field_gamble.setImageResource(R.drawable.k40);
        }
        if (gamble_card == 20) {
            field_gamble.setImageResource(R.drawable.k41);
        }
        if (gamble_card == 21) {
            field_gamble.setImageResource(R.drawable.k42);
        }
        if (gamble_card == 22) {
            field_gamble.setImageResource(R.drawable.k43);
        }
        if (gamble_card == 23) {
            field_gamble.setImageResource(R.drawable.k44);
        }
        if (gamble_card == 24) {
            field_gamble.setImageResource(R.drawable.k45);
        }
        if (gamble_card == 25) {
            field_gamble.setImageResource(R.drawable.k08);
        }
        if (gamble_card == 26) {
            field_gamble.setImageResource(R.drawable.k09);
        }
        if (gamble_card == 27) {
            field_gamble.setImageResource(R.drawable.k10);
        }
        if (gamble_card == 28) {
            field_gamble.setImageResource(R.drawable.k11);
        }
        if (gamble_card == 29) {
            field_gamble.setImageResource(R.drawable.k12);
        }
        if (gamble_card == 30) {
            field_gamble.setImageResource(R.drawable.k13);
        }
        if (gamble_card == 31) {
            field_gamble.setImageResource(R.drawable.k21);
        }
        if (gamble_card == 32) {
            field_gamble.setImageResource(R.drawable.k22);
        }
        if (gamble_card == 33) {
            field_gamble.setImageResource(R.drawable.k23);
        }
        if (gamble_card == 34) {
            field_gamble.setImageResource(R.drawable.k24);
        }
        if (gamble_card == 35) {
            field_gamble.setImageResource(R.drawable.k25);
        }
        if (gamble_card == 36) {
            field_gamble.setImageResource(R.drawable.k26);
        }
        if (gamble_card == 37) {
            field_gamble.setImageResource(R.drawable.k34);
        }
        if (gamble_card == 38) {
            field_gamble.setImageResource(R.drawable.k35);
        }
        if (gamble_card == 39) {
            field_gamble.setImageResource(R.drawable.k36);
        }
        if (gamble_card == 40) {
            field_gamble.setImageResource(R.drawable.k37);
        }
        if (gamble_card == 41) {
            field_gamble.setImageResource(R.drawable.k38);
        }
        if (gamble_card == 42) {
            field_gamble.setImageResource(R.drawable.k39);
        }
        if (gamble_card == 43) {
            field_gamble.setImageResource(R.drawable.k47);
        }
        if (gamble_card == 44) {
            field_gamble.setImageResource(R.drawable.k48);
        }
        if (gamble_card == 45) {
            field_gamble.setImageResource(R.drawable.k49);
        }
        if (gamble_card == 46) {
            field_gamble.setImageResource(R.drawable.k50);
        }
        if (gamble_card == 47) {
            field_gamble.setImageResource(R.drawable.k51);
        }
        if (gamble_card == 48) {
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
