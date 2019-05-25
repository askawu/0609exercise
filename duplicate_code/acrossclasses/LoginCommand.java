package com.directi.training.codesmells.duplicatecode.acrossclasses;

import java.io.OutputStream;

public class LoginCommand
{
    protected static final byte[] header = {(byte) 0xde, (byte) 0xad};
    protected static final byte[] commandChar = {0x01};
    protected static final byte[] footer = {(byte) 0xbe, (byte) 0xef};
    protected static final int SIZE_LENGTH = 1;
    protected static final int CMD_BYTE_LENGTH = 1;
    private String _username;
    private String _password;

    public LoginCommand(String username, String password)
    {
        _username = username;
        _password = password;
    }
    
    public void writeOutputStream(string data,OutputStream outputStream)
    {
        outputStream.write(data.getBytes());
        outputStream.write(0x00);
    }

    public void write(OutputStream outputStream) throws Exception
    {
        outputStream.write(header);
        // calculate and write content size
        outputStream.write((header.length + SIZE_LENGTH + CMD_BYTE_LENGTH + footer.length +
                            _username.getBytes().length + 1 + _password.getBytes().length + 1));
        outputStream.write(commandChar);
        writeOutputStream(_username)
        writeOutputStream(_password)

        outputStream.write(footer);

    }
}