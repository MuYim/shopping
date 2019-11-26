package com.ykx.shop.service.order;

import com.ykx.shop.dao.JsonCode;
import com.ykx.shop.dao.Shop;
import com.ykx.shop.mapper.ShopMapper;

public class OrderNikeHandler extends AbstractOrderHandler {
    @Override
    public JsonCode check(int shopId) {
        ShopMapper shopMapper=null;
        Shop shop=shopMapper.selectByPrimaryKey(shopId);
        if(shop.getShopnumber()>0){
            JsonCode jsonCode=new JsonCode(200,"订单保存成功",shop);
            return jsonCode;
        }
        else{
            JsonCode jsonCode=new JsonCode(500,"库存不足",shop);
            return jsonCode;
        }
    }

    @Override
    public void order(int shopId) {
        ShopMapper shopMapper=null;
        Shop shop=shopMapper.selectByPrimaryKey(shopId);
        shop.setShopnumber(shop.getShopnumber()-1);
        shopMapper.updateByPrimaryKey(shop);
    }

    @Override
    public void exceptionHandle(int shopId) {
        JsonCode jsonCode=check(shopId);
        if(jsonCode.getCode()==500){
            System.out.println("订单处理错误，请重试！");
        }
    }
}
