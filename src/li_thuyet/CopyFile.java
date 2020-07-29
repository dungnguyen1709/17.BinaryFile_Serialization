package li_thuyet;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println(("Please provide input and output files"));
            System.exit(0);
        }

        String is = args[0];
        String os = args[1];

        try {
            InputStream inputStream = new FileInputStream(is);
            OutputStream outputStream = new FileOutputStream(os);

            int byteRead;
            while ((byteRead = inputStream.read()) != -1 ) {
                outputStream.write(byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
