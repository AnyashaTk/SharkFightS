package com.mycompany.sharkfights;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Map_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);


        Button playlvl0 = findViewById(R.id.playlvl_0);
        playlvl0.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( Map_Activity.this, Fight_Activity.class));
        }});

        Button playlvl1 = findViewById(R.id.playlvl_1);
        playlvl1.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( Map_Activity.this, Fight_Activity.class));
        }});

        Button playlvl2 = findViewById(R.id.playlvl_2);
        playlvl2.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( Map_Activity.this, Fight_Activity.class));
        }});

        Button playlvl3 = findViewById(R.id.playlvl_3);
        playlvl3.setOnClickListener( new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            startActivity(new Intent( Map_Activity.this, Fight_Activity.class));
        }});
    }
}
