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

public class pageKetBan extends AppCompatActivity implements ExpandableListView.OnGroupExpandListener {
    ExpandableListView expandableListView;
    List<String> listdataHeader;
    HashMap<String,List<String>> listDataChild;
    expandlistviewpageTime expandlistviewTime;
    int[] abc={R.raw.ketban1,R.raw.ketban2,R.raw.ketban3,R.raw.ketban4,R.raw.ketban5,R.raw.ketban6,R.raw.ketban7,R.raw.ketban8,R.raw.ketban9,R.raw.ketban10};
    MediaPlayer player;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_time);
        addControl();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        expandlistviewTime = new expandlistviewpageTime(pageKetBan.this,listdataHeader,listDataChild);
        expandableListView.setAdapter(expandlistviewTime);
        expandableListView.setOnGroupExpandListener(this);
    }

    private void addControl() {
        expandableListView = (ExpandableListView)findViewById(R.id.expandableTime);
        listdataHeader = new ArrayList<>();
        listDataChild = new HashMap<String,List<String>>();

        listdataHeader.add("    Tối nay bạn tới không?");
        listdataHeader.add("    Bạn sẽ đi máy bay hay tàu hỏa?");
        listdataHeader.add("    Bạn có đói không?");
        listdataHeader.add("    Ngày mai bạn có làm việc không?");
        listdataHeader.add("    Bạn có phải người Mỹ không?");
        listdataHeader.add("    Tối nay bạn rảnh không?");
        listdataHeader.add("    Bạn chắc không?");
        listdataHeader.add("    Việc làm ăn tốt");
        listdataHeader.add("    Chúc sức khỏe!");
        listdataHeader.add("    Trời có tuyết hôm qua không?");
//        listdataHeader.add("    Bạn có nhận được email của tôi không?");
//        listdataHeader.add("    Bạn đã uống thuốc chưa?");
//        listdataHeader.add("    Bạn có cảm thấy khỏe hơn không?");
//        listdataHeader.add("    Bạn có cái khác không?");
//        listdataHeader.add("    Bạn có thích nơi đây không?");
//        listdataHeader.add("    Bạn có cần gì không?");
//        listdataHeader.add("    Bạn có thường đi Hồ Chí Minh không?");
//        listdataHeader.add("    Bạn có biết ở đâu có shop áo không?");
//        listdataHeader.add("    Bạn có thích quyển sách không?");
//        listdataHeader.add("    ");

        List<String> cau1 = new ArrayList<String>();
        cau1.add("    Are you comming this evening?");
        List<String> cau2 = new ArrayList<String>();
        cau2.add("    Are you going to take a plane or train?");
        List<String> cau3 = new ArrayList<String>();
        cau3.add("    Are you hungry?");
        List<String> cau4 = new ArrayList<String>();
        cau4.add("    Are you working Tomorrow?");
        List<String> cau5 = new ArrayList<String>();
        cau5.add("    Are you American?");
        List<String> cau6 = new ArrayList<String>();
        cau6.add("    Are you free to night?");
        List<String> cau7 = new ArrayList<String>();
        cau7.add("    Are you sure?");
        List<String> cau8 = new ArrayList<String>();
        cau8.add("    Bussiness is good");
        List<String> cau9 = new ArrayList<String>();
        cau9.add("    Cheers!");
        List<String> cau10 = new ArrayList<String>();
        cau10.add("    Did it snow yesterday?");
//        List<String> cau11 = new ArrayList<String>();
//        cau11.add("    Did you get my email");
//        List<String> cau12 = new ArrayList<String>();
//        cau12.add("    Did you take the medicine?");
//        List<String> cau13 = new ArrayList<String>();
//        cau13.add("    Do you feel better?");
//        List<String> cau14 = new ArrayList<String>();
//        cau14.add("    Do you have another one?");
//        List<String> cau15 = new ArrayList<String>();
//        cau15.add("    Do you like it here?");
//        List<String> cau16 = new ArrayList<String>();
//        cau16.add("    Do you need enything?");
//        List<String> cau17 = new ArrayList<String>();
//        cau17.add("    Do you go to HCM often?");
//        List<String> cau18 = new ArrayList<String>();
//        cau18.add("    Do you know where there's a store that sells Shirt?");
//        List<String> cau19 = new ArrayList<String>();
//        cau19.add("    Do you like the book?");

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
//        listDataChild.put(listdataHeader.get(10),cau11);
//        listDataChild.put(listdataHeader.get(11),cau12);
//        listDataChild.put(listdataHeader.get(12),cau13);
//        listDataChild.put(listdataHeader.get(13),cau14);
//        listDataChild.put(listdataHeader.get(14),cau15);
//        listDataChild.put(listdataHeader.get(15),cau16);
//        listDataChild.put(listdataHeader.get(16),cau17);
//        listDataChild.put(listdataHeader.get(17),cau18);
//        listDataChild.put(listdataHeader.get(18),cau19);
    }
    @Override
    public void onGroupExpand(int i) {
        if (player!=null && player.isPlaying())
            player.stop();
        player = MediaPlayer.create(this,abc[i]);
        player.start();
    }
}
