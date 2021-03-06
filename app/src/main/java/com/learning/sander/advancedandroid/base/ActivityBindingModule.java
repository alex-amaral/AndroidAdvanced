package com.learning.sander.advancedandroid.base;

import android.app.Activity;

import com.learning.sander.advancedandroid.home.MainActivity;
import com.learning.sander.advancedandroid.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by sander on 07/04/2018.
 */

@Module(subcomponents = {
        MainActivityComponent.class
})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);

}
