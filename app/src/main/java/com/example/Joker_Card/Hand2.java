package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.audio_winner;
import static com.example.Joker_Card.MainClass.button_deal;
import static com.example.Joker_Card.MainClass.button_stop1;
import static com.example.Joker_Card.MainClass.button_stop2;
import static com.example.Joker_Card.MainClass.button_stop3;
import static com.example.Joker_Card.MainClass.button_stop4;
import static com.example.Joker_Card.MainClass.button_stop5;
import static com.example.Joker_Card.MainClass.button_take;
import static com.example.Joker_Card.MainClass.centar2;
import static com.example.Joker_Card.MainClass.delaying;
import static com.example.Joker_Card.MainClass.win1;
import static com.example.Joker_Card.MainClass.win10;
import static com.example.Joker_Card.MainClass.win2;
import static com.example.Joker_Card.MainClass.win3;
import static com.example.Joker_Card.MainClass.win4;
import static com.example.Joker_Card.MainClass.win5;
import static com.example.Joker_Card.MainClass.win6;
import static com.example.Joker_Card.MainClass.win7;
import static com.example.Joker_Card.MainClass.win8;
import static com.example.Joker_Card.MainClass.win9;
import static com.example.Joker_Card.MainClass.dobitakdb;
import static com.example.Joker_Card.MainClass.won;
import static com.example.Joker_Card.MainClass.dobitak;
import static com.example.Joker_Card.MainClass.dobitak1;
import static com.example.Joker_Card.MainClass.dobitak2;
import static com.example.Joker_Card.MainClass.dobitak3;
import static com.example.Joker_Card.MainClass.dobitak4;
import static com.example.Joker_Card.MainClass.dobitak5;
import static com.example.Joker_Card.MainClass.dobitak6;
import static com.example.Joker_Card.MainClass.dobitak7;
import static com.example.Joker_Card.MainClass.dobitak8;
import static com.example.Joker_Card.MainClass.dobitak9;
import static com.example.Joker_Card.MainClass.dobitak10;
import static com.example.Joker_Card.MainClass.table;
import static com.example.Joker_Card.MainClass.cash;
import static com.example.Joker_Card.MainClass.choice;
import static com.example.Joker_Card.MainClass.block;
import static com.example.Joker_Card.MainClass.field_card_1;
import static com.example.Joker_Card.MainClass.field_card_2;
import static com.example.Joker_Card.MainClass.field_card_3;
import static com.example.Joker_Card.MainClass.field_card_4;
import static com.example.Joker_Card.MainClass.field_card_5;
import static com.example.Joker_Card.MainClass.dealing;
import static com.example.Joker_Card.MainClass.ponistavanje2;
import static com.example.Joker_Card.MainClass.win1;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import java.util.Locale;

public class Hand2 extends Activity {
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
    Hand2() {
        ponistavanje2();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {

                n1 = Card1.n1;
                n2 = Card2.n2;
                n3 = Card3.n3;
                n4 = Card4.n4;
                n5 = Card5.n5;
                b1 = Card1.b1;
                b2 = Card2.b2;
                b3 = Card3.b3;
                b4 = Card4.b4;
                b5 = Card5.b5;

                won = 0;

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

                if (won == 0) {
                    if (((n1 == n2) && (n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                            ((n1 == n2) && (n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                            ((n1 == n2) && (n3 == 0) && (n2 == n4) && (n4 == n5)) ||
                            ((n1 == n3) && (n2 == 0) && (n3 == n4) && (n4 == n5)) ||
                            ((n1 == 0) && (n2 == n3) && (n3 == n4) && (n4 == n5))) {

                        won++;
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

                if (won == 0) {

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

                if (won == 0) {

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

                if (won == 0) {

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

                if (won == 0) {

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

                if (won == 0) {

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

                if (won == 0) {

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

                if (won == 0) {

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

                if (won == 0) {

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

                if (won == 0) {

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

                if (won == 0) {

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

                if (won == 0) {

                    if (((n1 == n2) && (n2 == n3) && (n3 == n4)) ||
                            ((n1 == n2) && (n2 == n3) && (n4 == 0)) ||
                            ((n1 == n2) && (n3 == 0) && (n2 == n4)) ||
                            ((n1 == n3) && (n2 == 0) && (n3 == n4)) ||
                            ((n1 == 0) && (n2 == n3) && (n3 == n4))) {

                        won++;
                        Poker = 1;
                    }

                    if (((n1 == n2) && (n2 == n3) && (n3 == n5)) ||
                            ((n1 == n2) && (n2 == n3) && (n5 == 0)) ||
                            ((n1 == n2) && (n3 == 0) && (n2 == n5)) ||
                            ((n1 == n3) && (n2 == 0) && (n3 == n5)) ||
                            ((n1 == 0) && (n2 == n3) && (n3 == n5))) {

                        won++;
                        Poker = 1;
                    }

                    if (((n1 == n2) && (n2 == n4) && (n4 == n5)) ||
                            ((n1 == n2) && (n2 == n4) && (n5 == 0)) ||
                            ((n1 == n2) && (n4 == 0) && (n2 == n5)) ||
                            ((n1 == n4) && (n2 == 0) && (n4 == n5)) ||
                            ((n1 == 0) && (n2 == n4) && (n4 == n5))) {

                        won++;
                        Poker = 1;
                    }

                    if (((n1 == n3) && (n3 == n4) && (n4 == n5)) ||
                            ((n1 == n3) && (n3 == n4) && (n5 == 0)) ||
                            ((n1 == n3) && (n4 == 0) && (n3 == n5)) ||
                            ((n1 == n4) && (n3 == 0) && (n4 == n5)) ||
                            ((n1 == 0) && (n3 == n4) && (n4 == n5))) {

                        won++;
                        Poker = 1;
                    }

                    if (((n2 == n3) && (n3 == n4) && (n4 == n5)) ||
                            ((n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                            ((n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                            ((n2 == n4) && (n3 == 0) && (n4 == n5)) ||
                            ((n2 == 0) && (n3 == n4) && (n4 == n5))) {

                        won++;
                        Poker = 1;
                    }
                }

                //FULL HOUSE

                if (won == 0) {

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

                        won++;
                        Fullhouse = 1;
                    }
                }

                //FLUSH

                if (won == 0) {

                    if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                            ((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                            ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                            ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                            ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                            ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5))) {

                        won++;
                        Flush = 1;
                    }
                }

                //THREE OF A KIND

                if (won == 0) {

                    if (((n1 == n2) && (n2 == n3)) || ((n1 == n2) && (n3 == 0)) || ((n1 == n3) && (n2 == 0)) || ((n2 == n3) && (n1 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n2) && (n2 == n4)) || ((n1 == n2) && (n4 == 0)) || ((n1 == n4) && (n2 == 0)) || ((n2 == n4) && (n1 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n2) && (n2 == n5)) || ((n1 == n2) && (n5 == 0)) || ((n1 == n5) && (n2 == 0)) || ((n2 == n5) && (n1 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n3) && (n3 == n4)) || ((n1 == n3) && (n4 == 0)) || ((n1 == n4) && (n3 == 0)) || ((n3 == n4) && (n1 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n3) && (n3 == n5)) || ((n1 == n3) && (n5 == 0)) || ((n1 == n5) && (n3 == 0)) || ((n3 == n5) && (n1 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n4) && (n4 == n5)) || ((n1 == n4) && (n5 == 0)) || ((n1 == n5) && (n4 == 0)) || ((n4 == n5) && (n1 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n3) && (n3 == n4)) || ((n2 == n3) && (n4 == 0)) || ((n2 == n4) && (n3 == 0)) || ((n3 == n4) && (n2 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n3) && (n3 == n5)) || ((n2 == n3) && (n5 == 0)) || ((n2 == n5) && (n3 == 0)) || ((n3 == n5) && (n2 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n4) && (n4 == n5)) || ((n2 == n4) && (n5 == 0)) || ((n2 == n5) && (n4 == 0)) || ((n4 == n5) && (n2 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }

                    if (((n3 == n4) && (n4 == n5)) || ((n3 == n4) && (n5 == 0)) || ((n3 == n5) && (n4 == 0)) || ((n4 == n5) && (n3 == 0))) {

                        won++;
                        Threeofakind = 1;
                    }
                }

                //2 PAIRS

                if (won == 0) {

                    if (((n1 == n2) && (n3 == n4)) || ((n1 == n3) && (n2 == n4)) || ((n1 == n4) && (n2 == n3))) {

                        won++;
                        Twopairs = 1;
                    }

                    if (((n1 == n2) && (n3 == n5)) || ((n1 == n3) && (n2 == n5)) || ((n1 == n5) && (n2 == n3))) {

                        won++;
                        Twopairs = 1;
                    }

                    if (((n1 == n2) && (n4 == n5)) || ((n1 == n5) && (n2 == n4)) || ((n1 == n4) && (n2 == n5))) {

                        won++;
                        Twopairs = 1;
                    }

                    if (((n1 == n3) && (n4 == n5)) || ((n1 == n5) && (n3 == n4)) || ((n1 == n4) && (n3 == n5))) {

                        won++;
                        Twopairs = 1;
                    }

                    if (((n2 == n3) && (n4 == n5)) || ((n3 == n5) && (n2 == n4)) || ((n3 == n4) && (n2 == n5))) {

                        won++;
                        Twopairs = 1;
                    }
                }

                //HIGH PAIR

                if (won == 0) {
                    if (n1 == n2) {
                        if (n1 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n1 == n3) {
                        if (n1 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n1 == n4) {
                        if (n1 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n1 == n5) {
                        if (n1 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == n3) {
                        if (n2 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == n4) {
                        if (n2 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == n5) {
                        if (n2 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n3 == n4) {
                        if (n3 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n3 == n5) {
                        if (n3 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n4 == n5) {
                        if (n4 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }

                }

                //HIGH PAIR WITH JOKER

                if (won == 0) {

                    if (n1 == 0) {
                        if (n2 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n2 == 0) {
                        if (n1 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n3 == 0) {
                        if (n1 > 10 || n2 > 10 || n4 > 10 || n5 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n4 == 0) {
                        if (n1 > 10 || n2 > 10 || n3 > 10 || n5 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                    if (n5 == 0) {
                        if (n1 > 10 || n2 > 10 || n3 > 10 || n4 > 10) {
                            won++;
                            Highpair = 1;
                        }
                    }
                }
                ponistavanje2();

                if (Fiveofakind == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak1.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win1)));
                    cash = win1;
                }
                if (Royalflush == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak2.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win2)));
                    cash = win2;
                }
                if (Streetflush == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak3.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win3)));
                    cash = win3;
                }
                if (Poker == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak4.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win4)));
                    cash = win4;
                }
                if (Fullhouse == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak5.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win5)));
                    cash = win5;
                }
                if (Flush == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak6.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win6)));
                    cash = win6;
                }
                if (Street == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak7.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win7)));
                    cash = win7;
                }
                if (Threeofakind == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak8.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win8)));
                    cash = win8;
                }
                if (Twopairs == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak9.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win9)));
                    cash = win9;
                }
                if (Highpair == 1) {
                    table.setVisibility(View.VISIBLE);
                    dobitak10.setVisibility(View.VISIBLE);
                    dobitak.setVisibility(View.VISIBLE);
                    dobitakdb.setText(String.format(Locale.getDefault(), "%d", (win10)));
                    cash = win10;
                }
                if (won == 1) {
                    button_take.setText(R.string.cash);
                    button_deal.setText(R.string.gamble);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    dobitakdb.setVisibility(View.VISIBLE);
                    audio_winner.start();
                    button_stop1.setVisibility(View.INVISIBLE);
                    button_stop2.setVisibility(View.INVISIBLE);
                    button_stop3.setVisibility(View.INVISIBLE);
                    button_stop4.setVisibility(View.INVISIBLE);
                    button_stop5.setVisibility(View.INVISIBLE);

                    choice = 2;
                    if(cash > 9999) {
                        block = 1;
                        centar2.setText(R.string.win);
                        centar2.setVisibility(View.VISIBLE);
                        button_take.setText(R.string.win);
                        button_deal.setText(R.string.win);
                    }
                }
                else {
                    button_take.setText(R.string.auto_hold);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    field_card_1.setImageResource(R.drawable.k53);
                    field_card_2.setImageResource(R.drawable.k53);
                    field_card_3.setImageResource(R.drawable.k53);
                    field_card_4.setImageResource(R.drawable.k53);
                    field_card_5.setImageResource(R.drawable.k53);
                    field_card_1.setVisibility(View.INVISIBLE);
                    field_card_2.setVisibility(View.INVISIBLE);
                    field_card_3.setVisibility(View.INVISIBLE);
                    field_card_4.setVisibility(View.INVISIBLE);
                    field_card_5.setVisibility(View.INVISIBLE);
                    dealing = 0;
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
        }, delaying);
    }
    void ProveraBoje1() {

        won++;

        if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                (b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) {

            Royalflush = 1;
        }
        else {
            Street = 1;
        }
    }
    void ProveraBoje2() {

        won++;

        if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                (b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) {

            Streetflush = 1;
        }
        else {
            Street = 1;
        }
    }
}
