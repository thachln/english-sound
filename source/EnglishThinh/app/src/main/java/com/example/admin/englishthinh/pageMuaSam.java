package com.example.admin.englishthinh;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Admin on 11/30/2018.
 */

public class pageMuaSam extends AppCompatActivity implements ExpandableListView.OnGroupExpandListener {
    ExpandableListView expandableListView;
    List<String> listdataHeader;
    HashMap<String,List<String>> listDataChild;
    expandlistviewpageTime expandlistviewTime;
    int[] abc={R.raw.soluong01,R.raw.soluong02,R.raw.soluong03,R.raw.soluong04,R.raw.soluong05,R.raw.soluong06,R.raw.soluong07,R.raw.soluong08,R.raw.soluong09,R.raw.soluong10};
    MediaPlayer player;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_time);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addControl();
        expandlistviewTime = new expandlistviewpageTime(pageMuaSam.this,listdataHeader,listDataChild);
        expandableListView.setAdapter(expandlistviewTime);
        expandableListView.setOnGroupExpandListener(this);
    }

    private void addControl() {
        expandableListView = (ExpandableListView)findViewById(R.id.expandableTime);
        listdataHeader = new ArrayList<>();
        listDataChild = new HashMap<String,List<String>>();

        listdataHeader.add("    Một vài");
        listdataHeader.add("    Một ít .");
        listdataHeader.add("    Gọi cảnh sát");
        listdataHeader.add("    Bạn có cà phê không?");
        listdataHeader.add("    Bạn có nhận thẻ tín dụng không?");
        listdataHeader.add("    Đôi bông tai này giá bao nhiêu?");
        listdataHeader.add("    Giá bao nhiêu một ngày?");
        listdataHeader.add("    Bạn trả bằng gì?");
        listdataHeader.add("    Ở Hồ Chí Minh có bao nhiêu người?");
        listdataHeader.add("    Tôi đã đặt trước");

        List<String> cau1 = new ArrayList<String>();
        cau1.add("    A few");
        List<String> cau2 = new ArrayList<String>();
        cau2.add("    A litte");
        List<String> cau3 = new ArrayList<String>();
        cau3.add("    Call the police");
        List<String> cau4 = new ArrayList<String>();
        cau4.add("    Do you have any coffee?");
        List<String> cau5 = new ArrayList<String>();
        cau5.add("    Do you take credit card?");
        List<String> cau6 = new ArrayList<String>();
        cau6.add("    How much are these earrings?");
        List<String> cau7 = new ArrayList<String>();
        cau7.add("    How much does it cost per day?");
        List<String> cau8 = new ArrayList<String>();
        cau8.add("    How are you paying?");
        List<String> cau9 = new ArrayList<String>();
        cau9.add("    How many people are there in HCM city?");
        List<String> cau10 = new ArrayList<String>();
        cau10.add("    I have a reservation.");

        listDataChild.put(listdataHeader.get(0),cau1);
        listDataChild.put(listdataHeader.get(1),cau2);
        listDataChild.put(listdataHeader.get(2),cau3);
        listDataChild.put(listdataHeader.get(3),cau4);
        listDataChild.put(listdataHeader.get(4),cau5);
        listDataChild.put(listdataHeader.get(5),cau6);
        listDataChild.put(listdataHeader.get(6),cau7);
        listDataChild.put(listdataHeader.get(7),cau8);
        listDataChild.put(listdataHeader.get(8),cau9);
        listDataChild.put(listdataHeader.get(9),cau10);


    }
    @Override
    public void onGroupExpand(int i) {
        if (player!=null && player.isPlaying())
            player.stop();
        player = MediaPlayer.create(this,abc[i]);
        player.start();
    }
}
