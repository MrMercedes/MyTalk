package com.example.hp0331.mytalk;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by Aaron.zhang
 * at  2017/3/16.
 */

public class MyTalkApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化
        RongIM.init(this);
    }
}
