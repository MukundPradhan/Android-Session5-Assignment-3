package com.assignment.acadgild.android_session5_assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
    TextView txtCourseName, txtMentorsName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        txtCourseName = (TextView) findViewById(R.id.tvCourseName);
        txtMentorsName = (TextView) findViewById(R.id.tvMentorsName);

        Intent intentObject = getIntent();
        String courseName = intentObject.getStringExtra("CourseName");
        String mentorsname = intentObject.getStringExtra("MentorsName");

        txtCourseName.setText(courseName);
        txtMentorsName.setText(mentorsname);

    }
}
