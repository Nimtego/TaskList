package com.nimtego.tasklist.presenter;

import com.nimtego.tasklist.view.CommonView;

public abstract class AbstractBasePresenter<T extends CommonView> implements Presenter<T> {
    protected T commonView;

    @Override
    public void attach(T view) {
        this.commonView = view;
    }

    @Override
    public void detach() {
        this.commonView = null;
    }
}
