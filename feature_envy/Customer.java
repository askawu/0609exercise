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
        return _currentAddress.show();
    }

    //other methods related to customer class.....

}
