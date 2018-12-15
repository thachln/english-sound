package com.example.admin.englishthinh;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class pageChaoHoi extends AppCompatActivity implements ExpandableListView.OnGroupExpandListener {
    ExpandableListView expandableListView;
    List<String> listdataHeader;
    HashMap<String,List<String>> listdataChild;
    expandlistviewpage_ChaoHoi expandlistviewChaoHoi;
    int[] abc={R.raw.yesterday,R.raw.chamday,R.raw.chamday};
    MediaPlayer player;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_chaohoi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addControl();
        expandlistviewChaoHoi = new expandlistviewpage_ChaoHoi(pageChaoHoi.this,listdataHeader,listdataChild);
        expandableListView.setAdapter(expandlistviewChaoHoi);
        expandableListView.setOnGroupExpandListener(this);
    }

    private void addControl() {
        expandableListView = (ExpandableListView)findViewById(R.id.expandableChaoHoi);
        listdataHeader = new ArrayList<>();
        listdataChild = new HashMap<String,List<String>>();

        listdataHeader.add("    Chào buổi chiều");
        listdataHeader.add("    Chào sáng");
        listdataHeader.add("    Chúc mừng sinh nhật");
        listdataHeader.add("    Chúc may mắn");
        listdataHeader.add("    Rất vui được gặp bạn");
        listdataHeader.add("    Hãy họi cho tôi");
        listdataHeader.add("    Tất nhiên rồi!");
        listdataHeader.add("    Chào buổi tối thưa ngài");
        listdataHeader.add("    Tuyệt vời");

        List<String> cau1 = new ArrayList<String>();
        cau1.add("    Good afternoon");
        List<String> cau2 = new ArrayList<String>();
        cau2.add("    Good morning");
        List<String> cau3 = new ArrayList<String>();
        cau3.add("    Happy Birthday");
        List<String> cau4 = new ArrayList<String>();
        cau4.add("    Good Luck");
        List<String> cau5 = new ArrayList<String>();
        cau5.add("    Nice To Meet You");
        List<String> cau6 = new ArrayList<String>();
        cau6.add("    Please Call Me");
        List<String> cau7 = new ArrayList<String>();
        cau7.add("    Certainly!");
        List<String> cau8 = new ArrayList<String>();
        cau8.add("    Good everning sir ");
        List<String> cau9 = new ArrayList<String>();
        cau9.add("    Great");

        listdataChild.put(listdataHeader.get(0),cau1);
        listdataChild.put(listdataHeader.get(1),cau2);
        listdataChild.put(listdataHeader.get(2),cau3);
        listdataChild.put(listdataHeader.get(3),cau4);
        listdataChild.put(listdataHeader.get(4),cau5);
        listdataChild.put(listdataHeader.get(5),cau6);
        listdataChild.put(listdataHeader.get(6),cau7);
        listdataChild.put(listdataHeader.get(7),cau8);
        listdataChild.put(listdataHeader.get(8),cau9);

    }

    @Override
    public void onGroupExpand(int i) {
        if (player!=null && player.isPlaying())
            player.stop();
        player = MediaPlayer.create(this,abc[i]);
        player.start();
    }
}

