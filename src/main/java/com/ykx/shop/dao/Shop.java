package com.ykx.shop.dao;

public class Shop {
    private Integer id;

    private String shopname;

    private Float shopprice;

    private Integer shopnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public Float getShopprice() {
        return shopprice;
    }

    public void setShopprice(Float shopprice) {
        this.shopprice = shopprice;
    }

    public Integer getShopnumber() {
        return shopnumber;
    }

    public void setShopnumber(Integer shopnumber) {
        this.shopnumber = shopnumber;
    }
}