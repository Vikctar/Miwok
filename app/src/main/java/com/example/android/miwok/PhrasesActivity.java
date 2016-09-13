package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

        /**
         * Create a {@link WordAdapter}, whose data source is a list of {@link Word}s.
         * The adapter knows how to create list items for each item in the list.
         */
        WordAdapter wordAdapter = new WordAdapter(this, words);

        /**
         * Find the {@link android.widget.ListView} object in the view hierarchy of the {@link android.app.Activity}.
         * There should be a {@link android.widget.ListView} with the view ID called list (root_view), which is declared in the
         * word_list.xml file.
         */
        ListView listView = (ListView) findViewById(R.id.list_view);

        /**
         * Make the {@link ListView} use the {@link ArrayAdapter} created above, so that the
         * {@link ListView} will display list items for each word in the list of words.
         * Do this by calling the setAdapter method on the {@link ListView} object and pass in
         * 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
         */
        if (listView != null) {
            listView.setAdapter(wordAdapter);
        }


    }
}
