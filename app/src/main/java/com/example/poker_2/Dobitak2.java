package com.example.poker_2;

import static com.example.poker_2.First.audiodobitnik;
import static com.example.poker_2.First.button_deal;
import static com.example.poker_2.First.button_stop1;
import static com.example.poker_2.First.button_stop2;
import static com.example.poker_2.First.button_stop3;
import static com.example.poker_2.First.button_stop4;
import static com.example.poker_2.First.button_stop5;
import static com.example.poker_2.First.button_take;
import static com.example.poker_2.First.centar2;
import static com.example.poker_2.First.dob1;
import static com.example.poker_2.First.dob10;
import static com.example.poker_2.First.dob2;
import static com.example.poker_2.First.dob3;
import static com.example.poker_2.First.dob4;
import static com.example.poker_2.First.dob5;
import static com.example.poker_2.First.dob6;
import static com.example.poker_2.First.dob7;
import static com.example.poker_2.First.dob8;
import static com.example.poker_2.First.dob9;
import static com.example.poker_2.First.dobitakdb;
import static com.example.poker_2.First.biodobitak;
import static com.example.poker_2.First.dobitak;
import static com.example.poker_2.First.dobitak1;
import static com.example.poker_2.First.dobitak2;
import static com.example.poker_2.First.dobitak3;
import static com.example.poker_2.First.dobitak4;
import static com.example.poker_2.First.dobitak5;
import static com.example.poker_2.First.dobitak6;
import static com.example.poker_2.First.dobitak7;
import static com.example.poker_2.First.dobitak8;
import static com.example.poker_2.First.dobitak9;
import static com.example.poker_2.First.dobitak10;
import static com.example.poker_2.First.table;
import static com.example.poker_2.First.cifra;
import static com.example.poker_2.First.izbor;
import static com.example.poker_2.First.blokada;
import static com.example.poker_2.First.polje1;
import static com.example.poker_2.First.polje2;
import static com.example.poker_2.First.polje3;
import static com.example.poker_2.First.polje4;
import static com.example.poker_2.First.polje5;
import static com.example.poker_2.First.deljenje;
import static com.example.poker_2.First.ponistavanje2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import java.util.Locale;

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
        ponistavanje2();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
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

                biodobitak = 0;

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

                if (biodobitak == 0) {
                    if (((n1 == n2) && (n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                            ((n1 == n2) && (n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                            ((n1 == n2) && (n3 == 0) && (n2 == n4) && (n4 == n5)) ||
                            ((n1 == n3) && (n2 == 0) && (n3 == n4) && (n4 == n5)) ||
                            ((n1 == 0) && (n2 == n3) && (n3 == n4) && (n4 == n5))) {

                        biodobitak++;
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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

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

                if (biodobitak == 0) {

                    if (((n1 == n2) && (n2 == n3) && (n3 == n4)) ||
                            ((n1 == n2) && (n2 == n3) && (n4 == 0)) ||
                            ((n1 == n2) && (n3 == 0) && (n2 == n4)) ||
                            ((n1 == n3) && (n2 == 0) && (n3 == n4)) ||
                            ((n1 == 0) && (n2 == n3) && (n3 == n4))) {

                        biodobitak++;
                        Poker = 1;
                    }

                    if (((n1 == n2) && (n2 == n3) && (n3 == n5)) ||
                            ((n1 == n2) && (n2 == n3) && (n5 == 0)) ||
                            ((n1 == n2) && (n3 == 0) && (n2 == n5)) ||
                            ((n1 == n3) && (n2 == 0) && (n3 == n5)) ||
                            ((n1 == 0) && (n2 == n3) && (n3 == n5))) {

                        biodobitak++;
                        Poker = 1;
                    }

                    if (((n1 == n2) && (n2 == n4) && (n4 == n5)) ||
                            ((n1 == n2) && (n2 == n4) && (n5 == 0)) ||
                            ((n1 == n2) && (n4 == 0) && (n2 == n5)) ||
                            ((n1 == n4) && (n2 == 0) && (n4 == n5)) ||
                            ((n1 == 0) && (n2 == n4) && (n4 == n5))) {

                        biodobitak++;
                        Poker = 1;
                    }

                    if (((n1 == n3) && (n3 == n4) && (n4 == n5)) ||
                            ((n1 == n3) && (n3 == n4) && (n5 == 0)) ||
                            ((n1 == n3) && (n4 == 0) && (n3 == n5)) ||
                            ((n1 == n4) && (n3 == 0) && (n4 == n5)) ||
                            ((n1 == 0) && (n3 == n4) && (n4 == n5))) {

                        biodobitak++;
                        Poker = 1;
                    }

                    if (((n2 == n3) && (n3 == n4) && (n4 == n5)) ||
                            ((n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                            ((n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                            ((n2 == n4) && (n3 == 0) && (n4 == n5)) ||
                            ((n2 == 0) && (n3 == n4) && (n4 == n5))) {

                        biodobitak++;
                        Poker = 1;
                    }
                }

                //FULL HOUSE

                if (biodobitak == 0) {

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

                        biodobitak++;
                        Fullhouse = 1;
                    }
                }

                //FLUSH

                if (biodobitak == 0) {

                    if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                            ((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                            ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                            ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                            ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                            ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5))) {

                        biodobitak++;
                        Flush = 1;
                    }
                }

                //THREE OF A KIND

                if (biodobitak == 0) {

                    if (((n1 == n2) && (n2 == n3)) || ((n1 == n2) && (n3 == 0)) || ((n1 == n3) && (n2 == 0)) || ((n2 == n3) && (n1 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n2) && (n2 == n4)) || ((n1 == n2) && (n4 == 0)) || ((n1 == n4) && (n2 == 0)) || ((n2 == n4) && (n1 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n2) && (n2 == n5)) || ((n1 == n2) && (n5 == 0)) || ((n1 == n5) && (n2 == 0)) || ((n2 == n5) && (n1 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n3) && (n3 == n4)) || ((n1 == n3) && (n4 == 0)) || ((n1 == n4) && (n3 == 0)) || ((n3 == n4) && (n1 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n3) && (n3 == n5)) || ((n1 == n3) && (n5 == 0)) || ((n1 == n5) && (n3 == 0)) || ((n3 == n5) && (n1 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n4) && (n4 == n5)) || ((n1 == n4) && (n5 == 0)) || ((n1 == n5) && (n4 == 0)) || ((n4 == n5) && (n1 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n3) && (n3 == n4)) || ((n2 == n3) && (n4 == 0)) || ((n2 == n4) && (n3 == 0)) || ((n3 == n4) && (n2 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n3) && (n3 == n5)) || ((n2 == n3) && (n5 == 0)) || ((n2 == n5) && (n3 == 0)) || ((n3 == n5) && (n2 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n4) && (n4 == n5)) || ((n2 == n4) && (n5 == 0)) || ((n2 == n5) && (n4 == 0)) || ((n4 == n5) && (n2 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }

                    if (((n3 == n4) && (n4 == n5)) || ((n3 == n4) && (n5 == 0)) || ((n3 == n5) && (n4 == 0)) || ((n4 == n5) && (n3 == 0))) {

                        biodobitak++;
                        Threeofakind = 1;
                    }
                }

                //2 PAIRS

                if (biodobitak == 0) {

                    if (((n1 == n2) && (n3 == n4)) || ((n1 == n3) && (n2 == n4)) || ((n1 == n4) && (n2 == n3))) {

                        biodobitak++;
                        Twopairs = 1;
                    }

                    if (((n1 == n2) && (n3 == n5)) || ((n1 == n3) && (n2 == n5)) || ((n1 == n5) && (n2 == n3))) {

                        biodobitak++;
                        Twopairs = 1;
                    }

                    if (((n1 == n2) && (n4 == n5)) || ((n1 == n5) && (n2 == n4)) || ((n1 == n4) && (n2 == n5))) {

                        biodobitak++;
                        Twopairs = 1;
                    }

                    if (((n1 == n3) && (n4 == n5)) || ((n1 == n5) && (n3 == n4)) || ((n1 == n4) && (n3 == n5))) {

                        biodobitak++;
                        Twopairs = 1;
                    }

                    if (((n2 == n3) && (n4 == n5)) || ((n3 == n5) && (n2 == n4)) || ((n3 == n4) && (n2 == n5))) {

                        biodobitak++;
                        Twopairs = 1;
                    }
                }

                //HIGH PAIR

                if (biodobitak == 0) {
                    if (n1 == n2) {
                        if (n1 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n1 == n3) {
                        if (n1 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n1 == n4) {
                        if (n1 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n1 == n5) {
                        if (n1 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == n3) {
                        if (n2 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == n4) {
                        if (n2 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == n5) {
                        if (n2 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n3 == n4) {
                        if (n3 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n3 == n5) {
                        if (n3 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n4 == n5) {
                        if (n4 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }

                }

                //HIGH PAIR WITH JOKER

                if (biodobitak == 0) {

                    if (n1 == 0) {
                        if (n2 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == 0) {
                        if (n1 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n3 == 0) {
                        if (n1 > 10 || n2 > 10 || n4 > 10 || n5 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n4 == 0) {
                        if (n1 > 10 || n2 > 10 || n3 > 10 || n5 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                    if (n5 == 0) {
                        if (n1 > 10 || n2 > 10 || n3 > 10 || n4 > 10) {
                            biodobitak++;
                            Highpair = 1;
                        }
                    }
                }
                ponistavanje2();

                if (Fiveofakind == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak1.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob1)));
                    dobitakdb.setText(Integer.toString(dob1));
                    cifra = dob1;
                }
                if (Royalflush == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak2.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob2)));
                    cifra = dob2;
                }
                if (Streetflush == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak3.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob3)));
                    cifra = dob3;
                }
                if (Poker == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak4.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob4)));
                    cifra = dob4;
                }
                if (Fullhouse == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak5.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob5)));
                    cifra = dob5;
                }
                if (Flush == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak6.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob6)));
                    cifra = dob6;
                }
                if (Street == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak7.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob7)));
                    cifra = dob7;
                }
                if (Threeofakind == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak8.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob8)));
                    cifra = dob8;
                }
                if (Twopairs == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak9.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob9)));
                    cifra = dob9;
                }
                if (Highpair == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak10.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (dob10)));
                    cifra = dob10;
                }
                if (biodobitak == 1) {
                    button_take.setText("TAKE");
                    button_deal.setText("GAMBLE");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    dobitakdb.setVisibility(View.VISIBLE);
                    audiodobitnik.start();
                    button_stop1.setVisibility(View.INVISIBLE);
                    button_stop2.setVisibility(View.INVISIBLE);
                    button_stop3.setVisibility(View.INVISIBLE);
                    button_stop4.setVisibility(View.INVISIBLE);
                    button_stop5.setVisibility(View.INVISIBLE);

                    izbor = 2;
                    if(cifra>9999) {
                        blokada = 1;
                        centar2.setText("YOU WIN !");
                        centar2.setVisibility(View.VISIBLE);
                        button_take.setText("WIN !");
                        button_deal.setText("WIN !");
                    }
                } else {
                    button_take.setText("AUTO HOLD");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    polje1.setImageResource(R.drawable.k53);
                    polje2.setImageResource(R.drawable.k53);
                    polje3.setImageResource(R.drawable.k53);
                    polje4.setImageResource(R.drawable.k53);
                    polje5.setImageResource(R.drawable.k53);
                    polje1.setVisibility(View.INVISIBLE);
                    polje2.setVisibility(View.INVISIBLE);
                    polje3.setVisibility(View.INVISIBLE);
                    polje4.setVisibility(View.INVISIBLE);
                    polje5.setVisibility(View.INVISIBLE);
                    deljenje = 0;
                    Jokers.handler1.removeCallbacks(Jokers.runnable1);
                    Jokers.handler2.removeCallbacks(Jokers.runnable2);
                    Jokers.handler3.removeCallbacks(Jokers.runnable3);
                    Jokers.handler4.removeCallbacks(Jokers.runnable4);
                    Jokers.handler5.removeCallbacks(Jokers.runnable5);
                    Jokers.handler6.removeCallbacks(Jokers.runnable6);
                    Jokers.handler7.removeCallbacks(Jokers.runnable7);
                    Jokers.handler8.removeCallbacks(Jokers.runnable8);
                    new Jokers();
                }
            }
        },First.pauzak);
    }
    void ProveraBoje1() {

        biodobitak++;

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

        biodobitak++;

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
