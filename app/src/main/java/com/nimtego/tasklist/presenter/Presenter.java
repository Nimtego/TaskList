package com.nimtego.tasklist.presenter;

import android.view.View;

import com.nimtego.tasklist.view.CommonView;

public interface Presenter<T extends CommonView> extends View.OnClickListener {
    void attach(T view);
    void detach();
}
