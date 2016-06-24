package com.example.serg0.sharedpredefencesample;

import android.app.Application;

/**
 * Created by Serhii Nadolinskyi on 24.06.16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Prefs.init(this);
    }
}
