package com.directi.training.codesmells.featureenvy;

public class Customer {

    private final String _name;
    private final Address _currentAddress;

    public Customer(String name, Address address) {
        _name = name;
        _currentAddress = address;
    }
}
