package com.gamecodeschool.widgetexploration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity {

    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    String time;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exploration_layout);
        textView = (TextView)findViewById(R.id.textView);
         calendar = Calendar.getInstance();
         simpleDateFormat = new SimpleDateFormat("h:mm a");
         time = simpleDateFormat.format(calendar.getTime());
         textView.setText(""+time);



    }
}
