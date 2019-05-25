package com.directi.training.codesmells.duplicatecode.acrossclasses;

import java.io.OutputStream;

public class Command
{
    protected static final byte[] header = {(byte) 0xde, (byte) 0xad};
    protected static final byte[] commandChar = {0x01};
    protected static final byte[] footer = {(byte) 0xbe, (byte) 0xef};
    protected static final int SIZE_LENGTH = 1;
    protected static final int CMD_BYTE_LENGTH = 1;

    public Command()
    {
    }

    public void write(OutputStream outputStream, String ...param) throws Exception
    {
        outputStream.write(header);
        // calculate and write content size
        int size = header.length + SIZE_LENGTH + CMD_BYTE_LENGTH + footer.length;

        for(String param : params){
            size += params.getBytes().length + 1;
        }

        outputStream.write(size)
        outputStream.write(commandChar);
        
        for(String param : params){
            outputStream.write(params.getBytes());
            outputStream.write(0x00);
        }

        outputStream.write(footer);

    }
}
