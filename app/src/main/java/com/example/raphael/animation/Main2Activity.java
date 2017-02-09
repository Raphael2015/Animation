package com.example.raphael.animation;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    private ImageView ivRyu;
    private AnimationDrawable hadoukenAnimation;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Obtem uma referência para o ImageView do personagem
        ivRyu = (ImageView) findViewById(R.id.ivRyu);

    }
    public void darHadouken(View v) {
        ivRyu.setBackgroundResource(R.drawable.nomedaanimacao);
        //Cria uma instancia para nossa animação
        hadoukenAnimation = (AnimationDrawable) ivRyu.getBackground();
        //Pause a animacao caso ja esteja rodando
        hadoukenAnimation.stop();

        //Cria a instancia com o audio
       // mediaPlayer = MediaPlayer.create(this, R.raw.hadouken);
        //Inicia o audio
        //mediaPlayer.start();

        //Inicia a animação
        hadoukenAnimation.start();
    }

    public void  stop(View v){
        hadoukenAnimation.stop();
    }
}
