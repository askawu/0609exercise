package com.directi.training.codesmells.largeclass;

public class Employee extends Telephone
{
    private final String _name;
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;
	private final String _Telephone

    public Employee(String name, String officeAreaCode, String officeNumber,
                    String officeExtensionNumber)
    {
        _name = name;
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
		_Telephone = super(officeAreaCode, officeNumber, officeExtensionNumber);
    }
    
    public String getName()
    {
        return _name;
    }
}


public class Telephone
{
	public Telephone(){}
	
	public Telephone(String officeAreaCode, String officeNumber, String officeExtensionNumber)
	{
		return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
	}
}