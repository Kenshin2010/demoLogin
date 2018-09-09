package com.manroid.event.inerfaces;

import com.manroid.event.base.BaseView;

public interface LoginListener extends BaseView{

    void loginSuccess(String message);
    void loginFailed(String message);

}
