package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private Office _office;

    public Employee(String name)
    {
        _name = name;
        _office = new Office();
    }

    public String getTelephoneNumber()
    {
        return _office.getTelephoneNumber();
    }

    public String getName()
    {
        return _name;
    }

    public void setOffice(Office office) 
    {
        _office = office;
    }

    public Office getOffice()
    {
        return _office;
    }
}