package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component(value = "fake") // as a bean
public class CustomerFakeRepository implements CustomerRepo {


    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
         new Customer(1L, "James Bond"),
         new Customer(2L, "Ryan Reynolds"),
         new Customer(3L, "Dwayne Johnson")
        );
    }
}
