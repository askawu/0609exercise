package com.directi.training.codesmells.largeclass;

public class Telephone
{
    private final String _officeAreaCode;
    private final String _phoneNumber;
    private final String _officeExtensionNumber;

    public Telephone(String officeAreaCode, String officeNumber,
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