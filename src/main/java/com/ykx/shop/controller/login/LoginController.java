package com.ykx.shop.controller.login;

import com.ykx.shop.dao.JsonCode;
import com.ykx.shop.service.login.Login;
import com.ykx.shop.service.login.LoginFactory;
import com.ykx.shop.service.login.PasswordFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/passWord")
    public JsonCode passWord(String username, String passWord){
        LoginFactory passWordFactory=new PasswordFactory();
        Login passWordLogin=passWordFactory.getLogin();
        return passWordLogin.login(username,passWord);
    }
    @RequestMapping("/face")
    public JsonCode face(String username, String face){
        LoginFactory faceFactory=new PasswordFactory();
        Login faceLogin=faceFactory.getLogin();
        return faceLogin.login(username,face);
    }
}
