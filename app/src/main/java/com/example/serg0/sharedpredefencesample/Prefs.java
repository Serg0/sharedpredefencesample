package com.example.serg0.sharedpredefencesample;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class Prefs{

    private static final String APP_SHARED_PREFS = Prefs.class.getSimpleName(); //  Name of the file -.xml
    private static SharedPreferences sharedPrefs;
    private static SharedPreferences.Editor prefsEditor;


    public static void init(Context context) {
        sharedPrefs = context
                .getSharedPreferences(APP_SHARED_PREFS, Activity.MODE_PRIVATE);
        prefsEditor = sharedPrefs.edit();

    }

    public static String getStringValue(String key) {
        return sharedPrefs.getString(key, "");
    }

    public static void saveStringValue(String key, String value) {
        prefsEditor.putString(key, value);
        prefsEditor.commit();
    }

    public static void saveIntValue(String key, int value) {
        prefsEditor.putInt(key, value);
        prefsEditor.commit();
    }

    public static Integer getIntValue(String key) {
        return sharedPrefs.getInt(key, -1);
    }

    public static Boolean getBooleanValue(String key) {
        return sharedPrefs.getBoolean(key, false);
    }

    public static void saveBooleanValue(String key, Boolean value) {
        prefsEditor.putBoolean(key, value);
        prefsEditor.commit();
    }






}