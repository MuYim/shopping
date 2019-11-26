package com.ykx.shop.controller.order;

import com.ykx.shop.dao.JsonCode;
import com.ykx.shop.service.order.AbstractOrderHandler;
import com.ykx.shop.service.order.OrderNikeHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
public class OrderController {
    @RequestMapping("/nike")
    public void nike(String username, int shopId){
        AbstractOrderHandler abstractOrderHandler=new OrderNikeHandler();
        abstractOrderHandler.TemplateMethod(username,shopId);
    }
}
