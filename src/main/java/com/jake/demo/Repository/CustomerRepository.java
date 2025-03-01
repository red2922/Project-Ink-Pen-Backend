package com.jake.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import com.jake.demo.dto.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    @Query("{name:'?0'}")
    Customer findCustomerByName(String name);

    @Query("{ '_id': ?0 }")
    @Update("{ '$inc': { balance: ?1 } }")
    void changeBalance(Integer id, float pay);
}
