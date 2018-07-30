package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_list_arsitek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_arsitek);
    }



    public void Activity_profil_arsitek(View view) {
        Intent intent = new Intent(Activity_list_arsitek.this, Activity_profil_arsitek.class);
        startActivity(intent);
    }
}

