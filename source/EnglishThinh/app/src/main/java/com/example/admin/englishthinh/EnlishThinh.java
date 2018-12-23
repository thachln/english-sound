package com.example.admin.englishthinh;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class EnlishThinh extends AppCompatActivity {
    private ImageButton goChaoHoi;
    private ImageButton goTime;
    private ImageButton goTroChuyen;
    private ImageButton goAboutUs;
    private ImageButton goCongSo;
    private ImageButton goFood;
    private ImageButton goKetBan;
    private ImageButton goMuaSam;
    private ImageButton goNguPhap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlish_thinh);


        goNguPhap = (ImageButton) findViewById(R.id.goNguPhap);
        goNguPhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnlishThinh.this, pageNguPhap.class);
                startActivity(intent);
            }
        });

        goChaoHoi = (ImageButton) findViewById(R.id.goChaoHoi);
        goChaoHoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnlishThinh.this, pageChaoHoi.class);
                startActivity(intent);
            }
        });

        goTime = (ImageButton) findViewById(R.id.goTime);
        goTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnlishThinh.this, pageTime.class);
                startActivity(intent);
            }
        });

        goTroChuyen = (ImageButton) findViewById(R.id.goTroChuyen);
        goTroChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnlishThinh.this, pageTroChuyen.class);
                startActivity(intent);
            }
        });

        goAboutUs = (ImageButton) findViewById(R.id.goAboutUs);
        goAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnlishThinh.this, pageAboutUs.class);
                startActivity(intent);
            }
        });

        goCongSo = (ImageButton) findViewById(R.id.goCongSo);
        goCongSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnlishThinh.this, pageCongSo.class);
                startActivity(intent);
            }
        });

        goFood = (ImageButton) findViewById(R.id.goFood);
        goFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnlishThinh.this, pageFood.class);
                startActivity(intent);
            }
        });

        goKetBan = (ImageButton) findViewById(R.id.goKetBan);
        goKetBan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnlishThinh.this, pageKetBan.class);
                startActivity(intent);
            }
        });


        goMuaSam = (ImageButton) findViewById(R.id.goShop);
        goMuaSam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnlishThinh.this, pageMuaSam.class);
                startActivity(intent);
            }
        });
    }



}
