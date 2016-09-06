package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        // Create an ArrayList words that stores Strings
        ArrayList<String> words = new ArrayList<>();

        // Add elements to the arrayList
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.root_view);

        for (int index = 0; index < words.size(); index++) {
            // Create a new TextView
            TextView wordView = new TextView(this);

            // Set the text to be word at current index
            wordView.setText(words.get(index));

            // Add the TextView as a child to the rootView of the layout
            // Make sure the rootView is not null
            if (rootView != null) {
                rootView.addView(wordView);
            }
        }
    }
}
