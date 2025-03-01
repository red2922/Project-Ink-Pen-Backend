package com.jake.demo.dto;

public class Payment {
    private Integer id;
    private float pay;

    public Payment(Integer id, float pay) {
        this.id = id;
        this.pay = pay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }
}
