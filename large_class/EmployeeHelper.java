package com.directi.training.codesmells.largeclass;

public class EmployeeHelper {

    private final Employee employee;

    public EmployeeHelper(Employee employee) {
        this.employee = employee;
    }

    public String getTelephoneNumber() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(employee.getOfficeAreaCode()).append(")").append(employee.getOfficeNumber()).append("-").append(employee.getOfficeExtensionNumber());
        return sb.toString();
    }
}
