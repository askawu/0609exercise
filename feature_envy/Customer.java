package com.directi.training.codesmells.featureenvy;

public class Customer
{
    private String _name;
    public  String printAddress;
    private Address _currentAddress;

    public Customer(String name, Address address)
    {
        _name = name;
        _currentAddress = address;
        printAddress = System.out.println(
            _currentAddress.getAddressLine1() + "\n" + _currentAddress.getAddressLine2() + "\n" +
            _currentAddress.getCity() + ", " + _currentAddress.getState() + "\n" +
            _currentAddress.getPostalCode());


    }

    public void printAddress()
    {

    }

    //other methods related to customer class.....

}
