package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;

    public Employee(String name, Telephone myTelephone)
    {
        _name = name;
        myTelephone();
    }

    public String getName()
    {
        return _name;
    }
}