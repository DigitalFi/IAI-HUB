package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Activity_list_arsitek(View view) {
        Intent intent = new Intent(Activity_login.this, Activity_list_arsitek.class);
        startActivity(intent);
    }
}
