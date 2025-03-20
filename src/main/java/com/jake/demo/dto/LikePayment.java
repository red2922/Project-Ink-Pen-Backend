package com.jake.demo.dto;

public class LikePayment extends BasePayment {
    private Integer likes;

    public LikePayment(Integer id, Integer sellerId, Integer likes) {
        super(id, sellerId);
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

}
