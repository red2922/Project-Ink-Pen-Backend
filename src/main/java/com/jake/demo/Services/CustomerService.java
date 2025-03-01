package com.jake.demo.Services;

//Remember that the service handles the Buisness Logic
import java.util.List;
import java.util.Optional;

import com.jake.demo.dto.Customer;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jake.demo.Components.UtilityComponent;
import com.jake.demo.Repository.CustomerRepository;

@Service
public class CustomerService {
    // This looks way better
    private CustomerRepository customerRepository;
    private UtilityComponent utilityComponent;

    // Essentially a constructor acts as a @Autowired for multiple instances
    public CustomerService(CustomerRepository customerRepository, UtilityComponent utilityComponent) {
        this.customerRepository = customerRepository;
        this.utilityComponent = utilityComponent;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerByName(String name) {
        if (name != null) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        return customerRepository.findCustomerByName(name);
    }

    // To handle optional it seems like the best way is using a wrapper
    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    public Customer saveCustomer(Customer customer) {
        customer.setId(utilityComponent.updateUtilityData("userNumber").getSum());
        return customerRepository.save(customer);
    }

    //Note testing this for now
    public void addBalance(Integer id, float profit) {
        customerRepository.increaseBalance(id, profit);
    }

}
