package com.example.hp.multiscreenapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One", "Satu", R.drawable.number_one));
        words.add(new Word("Two", "Dua", R.drawable.number_two));
        words.add(new Word("Three", "Tiga", R.drawable.number_three));
        words.add(new Word("Four", "Empat", R.drawable.number_four));
        words.add(new Word("Five", "Lima", R.drawable.number_five));
        words.add(new Word("Six", "Enam", R.drawable.number_six));
        words.add(new Word("Seven", "Tujuh", R.drawable.number_seven));
        words.add(new Word("Eight", "Delapan", R.drawable.number_eight));
        words.add(new Word("Nine", "Sembilan", R.drawable.number_nine));
        words.add(new Word("Ten", "Sepuluh", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.colorNumbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


//        int index = 0;
//        while (index < words.size()) {
//
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//            index++;
//        }

//        for (int i = 0; i < words.size(); i++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//        }

    }
}
