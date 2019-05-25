package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;
    private final String _TelephoneNumber;

    public Employee(String name, String officeAreaCode, String officeNumber,
                    String officeExtensionNumber)
    {
        _name = name;
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
        _TelephoneNumber = "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }
    public String getName()
    {
        return _name;
    }
}
