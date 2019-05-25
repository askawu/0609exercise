package com.directi.training.codesmells.duplicatecode.acrossclasses;

import java.io.IOException;
import java.io.OutputStream;

public class AddEmployeeCmd extends AbstractCommand {

    private final String _name;
    private final String _address;
    private final String _city;
    private final String _state;
    private final String _annualSalary;

    public AddEmployeeCmd(String name, String address, String city, String state, String annualSalary) {
        _name = name;
        _address = address;
        _city = city;
        _state = state;
        _annualSalary = annualSalary;
    }

    @Override
    public void writeLength(OutputStream outputStream) throws IOException {
        outputStream.write(getTotalLength(_name.getBytes(), _address.getBytes(), _city.getBytes(), _state.getBytes(), _annualSalary.getBytes()));
    }

    @Override
    public void write(OutputStream outputStream) throws IOException {
        writeRequestHeader(outputStream);
        writeBody(outputStream, _name.getBytes(), _address.getBytes(), _city.getBytes(), _state.getBytes(), _annualSalary.getBytes());
        writeFooter(outputStream);
    }
}
