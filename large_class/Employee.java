package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    /*private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;*/
    private final TelephoneNumber _telephoneNumber;

    /*public Employee(String name, String officeAreaCode, String officeNumber,
                    String officeExtensionNumber)*/
    public Employee(String name,TelephoneNumber telephoneNumber)
    {
        _name = name;
        /*_officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;*/
	_telephoneNumber = telephoneNumber;
    }

    /*public String getTelephoneNumber()*/
    public TelephoneNumber getTelephoneNumber
    {
        /*return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;*/
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
    public TelephoneNumber(String officeAreaCode,String officeNumber,String officeExtensionNumber)
    {

	_officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
    }
    @override
    public String toString()
    {
       return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }

}

