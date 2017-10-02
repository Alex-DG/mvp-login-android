package com.android.alex.mvp_login.ui.main;

import com.android.alex.mvp_login.ui.base.MvpPresenter;

/**
 * Created by Alex on 01/10/2017.
 */
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}