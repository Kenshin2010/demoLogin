package com.manroid.event.presenter;

import com.manroid.event.base.BasePresenter;
import com.manroid.event.base.BaseView;

public class Presenter<T extends BaseView> implements BasePresenter<T>{

    private T view;


    public T getView() {
        return view;
    }

    @Override
    public void attachView(T view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
