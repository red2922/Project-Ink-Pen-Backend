package com.jake.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import com.jake.demo.dto.Post;

public interface PostsRepository extends MongoRepository<Post, Integer> {

    @Query("{ '_id': ?0 }")
    @Update("{ '$inc': { balance: ?1 } }")
    void changeBalance(Integer id, float pay);
}
