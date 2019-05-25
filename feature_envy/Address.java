package com.directi.training.codesmells.featureenvy;

public class Address
{

    private String _addressLine1;
    private String _addressLine2;
    private String _city;
    private String _state;
    private String _country;
    private String _postalCode;

    public Address(String addressLine1, String addressLine2, String city, String state,
                   String country, String postalCode)
    {
        _addressLine1 = addressLine1;
        _addressLine2 = addressLine2;
        _city = city;
        _state = state;
        _country = country;
        _postalCode = postalCode;
    }

    public String printAddressLine1()
    {
        System.out.println(_addressLine1);
    }

    public String printAddressLine2()
    {
        System.out.println(_addressLine2);
    }

    public String printCity()
    {
        System.out.println(_city);
    }

    public String printState()
    {
        System.out.println(_state);
    }

    public String printCountry()
    {
        System.out.println(_country);
    }

    public String printPostalCode()
    {
        System.out.println(_postalCode);
    }
}
