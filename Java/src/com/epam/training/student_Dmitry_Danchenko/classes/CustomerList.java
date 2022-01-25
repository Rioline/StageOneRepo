package com.epam.training.student_Dmitry_Danchenko.classes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerList {

    public static List<? extends Customer> customers;

    public CustomerList(List<? extends Customer> customers) {
        CustomerList.customers = customers;
    }

    public List<? extends Customer> getCustomers() {
        return customers;
    }

    public static List<? extends Customer> sortCustomersByLastName() {
        return customers.stream().sorted(Comparator.comparing(Customer::getLastName)).collect(Collectors.toList());
    }

    public  List<? extends Customer> findCreditCardNumberInRange(long min, long max) {
        return customers.stream().
                filter(cst -> cst.getCreditCardNumber() >= min && cst.getCreditCardNumber() <= max).
                collect(Collectors.toList());
    }

}