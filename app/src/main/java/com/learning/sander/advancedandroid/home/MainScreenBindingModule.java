package com.learning.sander.advancedandroid.home;

import com.bluelinelabs.conductor.Controller;
import com.learning.sander.advancedandroid.di.ControllerKey;
import com.learning.sander.advancedandroid.trending.TrendingReposComponent;
import com.learning.sander.advancedandroid.trending.TrendingReposController;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by sander on 07/04/2018.
 */

@Module(subcomponents = {
        TrendingReposComponent.class
})
public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposInjector(TrendingReposComponent.Builder builder);
}
