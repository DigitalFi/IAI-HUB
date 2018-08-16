package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_add_project extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_project);
    }

    public void Activity_add_project(View view) {

        Intent intent = new Intent(Activity_add_project.this, Activity_project.class);
        startActivity(intent);

    }
}
