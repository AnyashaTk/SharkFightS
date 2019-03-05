package com.mycompany.sharkfights;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fight_Activity extends AppCompatActivity {

    public static MediaPlayer fightthem= new MediaPlayer();
    public static boolean isPlayingfight=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fight_activity);

        fightthem = MediaPlayer.create (Fight_Activity.this,R.raw.fighttheme);
        if(!isPlayingfight) {
            fightthem.start();
            isPlayingfight=true;
        }


    }


}
