package com.learning.sander.advancedandroid.home;

import com.bluelinelabs.conductor.Controller;
import com.learning.sander.advancedandroid.R;
import com.learning.sander.advancedandroid.base.BaseActivity;
import com.learning.sander.advancedandroid.trending.TrendingReposController;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected Controller initialScreen() {
        return new TrendingReposController();
    }
}
