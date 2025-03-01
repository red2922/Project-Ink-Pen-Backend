package com.jake.demo.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jake.demo.Services.CustomerService;
import com.jake.demo.dto.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService dataService;

    @GetMapping("/customer/{name}")
    public Customer getUser(@PathVariable String name) {
        return dataService.getCustomerByName(name);
    }

    @GetMapping("/customer/id/{id}")
    public Optional<Customer> getUserById(@PathVariable Integer id) {
        return dataService.getCustomerById(id);
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = dataService.saveCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
}
