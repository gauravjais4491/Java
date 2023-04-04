import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.FileChannel;

//DataTransferDemo
public class Fifty {
    public static void main(String[] shruti) throws Exception {
        String[] iF = new String[] { "D:\\ABC.txt", "D:\\XYZ.txt", "D:\\PQR.txt", "D:\\TUS.txt" };
        String oF = "D:\\Shruti.txt";
        FileOutputStream output = new FileOutputStream(new File(oF));
        WritableByteChannel targetChannel = output.getChannel();
        for (int j = 0; j < iF.length; j++) {
            FileInputStream input = new FileInputStream(iF[j]);
            FileChannel inputChannel = input.getChannel();
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);
            inputChannel.close();
            input.close();
        }

        targetChannel.close();
        output.close();
    }
}