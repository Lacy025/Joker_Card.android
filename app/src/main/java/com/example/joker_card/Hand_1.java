package com.example.joker_card;

import static com.example.joker_card.MainClass.hand_1;
import static com.example.joker_card.MainClass.hand_2;
import static com.example.joker_card.MainClass.hand_3;
import static com.example.joker_card.MainClass.hand_4;
import static com.example.joker_card.MainClass.hand_5;
import static com.example.joker_card.MainClass.hand_6;
import static com.example.joker_card.MainClass.hand_7;
import static com.example.joker_card.MainClass.hand_8;
import static com.example.joker_card.MainClass.hand_9;
import static com.example.joker_card.MainClass.hand_10;
import static com.example.joker_card.MainClass.ah;
import static com.example.joker_card.MainClass.stop;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

public class Hand_1 extends Activity {
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
    int first_win;
    int twins;
    int four_colors;
    int Five_of_a_kind;
    int Royal_flush;
    int Street_flush;
    int Poker;
    int Full_house;
    int Flush;
    int Street;
    int Three_of_a_kind;
    int Two_pairs;
    int High_pair;
    int half_street;
    int royal;
    int Street_flush_1;
    int Street_flush_2;
    int Street_flush_3;
    int Street_flush_4;
    int Street_flush_5;
    int Street_flush_6;
    int Street_flush_7;
    int Street_flush_8;
    int Street_flush_9;
    public static int hold1;
    public static int hold2;
    public static int hold3;
    public static int hold4;
    public static int hold5;
    Hand_1() {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {

            n1 = Card_1.n1;
            n2 = Card_2.n2;
            n3 = Card_3.n3;
            n4 = Card_4.n4;
            n5 = Card_5.n5;
            b1 = Card_1.b1;
            b2 = Card_2.b2;
            b3 = Card_3.b3;
            b4 = Card_4.b4;
            b5 = Card_5.b5;

            first_win = 0;
            twins = 0;
            four_colors = 0;

            Five_of_a_kind = 0;
            Royal_flush = 0;
            Street_flush = 0;
            Poker = 0;
            Full_house = 0;
            Flush = 0;
            Street = 0;
            Three_of_a_kind = 0;
            Two_pairs = 0;
            High_pair = 0;

            hold1 = 0;
            hold2 = 0;
            hold3 = 0;
            hold4 = 0;
            hold5 = 0;

            // FIVE OF A KIND

            if (first_win == 0) {
                if (((n1 == n2) && (n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                        ((n1 == n2) && (n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                        ((n1 == n2) && (n3 == 0) && (n2 == n4) && (n4 == n5)) ||
                        ((n1 == n3) && (n2 == 0) && (n3 == n4) && (n4 == n5)) ||
                        ((n1 == 0) && (n2 == n3) && (n3 == n4) && (n4 == n5))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Five_of_a_kind = 1;
                }
            }

            // ROYAL FLUSH OR STREET

            half_street = 0;
            royal = 0;
            Street_flush_1 = 0;
            Street_flush_2 = 0;
            Street_flush_3 = 0;
            Street_flush_4 = 0;
            Street_flush_5 = 0;
            Street_flush_6 = 0;
            Street_flush_7 = 0;
            Street_flush_8 = 0;
            Street_flush_9 = 0;

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    royal++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    royal++;
                }
                if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                    royal++;
                }
                if (n1 == 12 || n2 == 12 || n3 == 12 || n4 == 12 || n5 == 12) {
                    royal++;
                }
                if (n1 == 13 || n2 == 13 || n3 == 13 || n4 == 13 || n5 == 13) {
                    royal++;
                }
                if (n1 == 14 || n2 == 14 || n3 == 14 || n4 == 14 || n5 == 14) {
                    royal++;
                }

                if (royal == 5) {
                    Color_Check_1();
                }
                if (royal == 4) {

                    if (n1 == 0 || n1 == 10 || n1 == 11 || n1 == 12 || n1 == 13 || n1 == 14) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 10 || n2 == 11 || n2 == 12 || n2 == 13 || n2 == 14) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 10 || n3 == 11 || n3 == 12 || n3 == 13 || n3 == 14) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 10 || n4 == 11 || n4 == 12 || n4 == 13 || n4 == 14) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 10 || n5 == 11 || n5 == 12 || n5 == 13 || n5 == 14) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // STREET FLUSH OR STREET
            // 9-13

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_9++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_9++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    Street_flush_9++;
                }
                if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                    Street_flush_9++;
                }
                if (n1 == 12 || n2 == 12 || n3 == 12 || n4 == 12 || n5 == 12) {
                    Street_flush_9++;
                }
                if (n1 == 13 || n2 == 13 || n3 == 13 || n4 == 13 || n5 == 13) {
                    Street_flush_9++;
                }

                if (Street_flush_9 == 5) {
                    Color_Check_2();
                }
                if (Street_flush_9 == 4 && royal < 4) {

                    if (n1 == 0 || n1 == 9 || n1 == 10 || n1 == 11 || n1 == 12 || n1 == 13) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 9 || n2 == 10 || n2 == 11 || n2 == 12 || n2 == 13) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 9 || n3 == 10 || n3 == 11 || n3 == 12 || n3 == 13) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 9 || n4 == 10 || n4 == 11 || n4 == 12 || n4 == 13) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 9 || n5 == 10 || n5 == 11 || n5 == 12 || n5 == 13) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // STREET FLUSH OR STREET
            // 8-12

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_8++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_8++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_8++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    Street_flush_8++;
                }
                if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                    Street_flush_8++;
                }
                if (n1 == 12 || n2 == 12 || n3 == 12 || n4 == 12 || n5 == 12) {
                    Street_flush_8++;
                }

                if (Street_flush_8 == 5) {
                    Color_Check_2();
                }
                if (Street_flush_8 == 4 && Street_flush_9 < 4 && royal < 4) {

                    if (n1 == 0 || n1 == 8 || n1 == 9 || n1 == 10 || n1 == 11 || n1 == 12) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 8 || n2 == 9 || n2 == 10 || n2 == 11 || n2 == 12) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 8 || n3 == 9 || n3 == 10 || n3 == 11 || n3 == 12) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 8 || n4 == 9 || n4 == 10 || n4 == 11 || n4 == 12) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 8 || n5 == 9 || n5 == 10 || n5 == 11 || n5 == 12) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // STREET FLUSH OR STREET
            // 7-11

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_7++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_7++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_7++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_7++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    Street_flush_7++;
                }
                if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                    Street_flush_7++;
                }

                if (Street_flush_7 == 5) {
                    Color_Check_2();
                }
                if (Street_flush_7 == 4 && Street_flush_8 < 4 && Street_flush_9 < 4 && royal < 4) {

                    if (n1 == 0 || n1 == 7 || n1 == 8 || n1 == 9 || n1 == 10 || n1 == 11) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 7 || n2 == 8 || n2 == 9 || n2 == 10 || n2 == 11) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 7 || n3 == 8 || n3 == 9 || n3 == 10 || n3 == 11) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 7 || n4 == 8 || n4 == 9 || n4 == 10 || n4 == 11) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 7 || n5 == 8 || n5 == 9 || n5 == 10 || n5 == 11) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // STREET FLUSH OR STREET
            // 6-10

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_6++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_6++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_6++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_6++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_6++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    Street_flush_6++;
                }

                if (Street_flush_6 == 5) {
                    Color_Check_2();
                }
                if (Street_flush_6 == 4 && Street_flush_7 < 4 && Street_flush_8 < 4 && Street_flush_9 < 4) {

                    if (n1 == 0 || n1 == 6 || n1 == 7 || n1 == 8 || n1 == 9 || n1 == 10) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 6 || n2 == 7 || n2 == 8 || n2 == 9 || n2 == 10) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 6 || n3 == 7 || n3 == 8 || n3 == 9 || n3 == 10) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 6 || n4 == 7 || n4 == 8 || n4 == 9 || n4 == 10) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 6 || n5 == 7 || n5 == 8 || n5 == 9 || n5 == 10) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // STREET FLUSH OR STREET
            // 5-9

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_5++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_5++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_5++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_5++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_5++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_5++;
                }

                if (Street_flush_5 == 5) {
                    Color_Check_2();
                }
                if (Street_flush_5 == 4 && Street_flush_6 < 4 && Street_flush_7 < 4 && Street_flush_8 < 4) {

                    if (n1 == 0 || n1 == 5 || n1 == 6 || n1 == 7 || n1 == 8 || n1 == 9) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 5 || n2 == 6 || n2 == 7 || n2 == 8 || n2 == 9) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 5 || n3 == 6 || n3 == 7 || n3 == 8 || n3 == 9) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 5 || n4 == 6 || n4 == 7 || n4 == 8 || n4 == 9) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 5 || n5 == 6 || n5 == 7 || n5 == 8 || n5 == 9) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // STREET FLUSH OR STREET
            // 4-8

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_4++;
                }
                if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                    Street_flush_4++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_4++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_4++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_4++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_4++;
                }

                if (Street_flush_4 == 5) {
                    Color_Check_2();
                }
                if (Street_flush_4 == 4 && Street_flush_5 < 4 && Street_flush_6 < 4 && Street_flush_7 < 4) {

                    if (n1 == 0 || n1 == 4 || n1 == 5 || n1 == 6 || n1 == 7 || n1 == 8) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 4 || n2 == 5 || n2 == 6 || n2 == 7 || n2 == 8) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 4 || n3 == 5 || n3 == 6 || n3 == 7 || n3 == 8) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 4 || n4 == 5 || n4 == 6 || n4 == 7 || n4 == 8) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 4 || n5 == 5 || n5 == 6 || n5 == 7 || n5 == 8) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // STREET FLUSH OR STREET
            // 3-7

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_3++;
                }
                if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
                    Street_flush_3++;
                }
                if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                    Street_flush_3++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_3++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_3++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_3++;
                }

                if (Street_flush_3 == 5) {
                    Color_Check_2();
                }
                if (Street_flush_3 == 4 && Street_flush_4 < 4 && Street_flush_5 < 4 && Street_flush_6 < 4) {

                    if (n1 == 0 || n1 == 3 || n1 == 4 || n1 == 5 || n1 == 6 || n1 == 7) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 3 || n2 == 4 || n2 == 5 || n2 == 6 || n2 == 7) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 3 || n3 == 4 || n3 == 5 || n3 == 6 || n3 == 7) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 3 || n4 == 4 || n4 == 5 || n4 == 6 || n4 == 7) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 3 || n5 == 4 || n5 == 5 || n5 == 6 || n5 == 7) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // STREET FLUSH OR STREET
            // 2-6

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_2++;
                }
                if (n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2) {
                    Street_flush_2++;
                }
                if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
                    Street_flush_2++;
                }
                if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                    Street_flush_2++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_2++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_2++;
                }

                if (Street_flush_2 == 5) {
                    Color_Check_2();
                }
                if (Street_flush_2 == 4 && Street_flush_3 < 4 && Street_flush_4 < 4 && Street_flush_5 < 4) {

                    if (n1 == 0 || n1 == 2 || n1 == 3 || n1 == 4 || n1 == 5 || n1 == 6) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 2 || n2 == 3 || n2 == 4 || n2 == 5 || n2 == 6) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 2 || n3 == 3 || n3 == 4 || n3 == 5 || n3 == 6) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 2 || n4 == 3 || n4 == 4 || n4 == 5 || n4 == 6) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 2 || n5 == 3 || n5 == 4 || n5 == 5 || n5 == 6) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // STREET FLUSH OR STREET
            // 1-5

            if (first_win == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_1++;
                }
                if (n1 == 14 || n2 == 14 || n3 == 14 || n4 == 14 || n5 == 14) {
                    Street_flush_1++;
                }
                if (n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2) {
                    Street_flush_1++;
                }
                if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
                    Street_flush_1++;
                }
                if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                    Street_flush_1++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_1++;
                }

                if (Street_flush_1 == 5) {
                    Color_Check_2();
                }
                if (Street_flush_1 == 4 && Street_flush_2 < 4 && Street_flush_3 < 4 && Street_flush_4 < 4) {

                    if (n1 == 0 || n1 == 14 || n1 == 2 || n1 == 3 || n1 == 4 || n1 == 5) {
                        hold1 = 1;
                    }
                    if (n2 == 0 || n2 == 14 || n2 == 2 || n2 == 3 || n2 == 4 || n2 == 5) {
                        hold2 = 1;
                    }
                    if (n3 == 0 || n3 == 14 || n3 == 2 || n3 == 3 || n3 == 4 || n3 == 5) {
                        hold3 = 1;
                    }
                    if (n4 == 0 || n4 == 14 || n4 == 2 || n4 == 3 || n4 == 4 || n4 == 5) {
                        hold4 = 1;
                    }
                    if (n5 == 0 || n5 == 14 || n5 == 2 || n5 == 3 || n5 == 4 || n5 == 5) {
                        hold5 = 1;
                    }

                    twins();
                }
            }

            // POKER

            if (first_win == 0) {

                if (((n1 == n2) && (n2 == n3) && (n3 == n4)) ||
                        ((n1 == n2) && (n2 == n3) && (n4 == 0)) ||
                        ((n1 == n2) && (n3 == 0) && (n2 == n4)) ||
                        ((n1 == n3) && (n2 == 0) && (n3 == n4)) ||
                        ((n1 == 0) && (n2 == n3) && (n3 == n4))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 0;
                    first_win++;
                    Poker = 1;
                }

                if (((n1 == n2) && (n2 == n3) && (n3 == n5)) ||
                        ((n1 == n2) && (n2 == n3) && (n5 == 0)) ||
                        ((n1 == n2) && (n3 == 0) && (n2 == n5)) ||
                        ((n1 == n3) && (n2 == 0) && (n3 == n5)) ||
                        ((n1 == 0) && (n2 == n3) && (n3 == n5))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 0;
                    hold5 = 1;
                    first_win++;
                    Poker = 1;
                }

                if (((n1 == n2) && (n2 == n4) && (n4 == n5)) ||
                        ((n1 == n2) && (n2 == n4) && (n5 == 0)) ||
                        ((n1 == n2) && (n4 == 0) && (n2 == n5)) ||
                        ((n1 == n4) && (n2 == 0) && (n4 == n5)) ||
                        ((n1 == 0) && (n2 == n4) && (n4 == n5))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 0;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Poker = 1;
                }

                if (((n1 == n3) && (n3 == n4) && (n4 == n5)) ||
                        ((n1 == n3) && (n3 == n4) && (n5 == 0)) ||
                        ((n1 == n3) && (n4 == 0) && (n3 == n5)) ||
                        ((n1 == n4) && (n3 == 0) && (n4 == n5)) ||
                        ((n1 == 0) && (n3 == n4) && (n4 == n5))) {
                    hold1 = 1;
                    hold2 = 0;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Poker = 1;
                }

                if (((n2 == n3) && (n3 == n4) && (n4 == n5)) ||
                        ((n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                        ((n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                        ((n2 == n4) && (n3 == 0) && (n4 == n5)) ||
                        ((n2 == 0) && (n3 == n4) && (n4 == n5))) {
                    hold1 = 0;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Poker = 1;
                }
            }

            //FULL HOUSE

            if (first_win == 0) {

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

                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Full_house = 1;
                }
            }

            //FLUSH

            if (first_win == 0) {

                if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                        ((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                        ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                        ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                        ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                        ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5))) {

                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Flush = 1;
                }
            }

            //THREE OF A KIND

            if (first_win == 0) {

                if (((n1 == n2) && (n2 == n3)) || ((n1 == n2) && (n3 == 0)) || ((n1 == n3) && (n2 == 0)) || ((n2 == n3) && (n1 == 0))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 0;
                    hold5 = 0;
                    first_win++;
                    Three_of_a_kind = 1;
                }

                if (((n1 == n2) && (n2 == n4)) || ((n1 == n2) && (n4 == 0)) || ((n1 == n4) && (n2 == 0)) || ((n2 == n4) && (n1 == 0))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 0;
                    hold4 = 1;
                    hold5 = 0;
                    first_win++;
                    Three_of_a_kind = 1;
                }

                if (((n1 == n2) && (n2 == n5)) || ((n1 == n2) && (n5 == 0)) || ((n1 == n5) && (n2 == 0)) || ((n2 == n5) && (n1 == 0))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 0;
                    hold4 = 0;
                    hold5 = 1;
                    first_win++;
                    Three_of_a_kind = 1;
                }

                if (((n1 == n3) && (n3 == n4)) || ((n1 == n3) && (n4 == 0)) || ((n1 == n4) && (n3 == 0)) || ((n3 == n4) && (n1 == 0))) {
                    hold1 = 1;
                    hold2 = 0;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 0;
                    first_win++;
                    Three_of_a_kind = 1;
                }

                if (((n1 == n3) && (n3 == n5)) || ((n1 == n3) && (n5 == 0)) || ((n1 == n5) && (n3 == 0)) || ((n3 == n5) && (n1 == 0))) {
                    hold1 = 1;
                    hold2 = 0;
                    hold3 = 1;
                    hold4 = 0;
                    hold5 = 1;
                    first_win++;
                    Three_of_a_kind = 1;
                }

                if (((n1 == n4) && (n4 == n5)) || ((n1 == n4) && (n5 == 0)) || ((n1 == n5) && (n4 == 0)) || ((n4 == n5) && (n1 == 0))) {
                    hold1 = 1;
                    hold2 = 0;
                    hold3 = 0;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Three_of_a_kind = 1;
                }

                if (((n2 == n3) && (n3 == n4)) || ((n2 == n3) && (n4 == 0)) || ((n2 == n4) && (n3 == 0)) || ((n3 == n4) && (n2 == 0))) {
                    hold1 = 0;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 0;
                    first_win++;
                    Three_of_a_kind = 1;
                }

                if (((n2 == n3) && (n3 == n5)) || ((n2 == n3) && (n5 == 0)) || ((n2 == n5) && (n3 == 0)) || ((n3 == n5) && (n2 == 0))) {
                    hold1 = 0;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 0;
                    hold5 = 1;
                    first_win++;
                    Three_of_a_kind = 1;
                }

                if (((n2 == n4) && (n4 == n5)) || ((n2 == n4) && (n5 == 0)) || ((n2 == n5) && (n4 == 0)) || ((n4 == n5) && (n2 == 0))) {
                    hold1 = 0;
                    hold2 = 1;
                    hold3 = 0;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Three_of_a_kind = 1;
                }

                if (((n3 == n4) && (n4 == n5)) || ((n3 == n4) && (n5 == 0)) || ((n3 == n5) && (n4 == 0)) || ((n4 == n5) && (n3 == 0))) {
                    hold1 = 0;
                    hold2 = 0;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Three_of_a_kind = 1;
                }
            }

            //2 PAIRS

            if (first_win == 0) {

                if (((n1 == n2) && (n3 == n4)) || ((n1 == n3) && (n2 == n4)) || ((n1 == n4) && (n2 == n3))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 0;
                    first_win++;
                    Two_pairs = 1;
                }

                if (((n1 == n2) && (n3 == n5)) || ((n1 == n3) && (n2 == n5)) || ((n1 == n5) && (n2 == n3))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 0;
                    hold5 = 1;
                    first_win++;
                    Two_pairs = 1;
                }

                if (((n1 == n2) && (n4 == n5)) || ((n1 == n5) && (n2 == n4)) || ((n1 == n4) && (n2 == n5))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 0;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Two_pairs = 1;
                }

                if (((n1 == n3) && (n4 == n5)) || ((n1 == n5) && (n3 == n4)) || ((n1 == n4) && (n3 == n5))) {
                    hold1 = 1;
                    hold2 = 0;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Two_pairs = 1;
                }

                if (((n2 == n3) && (n4 == n5)) || ((n3 == n5) && (n2 == n4)) || ((n3 == n4) && (n2 == n5))) {
                    hold1 = 0;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    first_win++;
                    Two_pairs = 1;
                }
            }

            //HIGH PAIR

            if (first_win == 0) {

                if (n1 == n2) {
                    if (half_street == 0) {
                        hold1 = 1;
                        hold2 = 1;
                        hold3 = 0;
                        hold4 = 0;
                        hold5 = 0;
                    }
                    if (n1 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n1 < 11) {
                        twins = 1;
                    }
                }
                if (n1 == n3) {
                    if (half_street == 0) {
                        hold1 = 1;
                        hold2 = 0;
                        hold3 = 1;
                        hold4 = 0;
                        hold5 = 0;
                    }
                    if (n1 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n1 < 11) {
                        twins = 1;
                    }
                }
                if (n1 == n4) {
                    if (half_street == 0) {
                        hold1 = 1;
                        hold2 = 0;
                        hold3 = 0;
                        hold4 = 1;
                        hold5 = 0;
                    }
                    if (n1 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n1 < 11) {
                        twins = 1;
                    }
                }
                if (n1 == n5) {
                    if (half_street == 0) {
                        hold1 = 1;
                        hold2 = 0;
                        hold3 = 0;
                        hold4 = 0;
                        hold5 = 1;
                    }
                    if (n1 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n1 < 11) {
                        twins = 1;
                    }
                }
                if (n2 == n3) {
                    if (half_street == 0) {
                        hold1 = 0;
                        hold2 = 1;
                        hold3 = 1;
                        hold4 = 0;
                        hold5 = 0;
                    }
                    if (n2 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n2 < 11) {
                        twins = 1;
                    }
                }
                if (n2 == n4) {
                    if (half_street == 0) {
                        hold1 = 0;
                        hold2 = 1;
                        hold3 = 0;
                        hold4 = 1;
                        hold5 = 0;
                    }
                    if (n2 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n2 < 11) {
                        twins = 1;
                    }
                }
                if (n2 == n5) {
                    if (half_street == 0) {
                        hold1 = 0;
                        hold2 = 1;
                        hold3 = 0;
                        hold4 = 0;
                        hold5 = 1;
                    }
                    if (n2 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n2 < 11) {
                        twins = 1;
                    }
                }
                if (n3 == n4) {
                    if (half_street == 0) {
                        hold1 = 0;
                        hold2 = 0;
                        hold3 = 1;
                        hold4 = 1;
                        hold5 = 0;
                    }
                    if (n3 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n3 < 11) {
                        twins = 1;
                    }
                }
                if (n3 == n5) {
                    if (half_street == 0) {
                        hold1 = 0;
                        hold2 = 0;
                        hold3 = 1;
                        hold4 = 0;
                        hold5 = 1;
                    }
                    if (n3 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n3 < 11) {
                        twins = 1;
                    }
                }
                if (n4 == n5) {
                    if (half_street == 0) {
                        hold1 = 0;
                        hold2 = 0;
                        hold3 = 0;
                        hold4 = 1;
                        hold5 = 1;
                    }
                    if (n4 > 10) {
                        first_win++;
                        High_pair = 1;
                    }
                    if (n4 < 11) {
                        twins = 1;
                    }
                }

            }

            //HIGH PAIR WITH JOKER

            if (first_win == 0) {

                if (half_street == 1) {

                    if (n1 == 0) {
                        if (n2 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                            first_win++;
                            High_pair = 1;
                        }
                    }
                    if (n2 == 0) {
                        if (n1 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                            first_win++;
                            High_pair = 1;
                        }
                    }
                    if (n3 == 0) {
                        if (n1 > 10 || n2 > 10 || n4 > 10 || n5 > 10) {
                            first_win++;
                            High_pair = 1;
                        }
                    }
                    if (n4 == 0) {
                        if (n1 > 10 || n2 > 10 || n3 > 10 || n5 > 10) {
                            first_win++;
                            High_pair = 1;
                        }
                    }
                    if (n5 == 0) {
                        if (n1 > 10 || n2 > 10 || n3 > 10 || n4 > 10) {
                            first_win++;
                            High_pair = 1;
                        }
                    }
                } else {

                    if (n1 == 0) {
                        hold1 = 1;
                        if (n2 > 10) {
                            first_win++;
                            High_pair = 1;
                            hold2 = 1;
                        }
                        if (first_win == 0) {

                            if (n3 > 10) {
                                first_win++;
                                High_pair = 1;
                                hold3 = 1;
                            }
                        }
                        if (first_win == 0) {

                            if (n4 > 10) {
                                first_win++;
                                High_pair = 1;
                                hold4 = 1;
                            }
                        }
                        if (first_win == 0) {

                            if (n5 > 10) {
                                first_win++;
                                High_pair = 1;
                                hold5 = 1;
                            }
                        }
                    }
                    if (first_win == 0) {

                        if (n2 == 0) {
                            hold2 = 1;
                            if (n1 > 10) {
                                first_win++;
                                High_pair = 1;
                                hold1 = 1;
                            }
                            if (first_win == 0) {

                                if (n3 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold3 = 1;
                                }
                            }
                            if (first_win == 0) {

                                if (n4 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold4 = 1;
                                }
                            }
                            if (first_win == 0) {

                                if (n5 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold5 = 1;
                                }
                            }
                        }
                    }
                    if (first_win == 0) {

                        if (n3 == 0) {
                            hold3 = 1;
                            if (n1 > 10) {
                                first_win++;
                                High_pair = 1;
                                hold1 = 1;
                            }
                            if (first_win == 0) {

                                if (n2 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold2 = 1;
                                }
                            }
                            if (first_win == 0) {

                                if (n4 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold4 = 1;
                                }
                            }
                            if (first_win == 0) {

                                if (n5 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold5 = 1;
                                }
                            }
                        }
                    }
                    if (first_win == 0) {

                        if (n4 == 0) {
                            hold4 = 1;
                            if (n1 > 10) {
                                first_win++;
                                High_pair = 1;
                                hold1 = 1;
                            }
                            if (first_win == 0) {

                                if (n2 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold2 = 1;
                                }
                            }
                            if (first_win == 0) {

                                if (n3 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold3 = 1;
                                }
                            }
                            if (first_win == 0) {

                                if (n5 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold5 = 1;
                                }
                            }
                        }
                    }
                    if (first_win == 0) {

                        if (n5 == 0) {
                            hold5 = 1;
                            if (n1 > 10) {
                                first_win++;
                                High_pair = 1;
                                hold1 = 1;
                            }
                            if (first_win == 0) {

                                if (n2 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold2 = 1;
                                }
                            }
                            if (first_win == 0) {

                                if (n3 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold3 = 1;
                                }
                            }
                            if (first_win == 0) {

                                if (n4 > 10) {
                                    first_win++;
                                    High_pair = 1;
                                    hold4 = 1;
                                }
                            }
                        }
                    }
                }
            }

            // 4 BOJE

            if ((first_win == 0 && High_pair == 0) || (first_win == 1 && High_pair == 1)) {

                if (((b1 == b2) && (b2 == b3) && (b3 == b4)) ||
                        ((b1 == b2) && (b2 == b3) && (b4 == 0)) ||
                        ((b1 == b2) && (b3 == 0) && (b2 == b4)) ||
                        ((b1 == b3) && (b2 == 0) && (b3 == b4)) ||
                        ((b1 == 0) && (b2 == b3) && (b3 == b4))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 0;
                    four_colors++;
                }

                if (((b1 == b2) && (b2 == b3) && (b3 == b5)) ||
                        ((b1 == b2) && (b2 == b3) && (b5 == 0)) ||
                        ((b1 == b2) && (b3 == 0) && (b2 == b5)) ||
                        ((b1 == b3) && (b2 == 0) && (b3 == b5)) ||
                        ((b1 == 0) && (b2 == b3) && (b3 == b5))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 0;
                    hold5 = 1;
                    four_colors++;
                }

                if (((b1 == b2) && (b2 == b4) && (b4 == b5)) ||
                        ((b1 == b2) && (b2 == b4) && (b5 == 0)) ||
                        ((b1 == b2) && (b4 == 0) && (b2 == b5)) ||
                        ((b1 == b4) && (b2 == 0) && (b4 == b5)) ||
                        ((b1 == 0) && (b2 == b4) && (b4 == b5))) {
                    hold1 = 1;
                    hold2 = 1;
                    hold3 = 0;
                    hold4 = 1;
                    hold5 = 1;
                    four_colors++;
                }

                if (((b1 == b3) && (b3 == b4) && (b4 == b5)) ||
                        ((b1 == b3) && (b3 == b4) && (b5 == 0)) ||
                        ((b1 == b3) && (b4 == 0) && (b3 == b5)) ||
                        ((b1 == b4) && (b3 == 0) && (b4 == b5)) ||
                        ((b1 == 0) && (b3 == b4) && (b4 == b5))) {
                    hold1 = 1;
                    hold2 = 0;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    four_colors++;
                }

                if (((b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                        ((b2 == b3) && (b3 == b4) && (b5 == 0)) ||
                        ((b2 == b3) && (b4 == 0) && (b3 == b5)) ||
                        ((b2 == b4) && (b3 == 0) && (b4 == b5)) ||
                        ((b2 == 0) && (b3 == b4) && (b4 == b5))) {
                    hold1 = 0;
                    hold2 = 1;
                    hold3 = 1;
                    hold4 = 1;
                    hold5 = 1;
                    four_colors++;
                }

                //JOKER

                if (half_street == 0 && four_colors == 0 && n1 == 0) {
                    hold1 = 1;
                }
                if (half_street == 0 && four_colors == 0 && n2 == 0) {
                    hold2 = 1;
                }
                if (half_street == 0 && four_colors == 0 && n3 == 0) {
                    hold3 = 1;
                }
                if (half_street == 0 && four_colors == 0 && n4 == 0) {
                    hold4 = 1;
                }
                if (half_street == 0 && four_colors == 0 && n5 == 0) {
                    hold5 = 1;
                }

            }

            if (Five_of_a_kind == 1) {
                hand_1.setVisibility(View.VISIBLE);
            }
            if (Royal_flush == 1) {
                hand_2.setVisibility(View.VISIBLE);
            }
            if (Street_flush == 1) {
                hand_3.setVisibility(View.VISIBLE);
            }
            if (Poker == 1) {
                hand_4.setVisibility(View.VISIBLE);
            }
            if (Full_house == 1) {
                hand_5.setVisibility(View.VISIBLE);
            }
            if (Flush == 1) {
                hand_6.setVisibility(View.VISIBLE);
            }
            if (Street == 1) {
                hand_7.setVisibility(View.VISIBLE);
            }
            if (Three_of_a_kind == 1) {
                hand_8.setVisibility(View.VISIBLE);
            }
            if (Two_pairs == 1) {
                hand_9.setVisibility(View.VISIBLE);
            }
            if (High_pair == 1) {
                hand_10.setVisibility(View.VISIBLE);
            }
            if(ah == 0) {
                hold1 = 0;
                hold2 = 0;
                hold3 = 0;
                hold4 = 0;
                hold5 = 0;
            }
            stop = 1;
        }, 1000);
    }
    void Color_Check_1() {

        first_win++;
        hold1 = 1;
        hold2 = 1;
        hold3 = 1;
        hold4 = 1;
        hold5 = 1;

        if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                (b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) {

            Royal_flush = 1;
        }
        else {
            Street = 1;
        }
    }
    void Color_Check_2() {

        first_win++;
        hold1 = 1;
        hold2 = 1;
        hold3 = 1;
        hold4 = 1;
        hold5 = 1;

        if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                (b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) {

            Street_flush = 1;
        }
        else {
            Street = 1;
        }
    }
    void twins() {

        if(n5 == n4 || n5 == n3 || n5 == n2 || n5 == n1) {
            hold5=0;
        }
        if(n4 == n3 || n4 == n2 || n4 == n1) {
            hold4=0;
        }
        if(n3 == n2 || n3 == n1) {
            hold3=0;
        }
        if(n2 == n1) {
            hold2=0;
        }
        half_street = 1;
    }
}
