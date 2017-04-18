package com.leeway.dependencyinjectionwithdaggersample;

import dagger.Component;
import dagger.Module;

/**
 * Created by Lee Lorz on 4/18/2017.
 */

@Component (modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity activity);
}
