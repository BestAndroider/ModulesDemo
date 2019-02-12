package com.suning.demo;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

public class MyApplication extends Application {
    //public final String TAG = this.getPackageName();
    private boolean ARouterDebuger = true;

    @Override
    public void onCreate() {
        super.onCreate();
        //Log.e(TAG, "app init...");
        if(ARouterDebuger){
            ARouter.openLog();//打印日志
            ARouter.openDebug();//开启调试模式,上线时需要关闭(在InstantRun模式下运行则必须开启)
        }

        //初始化需放在上面两行代码后面。
        ARouter.init(MyApplication.this);
    }
}
