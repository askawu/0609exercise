package com.directi.training.codesmells.largeclass;

public class Telephone {

    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public Telephone(String officeAreaCode, String officeNumber, String officeExtensionNumber) {
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
    }

    public String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    public String getOfficeNumber() {
        return _officeNumber;
    }

    public String getOfficeExtensionNumber() {
        return _officeExtensionNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(getOfficeAreaCode()).append(")").append(getOfficeNumber()).append("-").append(getOfficeExtensionNumber());
        return sb.toString();
    }
}
