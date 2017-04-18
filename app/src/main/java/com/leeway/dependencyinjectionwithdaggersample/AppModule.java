package com.leeway.dependencyinjectionwithdaggersample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Lee Lorz on 4/18/2017.
 */

@Module
public class AppModule {

    @Provides
    public DataManager providesDataManager() {
        return new DataManager();
    }
}
