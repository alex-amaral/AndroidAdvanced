package com.learning.sander.advancedandroid.ui;

import dagger.Binds;
import dagger.Module;

/**
 * Created by sander on 07/04/2018.
 */

@Module
public abstract class NavigationModule {

    @Binds
    abstract ScreenNavigator provideScreenNavigator(DefaultScreenNavigator screenNavigator);
}
