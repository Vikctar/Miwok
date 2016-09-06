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

        // Create a variable to keep track of current index position
        int index = 0;

        while (index < words.size()) {
            // Create a new {@link TextView} that displays word at index
            // and add the View as a child to the rootView
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            if (rootView != null) {
                rootView.addView(wordView);
            }

            index += 1;
        }
    }
}
