package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.img_MusicBackground);

        Glide.with(this).load("").into(imageView);


    }

    public void play(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.zombie);
        mediaPlayer.start();

    }
}
