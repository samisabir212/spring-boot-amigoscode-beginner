package com.example.demo.customer;


import org.springframework.stereotype.Component;


//creates a bean that we can inject into multiple places
//it is now a singleton, we can inject in many classes, we can get the same instance
//instead of creating multiple objects of the same class
@Component
public class CustomerService {

    Customer getCustomer() {
        return new Customer(1L, "James Bond");
    }


}
