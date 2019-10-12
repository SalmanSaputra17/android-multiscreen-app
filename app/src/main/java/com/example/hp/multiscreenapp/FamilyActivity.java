package com.example.hp.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father", "Ayah", R.drawable.family_father));
        words.add(new Word("Mother", "Ibu", R.drawable.family_mother));
        words.add(new Word("Older Brother", "Kakak laki-laki", R.drawable.family_older_brother));
        words.add(new Word("Younger Brother", "Adik laki-laki", R.drawable.family_younger_brother));
        words.add(new Word("Older Sister", "Kakak perempuan", R.drawable.family_older_sister));
        words.add(new Word("Younger Sister", "Adik perempuan", R.drawable.family_younger_sister));
        words.add(new Word("Son", "Anak laki-laki", R.drawable.family_son));
        words.add(new Word("Daughter", "Anak perempuan", R.drawable.family_daughter));
        words.add(new Word("Grandmother", "Nenek", R.drawable.family_grandmother));
        words.add(new Word("Grandfather", "Kakek", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.colorFamllies);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
