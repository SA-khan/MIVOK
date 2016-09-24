package com.example.saad.mivok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

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
        words.add(new Words("Father","Abu",R.mipmap.family_father));
        words.add(new Words("Mother","Ami",R.mipmap.family_mother));
        words.add(new Words("Older Brother","Bhai",R.mipmap.family_older_brother));
        words.add(new Words("Older Sister","Behan",R.mipmap.family_older_sister));
        words.add(new Words("GrandFather","Dada",R.mipmap.family_grandfather));
        words.add(new Words("GrandMother","Dadi",R.mipmap.family_grandmother));
        words.add(new Words("Younger Brother","Chota Bhai",R.mipmap.family_younger_brother));
        words.add(new Words("Younger Sister","Choti Behan",R.mipmap.family_younger_sister));
        words.add(new Words("Son","Beta",R.mipmap.family_son));
        words.add(new Words("Daughter","Beti",R.mipmap.family_daughter));

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
