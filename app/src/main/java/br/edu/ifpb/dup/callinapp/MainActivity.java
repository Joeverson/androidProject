package br.edu.ifpb.dup.callinapp;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int ID_NOTIFICATION = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void setNotification(){
        NotificationCompat.Builder nt = new NotificationCompat.Builder(this);
        nt.setTicker("IFPB");
        nt.setContentText("Bem vindo ao ifpb garoto, tudo fine né fio");
        nt.setContentTitle("Novas Noticicas!!!!");
        nt.setSmallIcon(R.drawable.ic_lauch_ifpb);
        nt.setLocalOnly(false);
        NotificationManagerCompat nmc = NotificationManagerCompat.from(this);
        nmc.notify(ID_NOTIFICATION, nt.build());

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN: setNotification();
        }
        return super.onTouchEvent(event);
    }
}
