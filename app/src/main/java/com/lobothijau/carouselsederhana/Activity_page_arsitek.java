package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_page_arsitek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_arsitek);
    }
    public void Activity_list_acara(View view) {
        Intent intent = new Intent(Activity_page_arsitek.this, Activity_list_acara.class);
        startActivity(intent);
    }
    public void Activity_asosiasi_informasi(View view) {
        Intent intent = new Intent(Activity_page_arsitek.this, Activity_list_arsitek.class);
        startActivity(intent);
    }

    public void Activity_supplier(View view) {
        Intent intent = new Intent(Activity_page_arsitek.this, Activity_supplier.class);
        startActivity(intent);
    }
}
