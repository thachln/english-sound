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

public class pageTroChuyen extends AppCompatActivity implements ExpandableListView.OnGroupExpandListener {
    ExpandableListView expandableListView;
    List<String> listdataHeader;
    HashMap<String, List<String>> listDataChild;
    expandlistviewpageTime expandlistviewTime;
    int[] abc = {R.raw.yesterday, R.raw.chamday, R.raw.soluong01};
    MediaPlayer player;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_time);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addControl();
        expandlistviewTime = new expandlistviewpageTime(pageTroChuyen.this, listdataHeader, listDataChild);
        expandableListView.setAdapter(expandlistviewTime);
        expandableListView.setOnGroupExpandListener(this);

    }

    private void addControl() {
        expandableListView = (ExpandableListView) findViewById(R.id.expandableTime);
        listdataHeader = new ArrayList<>();
        listDataChild = new HashMap<String, List<String>>();

        listdataHeader.add("Yesterday      --the beatles--");
        listdataHeader.add("Animals      --Marroon 5--");
        listdataHeader.add("Hello       --Adele--");

        List<String> cau1 = new ArrayList<String>();
        cau1.add("Yesterday\n" +
                "All my troubles seemed so far away\n" +
                "Now it looks as though they're here to stay\n" +
                "Oh, I believe\n" +
                "In yesterday\n" +
                "\n" +
                "Suddenly\n" +
                "I'm not half the man I used to be\n" +
                "There's a shadow hanging over me\n" +
                "Oh, yesterday\n" +
                "Came suddenly\n" +
                "\n" +
                "Why she\n" +
                "Had to go I don't know\n" +
                "She wouldn't say\n" +
                "I said\n" +
                "Something wrong now I long\n" +
                "For yesterday\n" +
                "\n" +
                "Yesterday\n" +
                "Love was such an easy game to play\n" +
                "Now I need a place to hide away\n" +
                "Oh, I believe\n" +
                "In yesterday\n" +
                "\n" +
                "Why she\n" +
                "Had to go I don't know\n" +
                "She wouldn't say\n" +
                "I said\n" +
                "Something wrong now I long\n" +
                "For yesterday\n" +
                "\n" +
                "Yesterday\n" +
                "Love was such an easy game to play\n" +
                "Now I need a place to hide away\n" +
                "Oh, I believe\n" +
                "In yesterday");

        List<String> cau2 = new ArrayList<String>();
        cau2.add("Baby I'm preying on you tonight\n" +
                "Hunt you down, eat you alive\n" +
                "Just like animals, animals, like animals\n" +
                "Maybe you think you that can hide\n" +
                "I can smell your scent for miles\n" +
                "Just like animals, animals, like animals\n" +
                "\n" +
                "Baby I'm\n" +
                "\n" +
                "So what you trying to do to me\n" +
                "It's like we can't stop, we're enemies\n" +
                "But we get along when I'm inside you\n" +
                "You're like a drug that's killing me\n" +
                "I cut you out entirely\n" +
                "But I get so high when I'm inside you\n" +
                "\n" +
                "Yeah you can start over\n" +
                "You can run free\n" +
                "You can find other fish in the sea\n" +
                "You can pretend it's meant to be\n" +
                "But you can't stay away from me\n" +
                "I can still hear you making that sound\n" +
                "Taking me down, oh, under the ground\n" +
                "You can pretend it was me below\n" +
                "\n" +
                "Baby I'm preying on you tonight\n" +
                "Hunt you down, eat you alive\n" +
                "Just like animals, animals, like animals\n" +
                "Maybe you think you that can hide\n" +
                "I can smell your scent for miles\n" +
                "Just like animals, animals, like animals\n" +
                "Baby I'm\n" +
                "\n" +
                "So if I run, it's not enough\n" +
                "You're still in my head, forever stuck\n" +
                "But you can do, wha you wanna do\n" +
                "I love your lies, I'll eat 'em up\n" +
                "But don't deny the animal\n" +
                "That comes alive when I'm inside you\n" +
                "\n" +
                "Yeah you can start over\n" +
                "You can run free\n" +
                "You can find other fish in the sea\n" +
                "You can pretend it's meant to be\n" +
                "But you can't stay away from me\n" +
                "I can still hear you making that sound\n" +
                "Taking me down, oh, under the ground\n" +
                "You can pretend it was me below\n" +
                "\n" +
                "Baby I'm preying on you tonight\n" +
                "Hunt you down, eat you alive\n" +
                "Just like animals, animals, like animals\n" +
                "Animals lyrics on ChiaSeNhac.vn\n" +
                "Maybe you think you that can hide\n" +
                "I can smell your scent for miles\n" +
                "Just like animals, animals, like animals\n" +
                "Baby I'm\n" +
                "\n" +
                "Don't tell no lie\n" +
                "You can't deny\n" +
                "The best inside\n" +
                "Yeah yeah yeah\n" +
                "Now girl don't lie\n" +
                "You can't deny\n" +
                "The best inside\n" +
                "Yeah yeah yeah\n" +
                "\n" +
                "Just like animals, animals, like animals\n" +
                "Just like animals, animals, like animals\n" +
                "\n" +
                "Baby I'm preying on you tonight\n" +
                "Hunt you down, eat you alive\n" +
                "Just like animals, animals, like animals\n" +
                "Maybe you think you that can hide\n" +
                "I can smell your scent for miles\n" +
                "Just like animals, animals, like animals\n" +
                "Baby I'm\n" +
                "\n" +
                "Don't tell no lie\n" +
                "You can't deny\n" +
                "The beast inside\n" +
                "Yeah yeah yeah\n" +
                "Now girl don't lie\n" +
                "You can't deny\n" +
                "The beast inside\n" +
                "Yeah yeah yeah\n" +
                "\n");

        List<String> cau3 = new ArrayList<String>();
        cau3.add("fish");

        listDataChild.put(listdataHeader.get(0), cau1);
        listDataChild.put(listdataHeader.get(1), cau2);
        listDataChild.put(listdataHeader.get(2), cau3);


    }

    @Override
    public void onGroupExpand(int i) {
        if (player != null && player.isPlaying())
            player.stop();
        player = MediaPlayer.create(this, abc[i]);
        player.start();
    }
}
