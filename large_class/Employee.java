package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;
    private final Telephone _telephoneNum
    public Employee(String name, Telephone telephoneNumber)
    {
        _name = name;
        _telephone = telephoneNumber;
    }

    public String getName()
    {
        return _name;
    }

    public String getTelephone()
    {
	return _telephoneNum;
    }

}

public class Telephone
{
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public String getTelephoneNumber(String officeAreaCode, String officeNumber, 
		    String officeExtensionNumber)
    {
	_officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
    }
    public String ShowTelephone()
    {
	     return "(" + officeAreaCode + ")" + officeNumber + "-" +  officeExtensionNumber;
    }

}


