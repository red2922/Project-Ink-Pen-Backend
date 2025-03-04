package com.jake.demo.dto;

public class Payment {
    private Integer buyerId;
    private float pay;
    private Integer sellerId;

    public Payment(Integer id, float pay, Integer sellerId) {
        this.buyerId = id;
        this.pay = pay;
        this.sellerId = sellerId;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
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
