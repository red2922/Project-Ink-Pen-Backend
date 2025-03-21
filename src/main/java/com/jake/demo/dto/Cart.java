package com.jake.demo.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cart")
public class Cart {

    @Id
    private Integer id;
    private Integer userId;
    private List<Order> tips;
    
    public Cart(Integer id, Integer userId, List<Order> tips) {
        this.id = id;
        this.userId = userId;
        this.tips = tips;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Order> getTips() {
        return tips;
    }

    public void setTips(List<Order> tips) {
        this.tips = tips;
    }
}
