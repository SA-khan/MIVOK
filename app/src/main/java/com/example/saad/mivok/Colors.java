package com.example.saad.mivok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        String[] numbers = new String[10];
        ArrayList<Words> words = new ArrayList<Words>(10);
        numbers[0] = "One";
        numbers[1] = "Two";
        numbers[2] = "Three";
        numbers[3] = "Four";
        numbers[4] = "Five";
        numbers[5] = "Six";
        numbers[6] = "Sever";
        numbers[7] = "Eight";
        numbers[8] = "Nine";
        numbers[9] = "Ten";
        words.add(new Words("Black","Kaa'la",R.mipmap.color_black));
        words.add(new Words("White","Sufaid",R.mipmap.color_white));
        words.add(new Words("Dusty Yellow","Peela",R.mipmap.color_dusty_yellow));
        words.add(new Words("Mustard Yelloe","Peela",R.mipmap.color_mustard_yellow));
        words.add(new Words("Red","Laal",R.mipmap.color_red));
        words.add(new Words("Brown","kathai",R.mipmap.color_brown));
        words.add(new Words("Gray","gray",R.mipmap.color_gray));
        words.add(new Words("Green","Haara",R.mipmap.color_green));
        words.add(new Words("Magenda","Magenda",R.mipmap.color_white));
        words.add(new Words("Purple","Purple",R.mipmap.color_mustard_yellow));

        //LinearLayout rootview = (LinearLayout)findViewById(R.id.rootView);
        //for(int i=0;i<words.size();i++){
        //TextView myview = new TextView(this);
        //myview.setText(words.get(i));
        //rootview.addView(myview);}

        WordAdopter Adopter = new WordAdopter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adopter);
    }
}
