package com.android.alex.mvp_login;

import android.app.Application;

import com.android.alex.mvp_login.data.DataManager;
import com.android.alex.mvp_login.data.SharedPrefsHelper;

/**
 * Created by Alex on 01/10/2017.
 */

public class MvpApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }

}