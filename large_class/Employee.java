package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;
    private final Telephone _telephone;

    public Employee(String name, String officeAreaCode, String officeNumber,
                    String officeExtensionNumber)
    {
        _name = name;
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
	_telephone = new Telephone();
	_telephone(officeAreaCode, officeNumber, officeExtensionNumber)
    }

    public String printTelephoneNumber()
    {
        _telephone.outputTelephoneNumber();
    }

    public String getName()
    {
        return _name;
    }
}