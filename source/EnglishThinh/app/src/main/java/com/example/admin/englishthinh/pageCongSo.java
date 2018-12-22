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

public class pageCongSo extends AppCompatActivity implements ExpandableListView.OnGroupExpandListener{
    ExpandableListView expandableListView;
    List<String> listdataHeader;
    HashMap<String,List<String>> listDataChild;
    expandlistviewpageTime expandlistviewTime;
    int[] abc={R.raw.congso00001,R.raw.congso00002,R.raw.congso00003,R.raw.congso00004,R.raw.congso00005,R.raw.congso00006,R.raw.congso00007,R.raw.congso00008,R.raw.congso00009,R.raw.congso00010,};
    MediaPlayer player;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_time);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addControl();
        expandlistviewTime = new expandlistviewpageTime(pageCongSo.this,listdataHeader,listDataChild);
        expandableListView.setAdapter(expandlistviewTime);
        expandableListView.setOnGroupExpandListener(this);
    }

    private void addControl() {
        expandableListView = (ExpandableListView)findViewById(R.id.expandableTime);
        listdataHeader = new ArrayList<>();
        listDataChild = new HashMap<String,List<String>>();

        listdataHeader.add("    Vé khứ hồi.");
        listdataHeader.add("    Vé một chiều.");
        listdataHeader.add("    Khoảng 300 cây số");
        listdataHeader.add("    Tôi có thể hẹn vào tối thứ 4 tới không");
        listdataHeader.add("    Bạn có số điện thoại để gọi taxi không.");
        listdataHeader.add("    Bạn có muốn tôi đến đoán bạn không?");
        listdataHeader.add("    Con đường này có tới Quy Nhơn không?");
        listdataHeader.add("    Từ đây đến đó");
        listdataHeader.add("    Theo tôi");
        listdataHeader.add("    Đi thẳng trước mặt");

        List<String> cau1 = new ArrayList<String>();
        cau1.add("    A round trip ticket.");
        List<String> cau2 = new ArrayList<String>();
        cau2.add("    A one way ticket.");
        List<String> cau3 = new ArrayList<String>();
        cau3.add("    About 300 kilometers.");
        List<String> cau4 = new ArrayList<String>();
        cau4.add("    Can I make an appointment for next wesnesday?");
        List<String> cau5 = new ArrayList<String>();
        cau5.add("    Do you have the number for a taxi?");
        List<String> cau6 = new ArrayList<String>();
        cau6.add("    Do you want me to come and pick you up?");
        List<String> cau7 = new ArrayList<String>();
        cau7.add("    Does this road go to Quy Nhon ?");
        List<String> cau8 = new ArrayList<String>();
        cau8.add("    From here to there");
        List<String> cau9 = new ArrayList<String>();
        cau9.add("    Follow me");
        List<String> cau10 = new ArrayList<String>();
        cau10.add("    Go straight ahead.");

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
