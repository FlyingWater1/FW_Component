package com.feishuixiansheng.module.framework;

import android.app.Application;
import android.util.Log;

/**
 * @author dupengfei
 * @create 2019/3/1 0001
 * @Describe
 */
public class FrameApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("FrameApplication","onCreate，，，这里是FrameApplication");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.e("FrameApplication","onTerminate，，，这里是FrameApplication");
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.e("FrameApplication","onLowMemory，，，这里是FrameApplication");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Log.e("FrameApplication","onTrimMemory，，，这里是FrameApplication");
    }
}
