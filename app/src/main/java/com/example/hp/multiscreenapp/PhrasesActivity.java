package com.example.hp.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("What your name?", "Siapa nama kamu?"));
        words.add(new Word("How old are you?", "Berapa umur mu?"));
        words.add(new Word("Where do you live?", "Dimana kamu tinggal?"));
        words.add(new Word("What your favorite food(s)?", "Apa makanan kesukaanmu?"));
        words.add(new Word("What your favorite drink(s)?", "Apa minuman kesukaanmu?"));
        words.add(new Word("Do you have brother?", "Apa kamu punya kakak?"));
        words.add(new Word("Do you have sister?", "Apa kamu punya adik?"));
        words.add(new Word("Do you have children?", "Apa kamu punya anak?"));
        words.add(new Word("Whose your father name?", "Siapa nama ayahmu?"));
        words.add(new Word("Whose your mother name?", "Siapa nama ibumu?"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.colorPhrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
