package com.ykx.shop.service.login;

import com.ykx.shop.dao.JsonCode;
import com.ykx.shop.dao.User;
import com.ykx.shop.mapper.UserMapper;

public class FaceLogin implements Login {
    @Override
    public JsonCode login(Object... param) {//参数排序账号，人脸信息
        String username=param[0].toString();
        String faceMessage=param[1].toString();
        UserMapper userMapper=null;
        User user=userMapper.selectByCount(username);
        if(user.getFace().equals(faceMessage)){
            JsonCode jsonCode=new JsonCode(200,"登陆成功",user);
            return jsonCode;
    }
        else {
            JsonCode jsonCode=new JsonCode(500,"登陆失败",user);
            return jsonCode;
        }
    }
}
