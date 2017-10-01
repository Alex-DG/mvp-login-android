package com.android.alex.mvp_login.ui.base;

import com.android.alex.mvp_login.data.DataManager;

/**
 * Created by Alex on 01/10/2017.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    DataManager mDataManager;

    public BasePresenter(DataManager dataManager){
        mDataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}
