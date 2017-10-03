package com.android.alex.mvp_login.ui.login;

import com.android.alex.mvp_login.ui.base.MvpPresenter;

/**
 * Created by Alex on 01/10/2017.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}