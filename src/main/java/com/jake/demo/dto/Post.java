package com.jake.demo.dto;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {
    @Id
    private Integer id;
    private String title;
    private String description;
    private Integer userId;
    private float tips;
    private Integer likes;
    private String imageUrl;

    @CreatedDate
    private LocalDateTime createdDate;

    public Post(Integer id, String title, String description, Integer userId, String imageUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.userId = userId;
        this.tips = 0;
        this.likes = 0;
        this.imageUrl = imageUrl;
        this.createdDate = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public float getTips() {
        return tips;
    }

    public void setTips(float tips) {
        this.tips = tips;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

}
