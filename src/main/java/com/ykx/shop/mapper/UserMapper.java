package com.ykx.shop.mapper;

import com.ykx.shop.dao.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}