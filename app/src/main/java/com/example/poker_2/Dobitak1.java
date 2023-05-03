package com.example.poker_2;

import static com.example.poker_2.First.stop1;
import static com.example.poker_2.First.stop2;
import static com.example.poker_2.First.stop3;
import static com.example.poker_2.First.stop4;
import static com.example.poker_2.First.stop5;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Dobitak1 extends Activity {
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
    int prvidobitak;
    int dveiste;
    int cetiriboje;
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
    int HALFSTREET;
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
    public static int hold1;
    public static int hold2;
    public static int hold3;
    public static int hold4;
    public static int hold5;
    Dobitak1(Runnable rucno) {

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

                prvidobitak = 0;
                dveiste = 0;
                cetiriboje = 0;

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

                hold1 = 0;
                hold2 = 0;
                hold3 = 0;
                hold4 = 0;
                hold5 = 0;

                // FIVE OF A KIND

                if (prvidobitak == 0) {
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
                        prvidobitak++;
                        Fiveofakind = 1;
                    }
                }

                // ROYAL FLUSH OR STREET

                HALFSTREET = 0;
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

                if (prvidobitak == 0) {

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
                    if (ROYAL == 4) {

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

                        DveIste();
                    }
                }

                // STREET FLUSH OR STREET
                // 9-13

                if (prvidobitak == 0) {

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
                    if (STRFL9 == 4 && ROYAL < 4) {

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

                        DveIste();
                    }
                }

                // STREET FLUSH OR STREET
                // 8-12

                if (prvidobitak == 0) {

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
                    if (STRFL8 == 4 && STRFL9 < 4 && ROYAL < 4) {

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

                        DveIste();
                    }
                }

                // STREET FLUSH OR STREET
                // 7-11

                if (prvidobitak == 0) {

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
                    if (STRFL7 == 4 && STRFL8 < 4 && STRFL9 < 4 && ROYAL < 4) {

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

                        DveIste();
                    }
                }

                // STREET FLUSH OR STREET
                // 6-10

                if (prvidobitak == 0) {

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
                    if (STRFL6 == 4 && STRFL7 < 4 && STRFL8 < 4 && STRFL9 < 4) {

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

                        DveIste();
                    }
                }

                // STREET FLUSH OR STREET
                // 5-9

                if (prvidobitak == 0) {

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
                    if (STRFL5 == 4 && STRFL6 < 4 && STRFL7 < 4 && STRFL8 < 4) {

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

                        DveIste();
                    }
                }

                // STREET FLUSH OR STREET
                // 4-8

                if (prvidobitak == 0) {

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
                    if (STRFL4 == 4 && STRFL5 < 4 && STRFL6 < 4 && STRFL7 < 4) {

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

                        DveIste();
                    }
                }

                // STREET FLUSH OR STREET
                // 3-7

                if (prvidobitak == 0) {

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
                    if (STRFL3 == 4 && STRFL4 < 4 && STRFL5 < 4 && STRFL6 < 4) {

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

                        DveIste();
                    }
                }

                // STREET FLUSH OR STREET
                // 2-6

                if (prvidobitak == 0) {

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
                    if (STRFL2 == 4 && STRFL3 < 4 && STRFL4 < 4 && STRFL5 < 4) {

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

                        DveIste();
                    }
                }

                // STREET FLUSH OR STREET
                // 1-5

                if (prvidobitak == 0) {

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
                    if (STRFL1 == 4 && STRFL2 < 4 && STRFL3 < 4 && STRFL4 < 4) {

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

                        DveIste();
                    }
                }

                // POKER

                if (prvidobitak == 0) {

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
                        prvidobitak++;
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
                        prvidobitak++;
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
                        prvidobitak++;
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
                        prvidobitak++;
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
                        prvidobitak++;
                        Poker = 1;
                    }
                }

                //FULL HOUSE

                if (prvidobitak == 0) {

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
                        prvidobitak++;
                        Fullhouse = 1;
                    }
                }

                //FLUSH

                if (prvidobitak == 0) {

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
                        prvidobitak++;
                        Flush = 1;
                    }
                }

                //THREE OF A KIND

                if (prvidobitak == 0) {

                    if (((n1 == n2) && (n2 == n3)) || ((n1 == n2) && (n3 == 0)) || ((n1 == n3) && (n2 == 0)) || ((n2 == n3) && (n1 == 0))) {
                        hold1 = 1;
                        hold2 = 1;
                        hold3 = 1;
                        hold4 = 0;
                        hold5 = 0;
                        prvidobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n2) && (n2 == n4)) || ((n1 == n2) && (n4 == 0)) || ((n1 == n4) && (n2 == 0)) || ((n2 == n4) && (n1 == 0))) {
                        hold1 = 1;
                        hold2 = 1;
                        hold3 = 0;
                        hold4 = 1;
                        hold5 = 0;
                        prvidobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n2) && (n2 == n5)) || ((n1 == n2) && (n5 == 0)) || ((n1 == n5) && (n2 == 0)) || ((n2 == n5) && (n1 == 0))) {
                        hold1 = 1;
                        hold2 = 1;
                        hold3 = 0;
                        hold4 = 0;
                        hold5 = 1;
                        prvidobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n3) && (n3 == n4)) || ((n1 == n3) && (n4 == 0)) || ((n1 == n4) && (n3 == 0)) || ((n3 == n4) && (n1 == 0))) {
                        hold1 = 1;
                        hold2 = 0;
                        hold3 = 1;
                        hold4 = 1;
                        hold5 = 0;
                        prvidobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n3) && (n3 == n5)) || ((n1 == n3) && (n5 == 0)) || ((n1 == n5) && (n3 == 0)) || ((n3 == n5) && (n1 == 0))) {
                        hold1 = 1;
                        hold2 = 0;
                        hold3 = 1;
                        hold4 = 0;
                        hold5 = 1;
                        prvidobitak++;
                        Threeofakind = 1;
                    }

                    if (((n1 == n4) && (n4 == n5)) || ((n1 == n4) && (n5 == 0)) || ((n1 == n5) && (n4 == 0)) || ((n4 == n5) && (n1 == 0))) {
                        hold1 = 1;
                        hold2 = 0;
                        hold3 = 0;
                        hold4 = 1;
                        hold5 = 1;
                        prvidobitak++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n3) && (n3 == n4)) || ((n2 == n3) && (n4 == 0)) || ((n2 == n4) && (n3 == 0)) || ((n3 == n4) && (n2 == 0))) {
                        hold1 = 0;
                        hold2 = 1;
                        hold3 = 1;
                        hold4 = 1;
                        hold5 = 0;
                        prvidobitak++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n3) && (n3 == n5)) || ((n2 == n3) && (n5 == 0)) || ((n2 == n5) && (n3 == 0)) || ((n3 == n5) && (n2 == 0))) {
                        hold1 = 0;
                        hold2 = 1;
                        hold3 = 1;
                        hold4 = 0;
                        hold5 = 1;
                        prvidobitak++;
                        Threeofakind = 1;
                    }

                    if (((n2 == n4) && (n4 == n5)) || ((n2 == n4) && (n5 == 0)) || ((n2 == n5) && (n4 == 0)) || ((n4 == n5) && (n2 == 0))) {
                        hold1 = 0;
                        hold2 = 1;
                        hold3 = 0;
                        hold4 = 1;
                        hold5 = 1;
                        prvidobitak++;
                        Threeofakind = 1;
                    }

                    if (((n3 == n4) && (n4 == n5)) || ((n3 == n4) && (n5 == 0)) || ((n3 == n5) && (n4 == 0)) || ((n4 == n5) && (n3 == 0))) {
                        hold1 = 0;
                        hold2 = 0;
                        hold3 = 1;
                        hold4 = 1;
                        hold5 = 1;
                        prvidobitak++;
                        Threeofakind = 1;
                    }
                }

                //2 PAIRS

                if (prvidobitak == 0) {

                    if (((n1 == n2) && (n3 == n4)) || ((n1 == n3) && (n2 == n4)) || ((n1 == n4) && (n2 == n3))) {
                        hold1 = 1;
                        hold2 = 1;
                        hold3 = 1;
                        hold4 = 1;
                        hold5 = 0;
                        prvidobitak++;
                        Twopairs = 1;
                    }

                    if (((n1 == n2) && (n3 == n5)) || ((n1 == n3) && (n2 == n5)) || ((n1 == n5) && (n2 == n3))) {
                        hold1 = 1;
                        hold2 = 1;
                        hold3 = 1;
                        hold4 = 0;
                        hold5 = 1;
                        prvidobitak++;
                        Twopairs = 1;
                    }

                    if (((n1 == n2) && (n4 == n5)) || ((n1 == n5) && (n2 == n4)) || ((n1 == n4) && (n2 == n5))) {
                        hold1 = 1;
                        hold2 = 1;
                        hold3 = 0;
                        hold4 = 1;
                        hold5 = 1;
                        prvidobitak++;
                        Twopairs = 1;
                    }

                    if (((n1 == n3) && (n4 == n5)) || ((n1 == n5) && (n3 == n4)) || ((n1 == n4) && (n3 == n5))) {
                        hold1 = 1;
                        hold2 = 0;
                        hold3 = 1;
                        hold4 = 1;
                        hold5 = 1;
                        prvidobitak++;
                        Twopairs = 1;
                    }

                    if (((n2 == n3) && (n4 == n5)) || ((n3 == n5) && (n2 == n4)) || ((n3 == n4) && (n2 == n5))) {
                        hold1 = 0;
                        hold2 = 1;
                        hold3 = 1;
                        hold4 = 1;
                        hold5 = 1;
                        prvidobitak++;
                        Twopairs = 1;
                    }
                }

                //HIGH PAIR

                if (prvidobitak == 0) {

                    if (n1 == n2) {
                        if (HALFSTREET == 0) {
                            hold1 = 1;
                            hold2 = 1;
                            hold3 = 0;
                            hold4 = 0;
                            hold5 = 0;
                        }
                        if (n1 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n1 < 11) {
                            dveiste = 1;
                        }
                    }
                    if (n1 == n3) {
                        if (HALFSTREET == 0) {
                            hold1 = 1;
                            hold2 = 0;
                            hold3 = 1;
                            hold4 = 0;
                            hold5 = 0;
                        }
                        if (n1 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n1 < 11) {
                            dveiste = 1;
                        }
                    }
                    if (n1 == n4) {
                        if (HALFSTREET == 0) {
                            hold1 = 1;
                            hold2 = 0;
                            hold3 = 0;
                            hold4 = 1;
                            hold5 = 0;
                        }
                        if (n1 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n1 < 11) {
                            dveiste = 1;
                        }
                    }
                    if (n1 == n5) {
                        if (HALFSTREET == 0) {
                            hold1 = 1;
                            hold2 = 0;
                            hold3 = 0;
                            hold4 = 0;
                            hold5 = 1;
                        }
                        if (n1 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n1 < 11) {
                            dveiste = 1;
                        }
                    }
                    if (n2 == n3) {
                        if (HALFSTREET == 0) {
                            hold1 = 0;
                            hold2 = 1;
                            hold3 = 1;
                            hold4 = 0;
                            hold5 = 0;
                        }
                        if (n2 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n2 < 11) {
                            dveiste = 1;
                        }
                    }
                    if (n2 == n4) {
                        if (HALFSTREET == 0) {
                            hold1 = 0;
                            hold2 = 1;
                            hold3 = 0;
                            hold4 = 1;
                            hold5 = 0;
                        }
                        if (n2 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n2 < 11) {
                            dveiste = 1;
                        }
                    }
                    if (n2 == n5) {
                        if (HALFSTREET == 0) {
                            hold1 = 0;
                            hold2 = 1;
                            hold3 = 0;
                            hold4 = 0;
                            hold5 = 1;
                        }
                        if (n2 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n2 < 11) {
                            dveiste = 1;
                        }
                    }
                    if (n3 == n4) {
                        if (HALFSTREET == 0) {
                            hold1 = 0;
                            hold2 = 0;
                            hold3 = 1;
                            hold4 = 1;
                            hold5 = 0;
                        }
                        if (n3 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n3 < 11) {
                            dveiste = 1;
                        }
                    }
                    if (n3 == n5) {
                        if (HALFSTREET == 0) {
                            hold1 = 0;
                            hold2 = 0;
                            hold3 = 1;
                            hold4 = 0;
                            hold5 = 1;
                        }
                        if (n3 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n3 < 11) {
                            dveiste = 1;
                        }
                    }
                    if (n4 == n5) {
                        if (HALFSTREET == 0) {
                            hold1 = 0;
                            hold2 = 0;
                            hold3 = 0;
                            hold4 = 1;
                            hold5 = 1;
                        }
                        if (n4 > 10) {
                            prvidobitak++;
                            Highpair = 1;
                        }
                        if (n4 < 11) {
                            dveiste = 1;
                        }
                    }

                }

                //HIGH PAIR WITH JOKER

                if (prvidobitak == 0) {

                    if (HALFSTREET == 1) {

                        if (n1 == 0) {
                            if (n2 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                                prvidobitak++;
                                Highpair = 1;
                            }
                        }
                        if (n2 == 0) {
                            if (n1 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                                prvidobitak++;
                                Highpair = 1;
                            }
                        }
                        if (n3 == 0) {
                            if (n1 > 10 || n2 > 10 || n4 > 10 || n5 > 10) {
                                prvidobitak++;
                                Highpair = 1;
                            }
                        }
                        if (n4 == 0) {
                            if (n1 > 10 || n2 > 10 || n3 > 10 || n5 > 10) {
                                prvidobitak++;
                                Highpair = 1;
                            }
                        }
                        if (n5 == 0) {
                            if (n1 > 10 || n2 > 10 || n3 > 10 || n4 > 10) {
                                prvidobitak++;
                                Highpair = 1;
                            }
                        }
                    } else {

                        if (n1 == 0) {
                            hold1 = 1;
                            if (n2 > 10) {
                                prvidobitak++;
                                Highpair = 1;
                                hold2 = 1;
                            }
                            if (prvidobitak == 0) {

                                if (n3 > 10) {
                                    prvidobitak++;
                                    Highpair = 1;
                                    hold3 = 1;
                                }
                            }
                            if (prvidobitak == 0) {

                                if (n4 > 10) {
                                    prvidobitak++;
                                    Highpair = 1;
                                    hold4 = 1;
                                }
                            }
                            if (prvidobitak == 0) {

                                if (n5 > 10) {
                                    prvidobitak++;
                                    Highpair = 1;
                                    hold5 = 1;
                                }
                            }
                        }
                        if (prvidobitak == 0) {

                            if (n2 == 0) {
                                hold2 = 1;
                                if (n1 > 10) {
                                    prvidobitak++;
                                    Highpair = 1;
                                    hold1 = 1;
                                }
                                if (prvidobitak == 0) {

                                    if (n3 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold3 = 1;
                                    }
                                }
                                if (prvidobitak == 0) {

                                    if (n4 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold4 = 1;
                                    }
                                }
                                if (prvidobitak == 0) {

                                    if (n5 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold5 = 1;
                                    }
                                }
                            }
                        }
                        if (prvidobitak == 0) {

                            if (n3 == 0) {
                                hold3 = 1;
                                if (n1 > 10) {
                                    prvidobitak++;
                                    Highpair = 1;
                                    hold1 = 1;
                                }
                                if (prvidobitak == 0) {

                                    if (n2 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold2 = 1;
                                    }
                                }
                                if (prvidobitak == 0) {

                                    if (n4 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold4 = 1;
                                    }
                                }
                                if (prvidobitak == 0) {

                                    if (n5 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold5 = 1;
                                    }
                                }
                            }
                        }
                        if (prvidobitak == 0) {

                            if (n4 == 0) {
                                hold4 = 1;
                                if (n1 > 10) {
                                    prvidobitak++;
                                    Highpair = 1;
                                    hold1 = 1;
                                }
                                if (prvidobitak == 0) {

                                    if (n2 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold2 = 1;
                                    }
                                }
                                if (prvidobitak == 0) {

                                    if (n3 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold3 = 1;
                                    }
                                }
                                if (prvidobitak == 0) {

                                    if (n5 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold5 = 1;
                                    }
                                }
                            }
                        }
                        if (prvidobitak == 0) {

                            if (n5 == 0) {
                                hold5 = 1;
                                if (n1 > 10) {
                                    prvidobitak++;
                                    Highpair = 1;
                                    hold1 = 1;
                                }
                                if (prvidobitak == 0) {

                                    if (n2 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold2 = 1;
                                    }
                                }
                                if (prvidobitak == 0) {

                                    if (n3 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold3 = 1;
                                    }
                                }
                                if (prvidobitak == 0) {

                                    if (n4 > 10) {
                                        prvidobitak++;
                                        Highpair = 1;
                                        hold4 = 1;
                                    }
                                }
                            }
                        }
                    }
                }

                // 4 BOJE

                if ((prvidobitak == 0 && Highpair == 0) || (prvidobitak == 1 && Highpair == 1)) {

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
                        cetiriboje++;
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
                        cetiriboje++;
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
                        cetiriboje++;
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
                        cetiriboje++;
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
                        cetiriboje++;
                    }

                    //JOKER

                    if (HALFSTREET == 0 && cetiriboje == 0 && n1 == 0) {
                        hold1 = 1;
                    }
                    if (HALFSTREET == 0 && cetiriboje == 0 && n2 == 0) {
                        hold2 = 1;
                    }
                    if (HALFSTREET == 0 && cetiriboje == 0 && n3 == 0) {
                        hold3 = 1;
                    }
                    if (HALFSTREET == 0 && cetiriboje == 0 && n4 == 0) {
                        hold4 = 1;
                    }
                    if (HALFSTREET == 0 && cetiriboje == 0 && n5 == 0) {
                        hold5 = 1;
                    }

                }

                if(Fiveofakind == 1) {
                    First.rucno1.setVisibility(View.VISIBLE);
                }
                if(Royalflush == 1) {
                    First.rucno2.setVisibility(View.VISIBLE);
                }
                if(Streetflush == 1) {
                    First.rucno3.setVisibility(View.VISIBLE);
                }
                if(Poker == 1) {
                    First.rucno4.setVisibility(View.VISIBLE);
                }
                if(Fullhouse == 1) {
                    First.rucno5.setVisibility(View.VISIBLE);
                }
                if(Flush == 1) {
                    First.rucno6.setVisibility(View.VISIBLE);
                }
                if(Street == 1) {
                    First.rucno7.setVisibility(View.VISIBLE);
                }
                if(Threeofakind == 1) {
                    First.rucno8.setVisibility(View.VISIBLE);
                }
                if(Twopairs == 1) {
                    First.rucno9.setVisibility(View.VISIBLE);
                }
                if(Highpair == 1) {
                    First.rucno10.setVisibility(View.VISIBLE);
                }
                First.stop = 1;
                First.izbor = 1;
            }
            }, 1000);

    }
    void ProveraBoje1() {

        prvidobitak++;
        hold1=1;hold2=1;hold3=1;hold4=1;hold5=1;

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

        prvidobitak++;
        hold1=1;hold2=1;hold3=1;hold4=1;hold5=1;

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
    void DveIste() {

        if(n5==n4||n5==n3||n5==n2||n5==n1) {hold5=0;}
        if(n4==n3||n4==n2||n4==n1) {hold4=0;}
        if(n3==n2||n3==n1) {hold3=0;}
        if(n2==n1) {hold2=0;}

        HALFSTREET = 1;
    }


}
