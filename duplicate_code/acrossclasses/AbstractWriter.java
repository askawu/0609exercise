package duplicate_code.acrossclasses;

import com.directi.training.codesmells.duplicatecode.acrossclasses.Command;
import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractWriter implements Command {

    public void writeValueEnd(OutputStream outputStream, byte[] data) throws IOException {
        outputStream.write(data);
        outputStream.write(0x00);
    }

    public int getUniversalLength() {
        return header.length + SIZE_LENGTH + CMD_BYTE_LENGTH + footer.length;
    }
}
