package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_profil_arsitek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_arsitek);
    }

    public void Activity_profil_arsitek2(View view) {
        Intent intent = new Intent(Activity_profil_arsitek.this, Activity_profil_arsitek2.class);
        startActivity(intent);
    }
    }

