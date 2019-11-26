package com.ykx.shop.service.order;

import com.ykx.shop.dao.JsonCode;
import com.ykx.shop.mapper.UserShopMapper;

public abstract class AbstractOrderHandler {
    public void TemplateMethod(String count,int shopId) //模板方法
    {
        check(shopId);
        save(count,shopId);
        order(shopId);
        exceptionHandle(shopId);
    }
    public void save(String count,int shopId){
        UserShopMapper userShopMapper=null;
        userShopMapper.save(count,shopId);
    }
    public abstract JsonCode check(int shopId);
    public abstract void order(int shopId);
    public abstract void exceptionHandle(int shopId);
}
