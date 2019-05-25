package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public Employee(String name,Telephone MyTelephone)
    {
        _name = name;
      
    }
	
    public String getTelephoneNumber()
    {
        return MyTelephone.TelephoneNumber()
    }

    public String getName()
    {
        return _name;
    }
}
public class Telephone
{
	private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;
	public String TelephoneNumber()
    {
        return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }
}