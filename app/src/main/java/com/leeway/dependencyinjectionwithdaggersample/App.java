package com.leeway.dependencyinjectionwithdaggersample;

import android.app.Application;

/**
 * Created by Lee Lorz on 4/18/2017.
 */

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
