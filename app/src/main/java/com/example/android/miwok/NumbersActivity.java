package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create an ArrayList words that stores Strings
        ArrayList<Word> words = new ArrayList<>();

        // Add elements to the arrayList
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));

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
