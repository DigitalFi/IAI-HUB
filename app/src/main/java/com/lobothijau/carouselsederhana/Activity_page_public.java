package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_page_public extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_public);
    }
    public void Activity_list_arsitek(View view) {
        Intent intent = new Intent(Activity_page_public.this, Activity_list_arsitek.class);
        startActivity(intent);
    }
    public void Activity_asosiasi_informasi(View view) {
        Intent intent = new Intent(Activity_page_public.this, Activity_asosiasi_informasi.class);
        startActivity(intent);
    }

    public void Activity_add_project(View view) {
        Intent intent = new Intent(Activity_page_public.this, Activity_add_project.class);
        startActivity(intent);
    }
    public void Activity_supplier(View view) {
        Intent intent = new Intent(Activity_page_public.this, Activity_supplier.class);
        startActivity(intent);
    }
}
