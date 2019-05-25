package com.directi.training.codesmells.duplicatecode.acrossclasses;

import java.io.IOException;
import java.io.OutputStream;

public class LoginCommand extends AbstractWriter {

    private final String _username;
    private final String _password;

    public LoginCommand(String username, String password) {
        _username = username;
        _password = password;
    }

    @Override
    public void writeLength(OutputStream outputStream) throws IOException {
        outputStream.write(getTotalLength(_username.getBytes(), _password.getBytes()));
    }

    @Override
    public void write(OutputStream outputStream) throws IOException {
        writeRequestHeader(outputStream);
        writeBody(outputStream, _username.getBytes(), _password.getBytes());
        writeFooter(outputStream);
    }
}
