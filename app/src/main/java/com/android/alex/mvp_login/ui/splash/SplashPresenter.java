package com.android.alex.mvp_login.ui.splash;

import com.android.alex.mvp_login.data.DataManager;
import com.android.alex.mvp_login.ui.base.BasePresenter;

/**
 * Created by Alex on 01/10/2017.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}