package com.directi.training.codesmells.duplicatecode.acrossclasses;

import java.io.OutputStream;

public class AddEmployeeCmd
{
    protected static final byte[] header = {(byte) 0xde, (byte) 0xad};
    protected static final byte[] commandChar = {0x01};
    protected static final byte[] footer = {(byte) 0xbe, (byte) 0xef};
    protected static final int SIZE_LENGTH = 1;
    protected static final int CMD_BYTE_LENGTH = 1;
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
    
    public void writeOutputStream(string data,OutputStream outputStream)
    {
        outputStream.write(data.getBytes());
        outputStream.write(0x00);
    }

    public void write(OutputStream outputStream) throws Exception
    {
        outputStream.write(header);
        // calculate and write size of the content
        outputStream.write((header.length + SIZE_LENGTH + CMD_BYTE_LENGTH + footer.length +
                            _name.getBytes().length + 1 + _address.getBytes().length + 1 +
                            _city.getBytes().length + 1 + _state.getBytes().length + 1 +
                            _annualSalary.getBytes().length + 1));
        outputStream.write(commandChar);

        writeOutputStream(_name);
        writeOutputStream(_address);
        writeOutputStream(_city);
        writeOutputStream(_state);
        writeOutputStream(_annualSalary);

        outputStream.write(footer);
    }

}
