package com.example.admin.englishthinh;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Admin on 11/30/2018.
 */

public class pageFood extends AppCompatActivity implements ExpandableListView.OnGroupExpandListener {
    ExpandableListView expandableListView;
    List<String> listdataHeader;
    HashMap<String,List<String>> listdataChild;
    expandlistviewpageTime expandlistviewTime;
    int[] abc={R.raw.food00001,R.raw.food00002,R.raw.food00003,R.raw.food00004,R.raw.food00005,R.raw.food00006,R.raw.food00007,R.raw.food00008,R.raw.food00009,R.raw.food00010,};
    MediaPlayer player;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_time);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addControl();
        expandlistviewTime = new expandlistviewpageTime(pageFood.this,listdataHeader,listdataChild);
        expandableListView.setAdapter(expandlistviewTime);
        expandableListView.setOnGroupExpandListener(this);
    }

    private void addControl() {
        expandableListView = (ExpandableListView)findViewById(R.id.expandableTime);
        listdataHeader = new ArrayList<>();
        listdataChild = new HashMap<String,List<String>>();

        listdataHeader.add("    Làm ơn cho tôi hóa đơn?");
        listdataHeader.add("    Bạn ở đây một mình hả?");
        listdataHeader.add("    Tôi có thể đem theo bạn không?");
        listdataHeader.add("    Có thể rẻ hơn không?");
        listdataHeader.add("    Làm ơn đưa xem thực đơn");
        listdataHeader.add("    Bạn có thể giữ giúp dùm tôi cái này không?");
        listdataHeader.add("    Bạn biết giá nó bao nhiêu không?");
        listdataHeader.add("    Bạn đã từng ăn súp khoai chưa");
        listdataHeader.add("    Anh ta thích nước trái cây nhưng không thích sữa");
        listdataHeader.add("    Bạn đã ăn chưa?");

        List<String> cau1 = new ArrayList<String>();
        cau1.add("    Can I have a receipt please?");
        List<String> cau2 = new ArrayList<String>();
        cau2.add("    Are you here alone?");
        List<String> cau3 = new ArrayList<String>();
        cau3.add("    Can I bring my friend?");
        List<String> cau4 = new ArrayList<String>();
        cau4.add("    Can be cheaper?");
        List<String> cau5 = new ArrayList<String>();
        cau5.add("    Can we have the menu please");
        List<String> cau6 = new ArrayList<String>();
        cau6.add("    Can you hold this for me?");
        List<String> cau7 = new ArrayList<String>();
        cau7.add("    Do you know how much it costs?");
        List<String> cau8 = new ArrayList<String>();
        cau8.add("    Have you ever had Potato soup?");
        List<String> cau9 = new ArrayList<String>();
        cau9.add("    He likes juice but he doesn't like milk");
        List<String> cau10 = new ArrayList<String>();
        cau10.add("    Have you eaten yet?");

        listdataChild.put(listdataHeader.get(0),cau1);
        listdataChild.put(listdataHeader.get(1),cau2);
        listdataChild.put(listdataHeader.get(2),cau3);
        listdataChild.put(listdataHeader.get(3),cau4);
        listdataChild.put(listdataHeader.get(4),cau5);
        listdataChild.put(listdataHeader.get(5),cau6);
        listdataChild.put(listdataHeader.get(6),cau7);
        listdataChild.put(listdataHeader.get(7),cau8);
        listdataChild.put(listdataHeader.get(8),cau9);
        listdataChild.put(listdataHeader.get(9),cau10);

    }
    @Override
    public void onGroupExpand(int i) {
        if (player!=null && player.isPlaying())
            player.stop();
        player = MediaPlayer.create(this,abc[i]);
        player.start();
    }
}
