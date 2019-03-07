package com.mycompany.sharkfights;

import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.os.IBinder;
import android.view.WindowManager;
import android.widget.LinearLayout;

import android.view.Gravity;
import android.graphics.PixelFormat;


public class Service_Skills extends Service {

    private WindowManager wmskills;
    private LinearLayout llskills;


    @Override
    public void onCreate(){
        super.onCreate();

        wmskills = (WindowManager) getSystemService(WINDOW_SERVICE);
        llskills= new LinearLayout(this);

        LinearLayout.LayoutParams llskillsParameters = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        llskills.setBackgroundColor(Color.argb(66,255,0,0));
        llskills.setLayoutParams(llskillsParameters);

        WindowManager.LayoutParams parameters = new WindowManager.LayoutParams(400,150, WindowManager.LayoutParams.TYPE_PHONE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, PixelFormat.TRANSLUCENT);

        parameters.x=0;
        parameters.y=0;
        parameters.gravity=Gravity.CENTER | Gravity.CENTER;


        wmskills.addView(llskills, parameters);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
