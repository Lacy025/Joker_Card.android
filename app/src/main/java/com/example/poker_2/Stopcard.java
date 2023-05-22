package com.example.poker_2;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Stopcard extends AppCompatActivity {
    MediaPlayer audiostop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (audiostop != null) {
            if (audiostop.isPlaying()) {
                audiostop.stop();
            }
            audiostop.reset();
            audiostop.release();
            audiostop = null;
        }
        audiostop = MediaPlayer.create(this, R.raw.stop);
        audiostop.start();

    }
}
