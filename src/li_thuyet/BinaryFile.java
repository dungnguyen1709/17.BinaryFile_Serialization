package li_thuyet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
    void writeBinaryFile(String path) throws IOException {
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        int data = 10;
        fileOutputStream.write(data);
        fileOutputStream.close();
    }
    public static void main(String[] args) {
        BinaryFile binaryFile = new BinaryFile();
        final String PATH = "test.dat";
        try {
            binaryFile.writeBinaryFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
