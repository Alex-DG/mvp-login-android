package com.android.alex.mvp_login.ui.login;

import com.android.alex.mvp_login.data.DataManager;
import com.android.alex.mvp_login.ui.base.BasePresenter;

/**
 * Created by Alex on 01/10/2017.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }

}
