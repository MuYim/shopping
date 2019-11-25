package com.ykx.shop.service.login;

public class PasswordFactory implements LoginFactory{

    @Override
    public Login getLogin() {
        return new PasswordLogin();
    }
}
