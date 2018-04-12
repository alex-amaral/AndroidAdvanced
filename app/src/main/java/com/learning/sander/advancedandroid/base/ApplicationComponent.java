package com.learning.sander.advancedandroid.base;

import com.learning.sander.advancedandroid.data.RepoServiceModule;
import com.learning.sander.advancedandroid.networking.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sander on 07/04/2018.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        ServiceModule.class,
        RepoServiceModule.class
})
interface ApplicationComponent {
    void inject(MyApplication myApplication);
}
