package com.directi.training.codesmells.duplicatecode.acrossclasses;

import duplicate_code.acrossclasses.AbstractWriter;
import java.io.OutputStream;

public class AddEmployeeCmd extends AbstractWriter {

    private String _name;
    private String _address;
    private String _city;
    private String _state;
    private String _annualSalary;

    public AddEmployeeCmd(String name, String address, String city, String state, String annualSalary) {
        _name = name;
        _address = address;
        _city = city;
        _state = state;
        _annualSalary = annualSalary;
    }

    @Override
    public void writeLength(OutputStream outputStream) throws Exception {
        outputStream.write(getUniversalLength() + _name.getBytes().length + 1 + _address.getBytes().length + 1 + _city.getBytes().length + 1 + _state.getBytes().length + 1 + _annualSalary.getBytes().length + 1);
    }

    @Override
    public void write(OutputStream outputStream) throws Exception {
        outputStream.write(header);
        writeLength(outputStream);
        outputStream.write(commandChar);
        writeValueEnd(outputStream, _name.getBytes());
        writeValueEnd(outputStream, _address.getBytes());
        writeValueEnd(outputStream, _city.getBytes());
        writeValueEnd(outputStream, _state.getBytes());
        writeValueEnd(outputStream, _annualSalary.getBytes());
        outputStream.write(footer);
    }
}
