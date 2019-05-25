package com.directi.training.codesmells.duplicatecode.acrossclasses;

import duplicate_code.acrossclasses.AbstractWriter;
import java.io.OutputStream;

public class LoginCommand extends AbstractWriter {

    private String _username;
    private String _password;

    public LoginCommand(String username, String password) {
        _username = username;
        _password = password;
    }

    @Override
    public void writeLength(OutputStream outputStream) throws Exception {
        outputStream.write(getUniversalLength() + _username.getBytes().length + 1 + _password.getBytes().length + 1);
    }

    @Override
    public void write(OutputStream outputStream) throws Exception {
        outputStream.write(header);
        writeLength(outputStream);
        outputStream.write(commandChar);
        writeValueEnd(outputStream, _username.getBytes());
        writeValueEnd(outputStream, _password.getBytes());
        outputStream.write(footer);
    }
}
