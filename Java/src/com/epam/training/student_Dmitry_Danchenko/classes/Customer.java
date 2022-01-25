package com.epam.training.student_Dmitry_Danchenko.classes;

/**
 * Создать классы, спецификации которых приведены ниже.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
 * Создать массив объектов. Вывести:
 * а) список покупателей в алфавитном порядке;
 * б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */

public class Customer {
    private int customerId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private long creditCardNumber;
    private String bankAccountNumber;

    public Customer(int customerId, String lastName, String firstName, String middleName, String address, long creditCardNumber, String bankAccountNumber) {
        this.customerId = customerId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerId != customer.customerId) return false;
        if (creditCardNumber != customer.creditCardNumber) return false;
        if (!lastName.equals(customer.lastName)) return false;
        if (!firstName.equals(customer.firstName)) return false;
        if (!middleName.equals(customer.middleName)) return false;
        if (!address.equals(customer.address)) return false;
        return bankAccountNumber.equals(customer.bankAccountNumber);
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + middleName.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + (int) (creditCardNumber ^ (creditCardNumber >>> 32));
        result = 31 * result + bankAccountNumber.hashCode();
        return result;
    }

}

