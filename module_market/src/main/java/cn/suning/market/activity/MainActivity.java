package cn.suning.market.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import pack.suning.com.module_market.R;

@Route(path = "/market/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Autowired(name = "name")
    String name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_main);
        ARouter.getInstance().inject(this);
        Log.e("TAG--------------NAME",name);
    }
}
