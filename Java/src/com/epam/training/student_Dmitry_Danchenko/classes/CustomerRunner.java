package com.epam.training.student_Dmitry_Danchenko.classes;

public class CustomerRunner {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList(CustomerData.customers);
        System.out.println("Sort customers by lastname : " + "\n" + customerList.sortCustomersByLastName());
        System.out.println("Find in range of creditcard : " + "\n"
                + customerList.findCreditCardNumberInRange(4000_0000_0000_0000L, 5000_0000_0000_0000L));
    }
}