package com.android.alex.mvp_login.ui.main;

import com.android.alex.mvp_login.data.DataManager;
import com.android.alex.mvp_login.ui.base.BasePresenter;

/**
 * Created by Alex on 01/10/2017.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }

}
