package com.android.alex.mvp_login.ui.splash;

import com.android.alex.mvp_login.ui.base.MvpPresenter;

/**
 * Created by Alex on 01/10/2017.
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}
