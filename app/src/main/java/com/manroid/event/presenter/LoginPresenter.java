package com.manroid.event.presenter;

import com.manroid.event.base.BaseView;
import com.manroid.event.inerfaces.LoginListener;

public class LoginPresenter extends Presenter<LoginListener> {

    public void onLogin(String userName, String password){
        if (userName.isEmpty() || password.isEmpty()){
            getView().loginFailed("Login failed");
        }else
            getView().loginSuccess("Login success");
    }


    @Override
    public void attachView(LoginListener view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }
}
