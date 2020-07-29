package copy_file_nhi_phan;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {

        InputStream inputStream = new BufferedInputStream(new FileInputStream(new File("data/dest.txt")));
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File("data/src.txt")));

        int read = 0;
        int count = 0;

        while ((read = inputStream.read()) != -1) {
            outputStream.write(read);
            count++;
        }
        outputStream.close();
        System.out.println(count);

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
