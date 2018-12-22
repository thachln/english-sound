package com.example.admin.englishthinh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Admin on 11/30/2018.
 */

public class pageAboutUs extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_aboutus);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
