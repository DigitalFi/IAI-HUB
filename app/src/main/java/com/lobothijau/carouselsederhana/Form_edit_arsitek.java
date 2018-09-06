package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Form_edit_arsitek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_edit_arsitek);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void save(View view) {
        Intent intent = new Intent(Form_edit_arsitek.this, Profile_arsitek.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Data Succes Saved!", Toast.LENGTH_SHORT).show();
    }
}
