package com.nimtego.tasklist.presenter;

import android.util.Log;
import android.view.View;

import com.nimtego.tasklist.R;

public class PresenterTaskActivity extends AbstractBasePresenter {
    private final String LOG_TAG = "Presenter task activity";

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.toast) {
            Log.v(LOG_TAG, " toast in presenter");
            commonView.toast("This toast");
        }
        if (view.getId() == R.id.alarm) {
            commonView.alarm("This alarm");
        }
    }
}
