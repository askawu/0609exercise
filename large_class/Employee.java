package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final TelephoneNumber _telephoneNumber;

    public Employee(String name, TelephoneNumber telephoneNumber)
    {
        _name = name;
        _telephoneNumber = telephoneNumber;
    }

    public TelephoneNumber getTelephoneNumber()
    {
	return _telephoneNumber;
    }


    public String getName()
    {
        return _name;
    }
}

public class TelephoneNumber
{
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public TelephoneNumber(String officeAreaCode, String officeNumber, String officeExtensionNumber)
    {
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
    }

    @override
    public String toString()
    {
        return "(" + officeAreaCode + ") " + officeNumber + "-" + officeExtensionNumber;
    }

}
