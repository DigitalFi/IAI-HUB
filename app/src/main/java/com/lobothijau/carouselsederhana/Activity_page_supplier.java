package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_page_supplier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_supplier);
    }

    public void Activity_add_supplier(View view) {
        Intent intent = new Intent(Activity_page_supplier.this, Activity_add_supplier.class);
        startActivity(intent);
    }

    public void Activity_list_arsitek(View view) {
        Intent intent = new Intent(Activity_page_supplier.this, Activity_list_arsitek.class);
        startActivity(intent);
    }

    public void Activity_supplier(View view) {

    }
}
