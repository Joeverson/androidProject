package br.edu.ifpb.dup.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private DatePicker dt;
    private TimePicker time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.time = (TimePicker) findViewById(R.id.timePicker);
        this.dt = (DatePicker) findViewById(R.id.datePicker);


        this.time.setOnTimeChangedListener(new OnChangeTime());
        //this.dt.getCalendarView().setOnDateChangeListener(new OnChangeDate());
        this.dt.init(2015, 8 ,28, new OnChangeDate());

    }


    private class OnChangeDate implements DatePicker.OnDateChangedListener {

        @Override
        public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            Toast.makeText(Main2Activity.this, "date is"+year+"/"+monthOfYear+"/"+dayOfMonth, Toast.LENGTH_LONG).show();
            Log.w("aqui", "date is "+year+"/"+monthOfYear+"/"+dayOfMonth);
        }
    }

    private class OnChangeTime implements TimePicker.OnTimeChangedListener{
        @Override
        public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            Toast.makeText(Main2Activity.this, "time is"+hourOfDay+":"+minute, Toast.LENGTH_LONG).show();
            Log.w("aqui", "you time is " + hourOfDay + ":" + minute);
        }
    }
}
