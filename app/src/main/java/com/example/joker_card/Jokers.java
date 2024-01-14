package com.example.joker_card;

import static com.example.joker_card.MainClass.dealing;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Jokers extends Activity {
    public static Handler handler1;
    public static Handler handler2;
    public static Handler handler3;
    public static Handler handler4;
    public static Handler handler5;
    public static Handler handler6;
    public static Handler handler7;
    public static Handler handler8;
    public static Runnable runnable1;
    public static Runnable runnable2;
    public static Runnable runnable3;
    public static Runnable runnable4;
    public static Runnable runnable5;
    public static Runnable runnable6;
    public static Runnable runnable7;
    public static Runnable runnable8;
    final Context context_joker;
    final Context context_card;
    final Context context_field_card_1;
    final Context context_field_card_2;
    final Context context_field_card_3;
    final Context context_field_card_4;
    final Context context_field_card_5;
    final Context context_field_joker_1;
    final Context context_field_joker_2;
    final Context context_field_joker_3;
    final Context context_field_joker_4;
    final Context context_field_joker_5;
    Jokers(Context context_joker, Context context_card, Context context_field_card_1,
           Context context_field_card_2, Context context_field_card_3, Context context_field_card_4,
           Context context_field_card_5, Context context_field_joker_1, Context context_field_joker_2,
           Context context_field_joker_3, Context context_field_joker_4, Context context_field_joker_5) {

        this.context_joker = context_joker;
        this.context_card = context_card;
        this.context_field_card_1 = context_field_card_1;
        this.context_field_card_2 = context_field_card_2;
        this.context_field_card_3 = context_field_card_3;
        this.context_field_card_4 = context_field_card_4;
        this.context_field_card_5 = context_field_card_5;
        this.context_field_joker_1 = context_field_joker_1;
        this.context_field_joker_2 = context_field_joker_2;
        this.context_field_joker_3 = context_field_joker_3;
        this.context_field_joker_4 = context_field_joker_4;
        this.context_field_joker_5 = context_field_joker_5;

        ImageView field_card_1 = (ImageView) ((Activity)context_field_card_1).findViewById(R.id.field_card_1);
        ImageView field_card_2 = (ImageView) ((Activity)context_field_card_2).findViewById(R.id.field_card_2);
        ImageView field_card_3 = (ImageView) ((Activity)context_field_card_3).findViewById(R.id.field_card_3);
        ImageView field_card_4 = (ImageView) ((Activity)context_field_card_4).findViewById(R.id.field_card_4);
        ImageView field_card_5 = (ImageView) ((Activity)context_field_card_5).findViewById(R.id.field_card_5);
        ImageView field_joker_1 = (ImageView) ((Activity)context_field_joker_1).findViewById(R.id.field_joker_1);
        ImageView field_joker_2 = (ImageView) ((Activity)context_field_joker_2).findViewById(R.id.field_joker_2);
        ImageView field_joker_3 = (ImageView) ((Activity)context_field_joker_3).findViewById(R.id.field_joker_3);
        ImageView field_joker_4 = (ImageView) ((Activity)context_field_joker_4).findViewById(R.id.field_joker_4);
        ImageView field_joker_5 = (ImageView) ((Activity)context_field_joker_5).findViewById(R.id.field_joker_5);

        TextView joker = (TextView) ((Activity)context_joker).findViewById(R.id.joker);
        TextView card = (TextView) ((Activity)context_card).findViewById(R.id.card);

        if(dealing == 0) {
            joker.setText(R.string.joker);
            card.setText(R.string.card);
            joker.setVisibility(View.VISIBLE);
            card.setVisibility(View.VISIBLE);
        }

        handler1 = new Handler();
        runnable1 = new Runnable() {
            boolean isVisible1 = true;
            @Override
            public void run() {
                isVisible1 = !isVisible1;
                if(dealing == 0) {
                    joker.setVisibility(isVisible1 ? View.INVISIBLE : View.VISIBLE);
                    card.setVisibility(isVisible1 ? View.INVISIBLE : View.VISIBLE);
                    handler1.postDelayed(this, 6000);
                }
            }
        };
        handler1.post(runnable1);

        handler2 = new Handler();
        runnable2 = new Runnable() {
            boolean isVisible2 = true;
            @Override
            public void run() {
                isVisible2 = !isVisible2;
                if(dealing == 0) {
                    field_card_1.setVisibility(isVisible2 ? View.VISIBLE : View.INVISIBLE);
                    field_card_2.setVisibility(isVisible2 ? View.VISIBLE : View.INVISIBLE);
                    field_card_3.setVisibility(isVisible2 ? View.VISIBLE : View.INVISIBLE);
                    field_card_4.setVisibility(isVisible2 ? View.VISIBLE : View.INVISIBLE);
                    field_card_5.setVisibility(isVisible2 ? View.VISIBLE : View.INVISIBLE);
                    handler2.postDelayed(this, 6000);
                }
            }
        };
        handler2.post(runnable2);

        handler3 = new Handler();
        runnable3 = new Runnable() {
            boolean isVisible3 = true;
            @Override
            public void run() {
                isVisible3 = !isVisible3;
                if(dealing == 0) {
                    field_card_1.setVisibility(isVisible3 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_1.setVisibility(isVisible3 ? View.VISIBLE : View.INVISIBLE);
                    field_card_2.setVisibility(isVisible3 ? View.VISIBLE : View.INVISIBLE);
                    field_card_3.setVisibility(isVisible3 ? View.VISIBLE : View.INVISIBLE);
                    field_card_4.setVisibility(isVisible3 ? View.VISIBLE : View.INVISIBLE);
                    field_card_5.setVisibility(isVisible3 ? View.VISIBLE : View.INVISIBLE);
                    handler3.postDelayed(this, 7000);
                }
            }
        };
        handler3.post(runnable3);

        handler4 = new Handler();
        runnable4 = new Runnable() {
            boolean isVisible4 = true;
            @Override
            public void run() {
                isVisible4 = !isVisible4;
                if(dealing == 0) {
                    field_card_1.setVisibility(isVisible4 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_1.setVisibility(View.INVISIBLE);
                    field_card_2.setVisibility(isVisible4 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_2.setVisibility(isVisible4 ? View.VISIBLE : View.INVISIBLE);
                    field_card_3.setVisibility(isVisible4 ? View.VISIBLE : View.INVISIBLE);
                    field_card_4.setVisibility(isVisible4 ? View.VISIBLE : View.INVISIBLE);
                    field_card_5.setVisibility(isVisible4 ? View.VISIBLE : View.INVISIBLE);
                    handler4.postDelayed(this, 8000);
                }
            }
        };
        handler4.post(runnable4);

        handler5 = new Handler();
        runnable5 = new Runnable() {
            boolean isVisible5 = true;
            @Override
            public void run() {
                isVisible5 = !isVisible5;
                if(dealing == 0) {
                    field_card_1.setVisibility(isVisible5 ? View.VISIBLE : View.INVISIBLE);
                    field_card_2.setVisibility(isVisible5 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_2.setVisibility(View.INVISIBLE);
                    field_card_3.setVisibility(isVisible5 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_3.setVisibility(isVisible5 ? View.VISIBLE : View.INVISIBLE);
                    field_card_4.setVisibility(isVisible5 ? View.VISIBLE : View.INVISIBLE);
                    field_card_5.setVisibility(isVisible5 ? View.VISIBLE : View.INVISIBLE);
                    handler5.postDelayed(this, 9000);
                }
            }
        };
        handler5.post(runnable5);

        handler6 = new Handler();
        runnable6 = new Runnable() {
            boolean isVisible6 = true;
            @Override
            public void run() {
                isVisible6 = !isVisible6;
                if(dealing == 0) {
                    field_card_1.setVisibility(isVisible6 ? View.VISIBLE : View.INVISIBLE);
                    field_card_2.setVisibility(isVisible6 ? View.VISIBLE : View.INVISIBLE);
                    field_card_3.setVisibility(isVisible6 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_3.setVisibility(View.INVISIBLE);
                    field_card_4.setVisibility(isVisible6 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_4.setVisibility(isVisible6 ? View.VISIBLE : View.INVISIBLE);
                    field_card_5.setVisibility(isVisible6 ? View.VISIBLE : View.INVISIBLE);
                    handler6.postDelayed(this, 10000);
                }
            }
        };
        handler6.post(runnable6);

        handler7 = new Handler();
        runnable7 = new Runnable() {
            boolean isVisible7 = true;
            @Override
            public void run() {
                isVisible7 = !isVisible7;
                if(dealing == 0) {
                    field_card_1.setVisibility(isVisible7 ? View.VISIBLE : View.INVISIBLE);
                    field_card_2.setVisibility(isVisible7 ? View.VISIBLE : View.INVISIBLE);
                    field_card_3.setVisibility(isVisible7 ? View.VISIBLE : View.INVISIBLE);
                    field_card_4.setVisibility(isVisible7 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_4.setVisibility(View.INVISIBLE);
                    field_card_5.setVisibility(isVisible7 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_5.setVisibility(isVisible7 ? View.VISIBLE : View.INVISIBLE);
                    handler7.postDelayed(this, 11000);
                }
            }
        };
        handler7.post(runnable7);

        handler8 = new Handler();
        runnable8 = new Runnable() {
            boolean isVisible8 = true;
            @Override
            public void run() {
                isVisible8 = !isVisible8;
                if(dealing == 0) {
                    field_card_1.setVisibility(isVisible8 ? View.VISIBLE : View.INVISIBLE);
                    field_card_2.setVisibility(isVisible8 ? View.VISIBLE : View.INVISIBLE);
                    field_card_3.setVisibility(isVisible8 ? View.VISIBLE : View.INVISIBLE);
                    field_card_4.setVisibility(isVisible8 ? View.VISIBLE : View.INVISIBLE);
                    field_card_5.setVisibility(isVisible8 ? View.VISIBLE : View.INVISIBLE);
                    field_joker_5.setVisibility(View.INVISIBLE);
                    handler8.postDelayed(this, 12000);
                }
            }
        };
        handler8.post(runnable8);
    }
}





