package com.directi.training.codesmells.duplicatecode.acrossclasses;

import java.io.OutputStream;

public interface Command {

    byte[] header = {(byte) 0xde, (byte) 0xad};
    byte[] commandChar = {0x01};
    byte[] footer = {(byte) 0xbe, (byte) 0xef};
    int SIZE_LENGTH = 1;
    int CMD_BYTE_LENGTH = 1;

    void writeLength(OutputStream outputStream) throws Exception;

    void write(OutputStream outputStream) throws Exception;
}
