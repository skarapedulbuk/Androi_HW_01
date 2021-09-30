package com.skarapedulbuk.HW1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.next_button);
        ToggleButton calendarRotate = findViewById(R.id.rotate_calendar);
        CalendarView calendar1 = findViewById(R.id.calendar1);

        button.setOnClickListener(v -> setContentView(R.layout.activity_optional));

        calendarRotate.setOnClickListener(v -> {
            if (calendar1.getRotation() < 360) {
                calendar1.setRotation(calendar1.getRotation() + 45);
            } else {
                calendar1.setRotation(0);
            }
        });
    }
}