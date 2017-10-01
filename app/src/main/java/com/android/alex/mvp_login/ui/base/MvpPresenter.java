package com.android.alex.mvp_login.ui.base;

/**
 * Created by Alex on 01/10/2017.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

}