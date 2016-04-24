package com.assignment.acadgild.android_session5_assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    //int mCourseList;
    ArrayList<String> mMentorList, mCourseList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        mCourseList = new ArrayList<String>();

        mCourseList.add("Android");
        mCourseList.add("Spark");
        mCourseList.add("Frontend Web Developer");
        mCourseList.add("Full Stack Web Developement");
        mCourseList.add("Node JS");
        mCourseList.add("Java For Fresher");
        mCourseList.add("Java");

        mMentorList = new ArrayList<String>();

        mMentorList.add("Ranjith Naidu");
        mMentorList.add("Aqeel shah");
        mMentorList.add("Akhilesh");
        mMentorList.add("Pawan");
        mMentorList.add("Harish");
        mMentorList.add("Paresh");
        mMentorList.add("Pushpa");


        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.listview_layout, R.id.textView, mCourseList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String courseName = (String) listView.getItemAtPosition(position);
        String mentorName = mMentorList.get(position);

        Intent intent = new Intent(getApplicationContext(), ActivityB.class);
        intent.putExtra("CourseName", courseName);
        intent.putExtra("MentorsName", mentorName);
        Log.e("Course : ", courseName);
        Log.e("Mentor : ", mentorName);
        startActivity(intent);
    }
}



