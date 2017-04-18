package com.leeway.dependencyinjectionwithdaggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainPresenter mainPresenter;

    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = (TextView) findViewById(R.id.tvHello);

        ((App) getApplication()).getAppComponent().inject(this);
        mainPresenter.attach(this);
        mainPresenter.onLoadGreetingMessage();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detach();
    }

    public void showGreetingMessage(String greetingMessage) {
        tvHello.setText(greetingMessage);
    }
}
