package com.nimtego.tasklist.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.nimtego.tasklist.R;
import com.nimtego.tasklist.presenter.Presenter;
import com.nimtego.tasklist.presenter.PresenterTaskActivity;

public class TaskActivity extends AppCompatActivity implements CommonView{
    private final String LOG_TAG = "Task activity";

    private Presenter mPresenter;
    private ToastAlarm mToastAlarm;
    private Button alarm;
    private Button toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        init();
    }

    private void init() {
        mToastAlarm = new SimpleToastAlarm(this);
        mPresenter = new PresenterTaskActivity();
        mPresenter.attach(this);
        alarm = findViewById(R.id.alarm);
        toast = findViewById(R.id.toast);
        alarm.setOnClickListener(mPresenter);
        toast.setOnClickListener(mPresenter);
    }

    @Override
    public void toast(String message) {
        Log.v(LOG_TAG, " toast in toast activity");
        mToastAlarm.toastMessage(message);
    }

    @Override
    public void alarm(String message) {
        Log.v(LOG_TAG, " alarm in toast activity");
        mToastAlarm.alarmMessage(message);
    }
}
