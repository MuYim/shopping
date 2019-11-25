package com.ykx.shop.service.login;

import com.ykx.shop.dao.JsonCode;

public class FaceFactory implements LoginFactory{
    @Override
    public Login getLogin() {
        return new FaceLogin();
    }
}
