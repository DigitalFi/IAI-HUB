package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_add_supplier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_supplier);
    }

    public void addBarang(View view) {
        Intent intent = new Intent(Activity_add_supplier.this, Activity_page_supplier.class);
        startActivity(intent);
    }
}
