package com.mycompany.sharkfights;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    public static MediaPlayer mainthem= new MediaPlayer();
    public static boolean isPlaying=false;
    public static int lenght;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //музыка
        mainthem = MediaPlayer.create (MainActivity.this,R.raw.maintheme);
        if(!isPlaying) {
            mainthem.start();
            isPlaying=true;
        }

        //переход на карту
        Button tomap = findViewById(R.id.tomap);
        tomap.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( MainActivity.this, Map_Activity.class));
            if(isPlaying == true) {
                mainthem.stop();}}});


        //переход в игру для ловкости
        Button toagility = findViewById(R.id.toagility);
        toagility.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( MainActivity.this, Game_Agility.class));
            if(isPlaying == true) {
                mainthem.stop(); }}});


        //переход в игру для силы
        Button toforce = findViewById(R.id.toforce);
        toforce.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( MainActivity.this, Game_Force.class));
            if(isPlaying == true) {
                mainthem.stop();}}});


        //переход в игру для здоровья
        Button tohp = findViewById(R.id.tohp);
        tohp.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( MainActivity.this, Game_HP.class));
            if(isPlaying == true) {
                mainthem.stop();}}});


        //переход в игру для скорости
        Button tospeed = findViewById(R.id.tospeed);
        tospeed.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( MainActivity.this, Game_Speed.class));
            if(isPlaying == true) {
                mainthem.stop();}}});


        //переход в настройки
        Button settings = findViewById(R.id.settings);
        settings.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( MainActivity.this, Settings.class));
            }});



        Button skills = findViewById(R.id.skills);
        skills.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startService(new Intent( MainActivity.this, Service_Skills.class));
        }});









//        Button shark = findViewById(R.id.shark);
//        shark.setOnClickListener( new View.OnClickListener()
//        {@Override
//        public void onClick(View v) {
//            startActivity(new Intent( MainActivity.this, Game_Speed.class));
//            if (MediaMain==1) {myMediaPlayer1.pause();}
//            ;}});

 }
}