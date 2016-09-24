package android.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.saad.mivok.R;
import com.example.saad.mivok.WordAdopter;
import com.example.saad.mivok.Words;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

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
        words.add(new Words("one","Ak",R.mipmap.number_one));
        words.add(new Words("Two","Doo",R.mipmap.number_two));
        words.add(new Words("Three","Teen",R.mipmap.number_three));
        words.add(new Words("Four","Char",R.mipmap.number_four));
        words.add(new Words("Five","Panch",R.mipmap.number_five));
        words.add(new Words("Six","Ch'y",R.mipmap.number_six));
        words.add(new Words("Seven","Saat",R.mipmap.number_seven));
        words.add(new Words("Eight","Aath",R.mipmap.number_eight));
        words.add(new Words("Nine","No'o",R.mipmap.number_nine));
        words.add(new Words("Ten","Dus",R.mipmap.number_ten));

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
