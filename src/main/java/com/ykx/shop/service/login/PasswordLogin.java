package com.ykx.shop.service.login;

import com.ykx.shop.dao.JsonCode;
import com.ykx.shop.dao.User;
import com.ykx.shop.mapper.UserMapper;

public class PasswordLogin implements Login{
    @Override
    public JsonCode login(Object... param) {//参数为排列顺序为账号，密码
        String username=param[0].toString();
        String password=param[1].toString();

        UserMapper userMapper = null;
        User user=userMapper.selectByCount(username);
        if(user.getPassword().equals(password)){
            JsonCode jsonCode=new JsonCode(200,"登入成功",user);
            return jsonCode;
        }
        else {
            JsonCode jsonCode=new JsonCode(500,"登入失败",user);
            return jsonCode;
        }
    }
}
