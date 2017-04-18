package com.leeway.dependencyinjectionwithdaggersample;

import javax.inject.Inject;

/**
 * Created by Lee Lorz on 4/18/2017.
 */

public class MainPresenter {

    DataManager model;
    MainActivity view;

    @Inject
    public MainPresenter(DataManager dataManager) {
        this.model = dataManager;
    }

    public void attach(MainActivity activity) {
        this.view = activity;
    }

    public void detach() {
        view = null;
    }

    public void onLoadGreetingMessage() {
        String greetingMessage = model.getGreetingText();
        view.showGreetingMessage(greetingMessage);
    }
}
