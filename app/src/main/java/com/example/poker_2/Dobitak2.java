package com.example.poker_2;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

public class Dobitak2 extends Activity {

    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
    int b1;
    int b2;
    int b3;
    int b4;
    int b5;

    int dobitak;

    int Fiveofakind;
    int Royalflush;
    int Streetflush;
    int Poker;
    int Fullhouse;
    int Flush;
    int Street;
    int Threeofakind;
    int Twopairs;
    int Highpair;

    int ROYAL;
    int STRFL1;
    int STRFL2;
    int STRFL3;
    int STRFL4;
    int STRFL5;
    int STRFL6;
    int STRFL7;
    int STRFL8;
    int STRFL9;

    Dobitak2() {

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                n1 = Karta1.n1;
                n2 = Karta2.n2;
                n3 = Karta3.n3;
                n4 = Karta4.n4;
                n5 = Karta5.n5;
                b1 = Karta1.b1;
                b2 = Karta2.b2;
                b3 = Karta3.b3;
                b4 = Karta4.b4;
                b5 = Karta5.b5;

                dobitak = 0;

                Fiveofakind = 0;
                Royalflush = 0;
                Streetflush = 0;
                Poker = 0;
                Fullhouse = 0;
                Flush = 0;
                Street = 0;
                Threeofakind = 0;
                Twopairs = 0;
                Highpair = 0;

                // FIVE OF A KIND

                if (dobitak == 0) {
                    if (((n1 == n2) && (n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                            ((n1 == n2) && (n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                            ((n1 == n2) && (n3 == 0) && (n2 == n4) && (n4 == n5)) ||
                            ((n1 == n3) && (n2 == 0) && (n3 == n4) && (n4 == n5)) ||
                            ((n1 == 0) && (n2 == n3) && (n3 == n4) && (n4 == n5))) {

                        dobitak++;
                        Fiveofakind = 1;
                    }
                }

                // ROYAL FLUSH OR STREET

                ROYAL = 0;
                STRFL1 = 0;
                STRFL2 = 0;
                STRFL3 = 0;
                STRFL4 = 0;
                STRFL5 = 0;
                STRFL6 = 0;
                STRFL7 = 0;
                STRFL8 = 0;
                STRFL9 = 0;

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        ROYAL++;
                    }
                    if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                        ROYAL++;
                    }
                    if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                        ROYAL++;
                    }
                    if (n1 == 12 || n2 == 12 || n3 == 12 || n4 == 12 || n5 == 12) {
                        ROYAL++;
                    }
                    if (n1 == 13 || n2 == 13 || n3 == 13 || n4 == 13 || n5 == 13) {
                        ROYAL++;
                    }
                    if (n1 == 14 || n2 == 14 || n3 == 14 || n4 == 14 || n5 == 14) {
                        ROYAL++;
                    }

                    if (ROYAL == 5) {
                        ProveraBoje1();
                    }
                }

                // STREET FLUSH OR STREET
                // 9-13

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        STRFL9++;
                    }
                    if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                        STRFL9++;
                    }
                    if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                        STRFL9++;
                    }
                    if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                        STRFL9++;
                    }
                    if (n1 == 12 || n2 == 12 || n3 == 12 || n4 == 12 || n5 == 12) {
                        STRFL9++;
                    }
                    if (n1 == 13 || n2 == 13 || n3 == 13 || n4 == 13 || n5 == 13) {
                        STRFL9++;
                    }

                    if (STRFL9 == 5) {
                        ProveraBoje2();
                    }
                }

                // STREET FLUSH OR STREET
                // 8-12

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        STRFL8++;
                    }
                    if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                        STRFL8++;
                    }
                    if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                        STRFL8++;
                    }
                    if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                        STRFL8++;
                    }
                    if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                        STRFL8++;
                    }
                    if (n1 == 12 || n2 == 12 || n3 == 12 || n4 == 12 || n5 == 12) {
                        STRFL8++;
                    }

                    if (STRFL8 == 5) {
                        ProveraBoje2();
                    }
                }

                // STREET FLUSH OR STREET
                // 7-11

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        STRFL7++;
                    }
                    if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                        STRFL7++;
                    }
                    if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                        STRFL7++;
                    }
                    if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                        STRFL7++;
                    }
                    if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                        STRFL7++;
                    }
                    if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                        STRFL7++;
                    }

                    if (STRFL7 == 5) {
                        ProveraBoje2();
                    }
                }

                // STREET FLUSH OR STREET
                // 6-10

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        STRFL6++;
                    }
                    if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                        STRFL6++;
                    }
                    if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                        STRFL6++;
                    }
                    if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                        STRFL6++;
                    }
                    if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                        STRFL6++;
                    }
                    if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                        STRFL6++;
                    }

                    if (STRFL6 == 5) {
                        ProveraBoje2();
                    }
                }

                // STREET FLUSH OR STREET
                // 5-9

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        STRFL5++;
                    }
                    if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                        STRFL5++;
                    }
                    if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                        STRFL5++;
                    }
                    if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                        STRFL5++;
                    }
                    if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                        STRFL5++;
                    }
                    if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                        STRFL5++;
                    }

                    if (STRFL5 == 5) {
                        ProveraBoje2();
                    }
                }

                // STREET FLUSH OR STREET
                // 4-8

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        STRFL4++;
                    }
                    if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                        STRFL4++;
                    }
                    if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                        STRFL4++;
                    }
                    if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                        STRFL4++;
                    }
                    if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                        STRFL4++;
                    }
                    if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                        STRFL4++;
                    }

                    if (STRFL4 == 5) {
                        ProveraBoje2();
                    }
                }

                // STREET FLUSH OR STREET
                // 3-7

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        STRFL3++;
                    }
                    if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
                        STRFL3++;
                    }
                    if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                        STRFL3++;
                    }
                    if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                        STRFL3++;
                    }
                    if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                        STRFL3++;
                    }
                    if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                        STRFL3++;
                    }

                    if (STRFL3 == 5) {
                        ProveraBoje2();
                    }
                }

                // STREET FLUSH OR STREET
                // 2-6

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        STRFL2++;
                    }
                    if (n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2) {
                        STRFL2++;
                    }
                    if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
                        STRFL2++;
                    }
                    if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                        STRFL2++;
                    }
                    if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                        STRFL2++;
                    }
                    if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                        STRFL2++;
                    }

                    if (STRFL2 == 5) {
                        ProveraBoje2();
                    }
                }

                // STREET FLUSH OR STREET
                // 1-5

                if (dobitak == 0) {

                    if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                        STRFL1++;
                    }
                    if (n1 == 14 || n2 == 14 || n3 == 14 || n4 == 14 || n5 == 14) {
                        STRFL1++;
                    }
                    if (n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2) {
                        STRFL1++;
                    }
                    if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
                        STRFL1++;
                    }
                    if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                        STRFL1++;
                    }
                    if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                        STRFL1++;
                    }

                    if (STRFL1 == 5) {
                        ProveraBoje2();
                    }
                }

                // POKER

                if (dobitak == 0) {

                    if (((n1 == n2) && (n2 == n3) && (n3 == n4)) ||
                            ((n1 == n2) && (n2 == n3) && (n4 == 0)) ||
                            ((n1 == n2) && (n3 == 0) && (n2 == n4)) ||
                            ((n1 == n3) && (n2 == 0) && (n3 == n4)) ||
                            ((n1 == 0) && (n2 == n3) && (n3 == n4))) {

                        dobitak++;
                        Poker = 1;
                    }

                    if (((n1 == n2) && (n2 == n3) && (n3 == n5)) ||
                            ((n1 == n2) && (n2 == n3) && (n5 == 0)) ||
                            ((n1 == n2) && (n3 == 0) && (n2 == n5)) ||
                            ((n1 == n3) && (n2 == 0) && (n3 == n5)) ||
                            ((n1 == 0) && (n2 == n3) && (n3 == n5))) {

                        dobitak++;
                        Poker = 1;
                    }

                    if (((n1 == n2) && (n2 == n4) && (n4 == n5)) ||
                            ((n1 == n2) && (n2 == n4) && (n5 == 0)) ||
                            ((n1 == n2) && (n4 == 0) && (n2 == n5)) ||
                            ((n1 == n4) && (n2 == 0) && (n4 == n5)) ||
                            ((n1 == 0) && (n2 == n4) && (n4 == n5))) {

                        dobitak++;
                        Poker = 1;
                    }

                    if (((n1 == n3) && (n3 == n4) && (n4 == n5)) ||
                            ((n1 == n3) && (n3 == n4) && (n5 == 0)) ||
                            ((n1 == n3) && (n4 == 0) && (n3 == n5)) ||
                            ((n1 == n4) && (n3 == 0) && (n4 == n5)) ||
                            ((n1 == 0) && (n3 == n4) && (n4 == n5))) {

                        dobitak++;
                        Poker = 1;
                    }

                    if (((n2 == n3) && (n3 == n4) && (n4 == n5)) ||
                            ((n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                            ((n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                            ((n2 == n4) && (n3 == 0) && (n4 == n5)) ||
                            ((n2 == 0) && (n3 == n4) && (n4 == n5))) {

                        dobitak++;
                        Poker = 1;
                    }
                }

                //FULL HOUSE

                if (dobitak == 0) {

                    if (((n1 == n2) && (n2 == n3) && (n4 == n5)) ||
                            ((n1 == n2) && (n3 == n4) && (n4 == n5)) ||
                            ((n1 == n3) && (n2 == n4) && (n4 == n5)) ||
                            ((n1 == n4) && (n2 == n3) && (n3 == n5)) ||
                            ((n1 == n5) && (n2 == n3) && (n3 == n4)) ||
                            ((n1 == n2) && (n2 == n4) && (n3 == n5)) ||
                            ((n1 == n2) && (n2 == n5) && (n3 == n4)) ||
                            ((n1 == n3) && (n3 == n4) && (n2 == n5)) ||
                            ((n1 == n3) && (n3 == n5) && (n2 == n4)) ||
                            ((n1 == n4) && (n4 == n5) && (n2 == n3)) ||
                            ((n1 == n2) && (n3 == 0) && (n4 == n5)) ||
                            ((n1 == n2) && (n4 == 0) && (n3 == n5)) ||
                            ((n1 == n2) && (n5 == 0) && (n3 == n4)) ||
                            ((n1 == n3) && (n2 == 0) && (n4 == n5)) ||
                            ((n1 == n3) && (n4 == 0) && (n2 == n5)) ||
                            ((n1 == n3) && (n5 == 0) && (n2 == n4)) ||
                            ((n1 == n4) && (n2 == 0) && (n3 == n5)) ||
                            ((n1 == n4) && (n3 == 0) && (n2 == n5)) ||
                            ((n1 == n4) && (n5 == 0) && (n2 == n3)) ||
                            ((n1 == n5) && (n2 == 0) && (n3 == n4)) ||
                            ((n1 == n5) && (n3 == 0) && (n2 == n4)) ||
                            ((n1 == n5) && (n4 == 0) && (n2 == n3)) ||
                            ((n1 == 0) && (n2 == n3) && (n4 == n5)) ||
                            ((n1 == 0) && (n2 == n4) && (n3 == n5)) ||
                            ((n1 == 0) && (n2 == n5) && (n3 == n4))) {

                        dobitak++;
                        Fullhouse = 1;
                    }
                }

                //FLUSH

                if (dobitak == 0) {

                    if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                            ((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                            ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                            ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                            ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                            ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5))) {

                        dobitak++;
                        Flush = 1;
                    }
                }

                //THREE OF A KIND

                if (dobitak == 0) {

                    if (((n1 == n2) && (n2 == n3)) || ((n1 == n2) && (n3 == 0)) || ((n1 == n3) && (n2 == 0)) || ((n2 == n3) && (n1 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n2) && (n2 == n4)) || ((n1 == n2) && (n4 == 0)) || ((n1 == n4) && (n2 == 0)) || ((n2 == n4) && (n1 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n2) && (n2 == n5)) || ((n1 == n2) && (n5 == 0)) || ((n1 == n5) && (n2 == 0)) || ((n2 == n5) && (n1 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n3) && (n3 == n4)) || ((n1 == n3) && (n4 == 0)) || ((n1 == n4) && (n3 == 0)) || ((n3 == n4) && (n1 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n3) && (n3 == n5)) || ((n1 == n3) && (n5 == 0)) || ((n1 == n5) && (n3 == 0)) || ((n3 == n5) && (n1 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n4) && (n4 == n5)) || ((n1 == n4) && (n5 == 0)) || ((n1 == n5) && (n4 == 0)) || ((n4 == n5) && (n1 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n3) && (n3 == n4)) || ((n2 == n3) && (n4 == 0)) || ((n2 == n4) && (n3 == 0)) || ((n3 == n4) && (n2 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n3) && (n3 == n5)) || ((n2 == n3) && (n5 == 0)) || ((n2 == n5) && (n3 == 0)) || ((n3 == n5) && (n2 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n4) && (n4 == n5)) || ((n2 == n4) && (n5 == 0)) || ((n2 == n5) && (n4 == 0)) || ((n4 == n5) && (n2 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }

                    if (((n3 == n4) && (n4 == n5)) || ((n3 == n4) && (n5 == 0)) || ((n3 == n5) && (n4 == 0)) || ((n4 == n5) && (n3 == 0))) {

                        dobitak++;
                        Threeofakind = 1;
                    }
                }

                //2 PAIRS

                if (dobitak == 0) {

                    if (((n1 == n2) && (n3 == n4)) || ((n1 == n3) && (n2 == n4)) || ((n1 == n4) && (n2 == n3))) {

                        dobitak++;
                        Twopairs = 1;
                    }

                    if (((n1 == n2) && (n3 == n5)) || ((n1 == n3) && (n2 == n5)) || ((n1 == n5) && (n2 == n3))) {

                        dobitak++;
                        Twopairs = 1;
                    }

                    if (((n1 == n2) && (n4 == n5)) || ((n1 == n5) && (n2 == n4)) || ((n1 == n4) && (n2 == n5))) {

                        dobitak++;
                        Twopairs = 1;
                    }

                    if (((n1 == n3) && (n4 == n5)) || ((n1 == n5) && (n3 == n4)) || ((n1 == n4) && (n3 == n5))) {

                        dobitak++;
                        Twopairs = 1;
                    }

                    if (((n2 == n3) && (n4 == n5)) || ((n3 == n5) && (n2 == n4)) || ((n3 == n4) && (n2 == n5))) {

                        dobitak++;
                        Twopairs = 1;
                    }
                }

                //HIGH PAIR

                if (dobitak == 0) {
                    if (n1 == n2) {
                        if (n1 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n1 == n3) {
                        if (n1 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n1 == n4) {
                        if (n1 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n1 == n5) {
                        if (n1 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == n3) {
                        if (n2 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == n4) {
                        if (n2 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == n5) {
                        if (n2 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n3 == n4) {
                        if (n3 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n3 == n5) {
                        if (n3 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n4 == n5) {
                        if (n4 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }

                }

                //HIGH PAIR WITH JOKER

                if (dobitak == 0) {

                    if (n1 == 0) {
                        if (n2 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == 0) {
                        if (n1 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n3 == 0) {
                        if (n1 > 10 || n2 > 10 || n4 > 10 || n5 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n4 == 0) {
                        if (n1 > 10 || n2 > 10 || n3 > 10 || n5 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n5 == 0) {
                        if (n1 > 10 || n2 > 10 || n3 > 10 || n4 > 10) {
                            dobitak++;
                            Highpair = 1;
                        }
                    }
                }
                Jokers.ponistavanje2();

                if(Fiveofakind == 1) {
                    Jokers.rucno1.setVisibility(View.VISIBLE);
                }
                if(Royalflush == 1) {
                    Jokers.rucno2.setVisibility(View.VISIBLE);
                }
                if(Streetflush == 1) {
                    Jokers.rucno3.setVisibility(View.VISIBLE);
                }
                if(Poker == 1) {
                    Jokers.rucno4.setVisibility(View.VISIBLE);
                }
                if(Fullhouse == 1) {
                    Jokers.rucno5.setVisibility(View.VISIBLE);
                }
                if(Flush == 1) {
                    Jokers.rucno6.setVisibility(View.VISIBLE);
                }
                if(Street == 1) {
                    Jokers.rucno7.setVisibility(View.VISIBLE);
                }
                if(Threeofakind == 1) {
                    Jokers.rucno8.setVisibility(View.VISIBLE);
                }
                if(Twopairs == 1) {
                    Jokers.rucno9.setVisibility(View.VISIBLE);
                }
                if(Highpair == 1) {
                    Jokers.rucno10.setVisibility(View.VISIBLE);
                }
                Jokers.izbor1 = 2;

            }
        },Jokers.pauzak);
    }
    void ProveraBoje1() {

        dobitak++;

        if (((b1==b2)&&(b2==b3)&&(b3==b4)&&(n5==0)) ||
                ((b1==b2)&&(b2==b3)&&(n4==0)&&(b3==b5)) ||
                ((b1==b2)&&(n3==0)&&(b2==b4)&&(b4==b5)) ||
                ((b1==b3)&&(n2==0)&&(b3==b4)&&(b4==b5)) ||
                ((n1==0)&&(b2==b3)&&(b3==b4)&&(b4==b5)) ||
                (b1==b2)&&(b2==b3)&&(b3==b4)&&(b4==b5)) {

            Royalflush = 1;
        }
        else {
            Street = 1;
        }
    }
    void ProveraBoje2() {

        dobitak++;

        if (((b1==b2)&&(b2==b3)&&(b3==b4)&&(n5==0)) ||
                ((b1==b2)&&(b2==b3)&&(n4==0)&&(b3==b5)) ||
                ((b1==b2)&&(n3==0)&&(b2==b4)&&(b4==b5)) ||
                ((b1==b3)&&(n2==0)&&(b3==b4)&&(b4==b5)) ||
                ((n1==0)&&(b2==b3)&&(b3==b4)&&(b4==b5)) ||
                (b1==b2)&&(b2==b3)&&(b3==b4)&&(b4==b5)) {

            Streetflush = 1;
        }
        else {
            Street = 1;
        }
    }
}


