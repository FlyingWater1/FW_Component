package com.feishuixiansheng.fw_component;

import android.app.Application;

import java.util.List;

/**
 * @author dupengfei
 * @create 2019/3/1 0001
 * @Describe
 */
public class BaseApplication extends Application {

    public static final String ROOT_PACKAGE = "com.feishuixiansheng.module";

    private static BaseApplication sInstance;

    private List<Application> applicationList;

    public static BaseApplication getIns() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        Utils.init(this);
        applicationList = ClassUtils.getObjectsWithInterface(this, Application.class, ROOT_PACKAGE);
        for (Application application : applicationList) {
            application.onCreate();
        }

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        for (Application application : applicationList) {
            application.onTerminate();
        }
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
        for (Application application : applicationList) {
            application.onLowMemory();
        }
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        for (Application application : applicationList) {
            application.onTrimMemory(level);
        }
    }


}
