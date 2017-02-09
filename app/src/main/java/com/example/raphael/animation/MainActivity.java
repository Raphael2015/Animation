package com.example.raphael.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText login, senha;
    Button btnLogin, btnIntent;
    ImageView imagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.editText);

        senha = (EditText) findViewById(R.id.editText2);
        btnLogin = (Button) findViewById(R.id.button);
        btnIntent = (Button) findViewById(R.id.button2);
        imagem = (ImageView) findViewById(R.id.imageView);

        Animation animacao = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.translate2);

        imagem.startAnimation(animacao);

        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cria o Intent
                Intent meuIntent = new Intent(MainActivity.this, Main2Activity.class);
                    // Inicia a Activity enviando o meuIntent
                startActivity(meuIntent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(login.getText().toString().equals("admin") && senha.getText().toString().equals("123")){

                    Animation animacao = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.translate);

                    login.startAnimation(animacao);
                    //senha.startAnimation(animacao);
                }else {

                }
            }
        });
    }
}
