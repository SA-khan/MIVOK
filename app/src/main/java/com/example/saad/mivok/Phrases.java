package com.example.saad.mivok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

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
        words.add(new Words("To kill two birds with one stone","Ak teer se do shikaar"));
        words.add(new Words("Let us see which way the wind blow ","Dekhty hain oo'nt kis karwat beethta hy"));
        words.add(new Words("Barking dogs sheldom bite","Jo garajty hain wo barasty nahin"));
        words.add(new Words("Jack of all trade master of none","Neem Hakeem khatra e jaan"));
        words.add(new Words("Try try again","kabhi haar na maano"));
        words.add(new Words("Tit for tat","Jesi karni wesi bharni"));
        words.add(new Words("Lie has no legs","Jhoot k pao ni hoty"));
        words.add(new Words("Something is better than nothing","kuch hona na hony se behtar hy"));
        words.add(new Words("A friend in need is a friend indeed","Dost wo hy jo waqt pe kaam aye"));
        words.add(new Words("Health is wealth","Tandrusti hazaar nemat hy"));

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
