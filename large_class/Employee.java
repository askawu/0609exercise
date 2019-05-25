package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    public Employee(String name, String officeAreaCode)
    {
        _name = name;
    }
    public String getName()
    {
        return _name;
    }
}
