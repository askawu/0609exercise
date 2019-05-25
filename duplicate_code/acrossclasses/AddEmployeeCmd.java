package com.directi.training.codesmells.duplicatecode.acrossclasses;

import java.io.OutputStream;

public class AddEmployeeCmd extends Command
{
    private String _name;
    private String _address;
    private String _city;
    private String _state;
    private String _annualSalary;

    public AddEmployeeCmd(String name, String address, String city, String state,
                          String annualSalary)
    {
        _name = name;
        _address = address;
        _city = city;
        _state = state;
        _annualSalary = annualSalary;
    }

    public void write(OutputStream outputStream) throws Exception
    {
        super.write(outputStream, _name, _address, _city, _state, _annualSalary);
    }

}
