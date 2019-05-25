package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final Employee_officephone _telephone;
    //private final String _officeAreaCode;
    //private final String _officeNumber;
    //private final String _officeExtensionNumber;

    public Employee(String name, Employee_officephone phone)
    {
        _name = name;
	_telephone = phone
        //_officeAreaCode = officeAreaCode;
        //_officeNumber = officeNumber;
        //_officeExtensionNumber = officeExtensionNumber;
    }

    public Employee_officephone getTelephoneNumber()
    {
        return _telephone;
    }

    public String getName()
    {
        return _name;
    }
}


public class Employee_officephone
{
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public Employee_officephone(String officeAreaCode, String officeNumber,
                    String officeExtensionNumber)
    {
         _officeAreaCode = officeAreaCode;
         _officeNumber = officeNumber;
         _officeExtensionNumber = officeExtensionNumber;
    }

    public String toString()
    {
        return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }

}
