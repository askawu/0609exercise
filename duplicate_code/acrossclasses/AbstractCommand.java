package com.directi.training.codesmells.duplicatecode.acrossclasses;

import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractCommand implements Command {

    public void writeValueEnd(OutputStream outputStream, byte[] data) throws IOException {
        outputStream.write(data);
        outputStream.write(0x00);
    }

    public int getUniversalLength() {
        return header.length + SIZE_LENGTH + CMD_BYTE_LENGTH + footer.length;
    }

    public int getTotalLength(byte[]... data) {
        int dataLength = 0;
        for (int i = 0; i < data.length; ++i) {
            dataLength += data[i].length + 1;
        }
        return getUniversalLength() + dataLength;
    }

    public void writeBody(OutputStream outputStream, byte[]... data) throws IOException {
        for (int i = 0; i < data.length; ++i) {
            writeValueEnd(outputStream, data[i]);
        }
    }

    public void writeRequestHeader(OutputStream outputStream) throws IOException {
        outputStream.write(header);
        writeLength(outputStream);
        outputStream.write(commandChar);
    }

    public void writeFooter(OutputStream outputStream) throws IOException {
        outputStream.write(footer);
    }
}
