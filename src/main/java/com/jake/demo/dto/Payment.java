package com.jake.demo.dto;

public class Payment extends BasePayment {
    private float pay;

    public Payment(Integer id, float pay, Integer sellerId) {
        super(id, sellerId);
        this.pay = pay;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }
}
