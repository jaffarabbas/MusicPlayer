package com.example.jaffmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public int music[]={R.raw.m1,R.raw.m2,R.raw.m3,R.raw.m4,R.raw.m5,R.raw.m6,R.raw.m7};
    public int newSong=0;
    Button btn;
    MediaPlayer player;
    public void play(View v){
        player.start();
    }
    public void pause(View v){
        player.pause();
    }
    public void stop(View v){
        player.stop();
    }

    public int next(View v){
        return newSong++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btn = findViewById(R.id.next);
        final int music_index = music.length;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                newSong++;
////                newSong = newSong % music_index;
//            }
//        });

        player = MediaPlayer.create(this,music[newSong]);
    }
}