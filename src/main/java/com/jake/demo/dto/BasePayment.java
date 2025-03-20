package com.jake.demo.dto;

public class BasePayment {
    private Integer buyerId;
    private Integer sellerId;

    public BasePayment(Integer id, Integer sellerId) {
        this.buyerId = id;
        this.sellerId = sellerId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }
}
