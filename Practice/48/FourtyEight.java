import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

//iodemo
class FourtyEight {
    public static void main(String shruti[]) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\shruti.txt");
        ReadableByteChannel source = fis.getChannel();
        FileOutputStream fos = new FileOutputStream("D:\\jai.txt");
        WritableByteChannel destination = fos.getChannel();
        copyData(source, destination);
        source.close();
        destination.close();
    }

    private static void copyData(ReadableByteChannel src, WritableByteChannel dest)

            throws IOException {
        ByteBuffer buf = ByteBuffer.allocateDirect(20 * 1024);
        while (src.read(buf) != -1) {
            buf.flip();
            while (buf.hasRemaining()) {
                dest.write(buf);
            }
            buf.clear();
        }
    }
}