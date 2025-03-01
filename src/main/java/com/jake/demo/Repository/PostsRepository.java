package com.jake.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jake.demo.dto.Post;

public interface PostsRepository extends MongoRepository<Post, Integer> {

}
