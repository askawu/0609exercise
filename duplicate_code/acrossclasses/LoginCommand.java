package com.directi.training.codesmells.duplicatecode.acrossclasses;

import java.io.OutputStream;

public class LoginCommand extends Command
{
    private String _username;
    private String _password;

    public LoginCommand(String username, String password)
    {
        _username = username;
        _password = password;
    }

    public void write(OutputStream outputStream) throws Exception
    {
        super().write(outputStream, _username, _password);
    }
}
