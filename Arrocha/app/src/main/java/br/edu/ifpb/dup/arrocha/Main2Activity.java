package br.edu.ifpb.dup.arrocha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Chronometer;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Chronometer ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        this.ch = (Chronometer) findViewById(R.id.chronometer);
        this.ch.start();

        this.ch.setOnChronometerTickListener(new OnChronometer());


    }

    private class OnChronometer implements Chronometer.OnChronometerTickListener{
        @Override
        public void onChronometerTick(Chronometer chronometer) {
            if(chronometer.getText().toString().equals("00:10")){
                Toast.makeText(Main2Activity.this, "Eitxa chegou a Deu 10seg", Toast.LENGTH_SHORT).show();
                Log.i("time", chronometer.getText().toString());
                chronometer.stop();
            }

        }
    }

}
