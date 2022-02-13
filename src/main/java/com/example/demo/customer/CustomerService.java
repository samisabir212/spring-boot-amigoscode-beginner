package com.example.demo.customer;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;


//creates a bean that we can inject into multiple places
//it is now a singleton, we can inject in many classes, we can get the same instance
//instead of creating multiple objects of the same class
@Component
@Primary
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(@Qualifier("fake") CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }


}
