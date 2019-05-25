package com.directi.training.codesmells.largeclass;

public class Telephone
{
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public Employee(String telephone)
    {
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
    }

    public String outputTelephoneNumber()
    {
        return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }
}