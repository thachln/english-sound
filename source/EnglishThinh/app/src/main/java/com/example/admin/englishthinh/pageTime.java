package com.example.admin.englishthinh;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class pageTime extends AppCompatActivity implements ExpandableListView.OnGroupExpandListener {
    ExpandableListView expandableListView;
    List<String> listdataHeader;
    HashMap<String, List<String>> listDataChild;
    expandlistviewpageTime expandlistviewTime;
    int[] abc = {R.raw.time00023, R.raw.time00024, R.raw.time00025, R.raw.time00026, R.raw.time00027, R.raw.time00028, R.raw.time00029, R.raw.time00030, R.raw.time00031, R.raw.time00032};
    MediaPlayer player;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_time);
        addControl();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        expandlistviewTime = new expandlistviewpageTime(pageTime.this, listdataHeader, listDataChild);
        expandableListView.setAdapter(expandlistviewTime);
        expandableListView.setOnGroupExpandListener(this);

    }

    private void addControl() {
        expandableListView = (ExpandableListView) findViewById(R.id.expandableTime);
        listdataHeader = new ArrayList<>();
        listDataChild = new HashMap<String, List<String>>();

        listdataHeader.add("    Cách nay đã lâu");
        listdataHeader.add("    Càng sớm càng tốt");
        listdataHeader.add("    Suốt ngày");
        listdataHeader.add("    Lúc 6h tối");
        listdataHeader.add("    Bạn có thoải mái không?");
        listdataHeader.add("    Bạn có nghĩ bạn trở lại lúc 11h30 không");
        listdataHeader.add("    Ngày hết hạn");
        listdataHeader.add("    Bạn đã đợi lâu chưa?");
        listdataHeader.add("    Anh ta sẽ trở lại trong vòng 20p nữa");
        listdataHeader.add("    Còn thứ 7 thì sao");

        List<String> cau1 = new ArrayList<String>();
        cau1.add("    A long time ago");
        List<String> cau2 = new ArrayList<String>();
        cau2.add("    As soon as possible");
        List<String> cau3 = new ArrayList<String>();
        cau3.add("    All day");
        List<String> cau4 = new ArrayList<String>();
        cau4.add("    At 7 o'clock");
        List<String> cau5 = new ArrayList<String>();
        cau5.add("    Are you cofortable");
        List<String> cau6 = new ArrayList<String>();
        cau6.add("    Do you think you will be back by 11:30?");
        List<String> cau7 = new ArrayList<String>();
        cau7.add("    Expiration Date");
        List<String> cau8 = new ArrayList<String>();
        cau8.add("    Have you watting for long");
        List<String> cau9 = new ArrayList<String>();
        cau9.add("    He'll be back in 20 minutes");
        List<String> cau10 = new ArrayList<String>();
        cau10.add("    How about saturday?");

        listDataChild.put(listdataHeader.get(0), cau1);
        listDataChild.put(listdataHeader.get(1), cau2);
        listDataChild.put(listdataHeader.get(2), cau3);
        listDataChild.put(listdataHeader.get(3), cau4);
        listDataChild.put(listdataHeader.get(4), cau5);
        listDataChild.put(listdataHeader.get(5), cau6);
        listDataChild.put(listdataHeader.get(6), cau7);
        listDataChild.put(listdataHeader.get(7), cau8);
        listDataChild.put(listdataHeader.get(8), cau9);
        listDataChild.put(listdataHeader.get(9), cau10);


    }

    @Override
    public void onGroupExpand(int i) {
        if (player != null && player.isPlaying())
            player.stop();
        player = MediaPlayer.create(this, abc[i]);
        player.start();
    }
}
