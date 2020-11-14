package com.directi.training.codesmells.largeclass;

class PhoneNumber {
    private String officeAreaCode;
    private String officeNumber;
    private String officeExtensionNumber;
    
    public String toString()
    {
        return "(" + officeAreaCode + ") " + officeNumber + "-" + officeExtensionNumber;
    }
}

public class Employee
{
    private final String _name;
    private PhoneNumber _phone;

    public Employee(String name, PhoneNumber phone)
    {
        _name = name;
        _phone = phone;
    }

    public String getTelephoneNumber()
    {
        return _phone.toString();
    }

    public String getName()
    {
        return _name;
    }
}
