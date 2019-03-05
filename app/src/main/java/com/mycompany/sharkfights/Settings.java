package com.mycompany.sharkfights;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        //переход отсюда обратно на главную
        Button back = findViewById(R.id.back);
        back.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( Settings.this, MainActivity.class));
        }});


//        if (MediaMain==1)
//        Button music = findViewById(R.id.music);
//        back.setOnClickListener( new View.OnClickListener()
//        {@Override
//        public void onClick(View v) {
//            для выключения музыки вообще
//        }});


    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}

//Mediaplayer.pause();
//length=Mediaplayer.getCurrentPosition();
//ставить на паузу чтоб потом с того же места начиналось, сначала пауза потом получение мемента остановки