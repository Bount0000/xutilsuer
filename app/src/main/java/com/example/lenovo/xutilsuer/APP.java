package com.example.lenovo.xutilsuer;

import android.app.Application;

import org.xutils.x;

/**
 * Created by lenovo on 2017/8/29.
 */

public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
