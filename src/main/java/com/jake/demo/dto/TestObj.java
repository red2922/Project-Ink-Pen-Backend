package com.jake.demo.dto;

public class TestObj {
    private Integer id;
    private float profit;

    public TestObj(Integer id, float profit) {
        this.id = id;
        this.profit = profit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }
}
