package com.example.android.miwok;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Custom onClickListener handler class
 * Created by curv3r on 9/3/16.
 */
public class NumbersEventListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Snackbar.make(v, "Numbers to display", Snackbar.LENGTH_LONG).show();
    }
}
