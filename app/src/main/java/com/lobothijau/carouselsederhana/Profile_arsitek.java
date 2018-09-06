package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Profile_arsitek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_arsitek);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showBottomSheetDialogFragment() {
        bottom_qrcode bottomSheetFragment = new bottom_qrcode();
        bottomSheetFragment.show(getSupportFragmentManager(), bottomSheetFragment.getTag());
    }

    public void qrcode(View view) {
        showBottomSheetDialogFragment();
    }

    public void edit(View view) {
        Intent intent = new Intent(Profile_arsitek.this, Form_edit_arsitek.class);
        startActivity(intent);
    }
}
