package com.example.hp.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red", "Merah", R.drawable.color_red));
        words.add(new Word("Yellow", "Kuning", R.drawable.color_mustard_yellow));
        words.add(new Word("Green", "Hijau", R.drawable.color_green));

        words.add(new Word("Black", "Hitam", R.drawable.color_black));
        words.add(new Word("White", "Putih", R.drawable.color_white));
        words.add(new Word("Gray", "Abu-abu", R.drawable.color_gray));
        words.add(new Word("Brown", "Cokelat", R.drawable.color_brown));

        WordAdapter adapter = new WordAdapter(this, words, R.color.colorColors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
