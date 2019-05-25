package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;
    private final String _telephoneNumber;

    public Employee(String name, String officeAreaCode, String officeNumber,
                    String officeExtensionNumber, String telephoneNumber)
    {
        _name = name;
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
	_telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber()
    {
        tele = new Telephone();
	_telephoneNumber = tele.stringNumber();
    }

    public String getName()
    {
        return _name;
    }
}

public class Telephone
{
	private final _AreaCode;
	private final _officeNumber;
	private final _ExtensionNumber;

    public stringNumber()
    {
	    return "(" + _AreaCode + ") " + _officeNumber + "-" + _ExtensionNumber;
    }

}
