package pckg_read_write;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class NoHeaderObjectOutputStream extends ObjectOutputStream {
    public NoHeaderObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}