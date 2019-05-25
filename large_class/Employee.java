package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    

    public Employee(String name)
    {
        _name = name;
        
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
	public TelephoneNumber(String _officeAreaCode,String _officeNumber,String _officeExtensionNumber)
	{
		_officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
	}
	
	 public String getTelephoneNumber()
    {
        return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }
	
	
	
	
}