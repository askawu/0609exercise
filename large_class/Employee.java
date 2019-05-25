package com.directi.training.codesmells.largeclass;

public class Employee {

    private final String _name;
    private final Telephone _telephone;

    public Employee(String name, String officeAreaCode, String officeNumber, String officeExtensionNumber) {
        _name = name;
        _telephone = new Telephone(officeAreaCode, officeNumber, officeExtensionNumber);
    }

    public String getName() {
        return _name;
    }

    public String getTelephone() {
        return _telephone.toString();
    }
}
