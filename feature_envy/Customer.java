package com.directi.training.codesmells.featureenvy;

public class Customer
{
    private String _name;
    private Address _currentAddress;

    public Customer(String name, Address address)
    {
        _name = name;
        _currentAddress = address;
    }

    public void printAddress()
    {
        _currentAddress.printAddressLine1() + "\n" + _currentAddress.printAddressLine2() + "\n" +
        _currentAddress.printCity() + ", " + _currentAddress.printState() + "\n" +
        _currentAddress.printPostalCode();
    }

    //other methods related to customer class.....

}
