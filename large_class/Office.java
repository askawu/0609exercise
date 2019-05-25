package com.directi.training.codesmells.largeclass;

public class Office
{
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public Office() 
    {
        _officeAreaCode = '';
        _officeNumber = '';
        _officeExtensionNumber = '';    
    }

    public Office(String officeAreaCode, 
                  String officeNumber,
                  String officeExtensionNumber)
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