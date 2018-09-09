package com.manroid.event.base;

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();
}
