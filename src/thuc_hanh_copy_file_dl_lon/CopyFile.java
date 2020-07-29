package thuc_hanh_copy_file_dl_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        File srcFile = new File("data/src.txt");
        File destFile = new File("data/dest.txt");
        copyFileUsingStream(srcFile,destFile);

    }
    private static void copyFileUsingStream(File srcFile, File destFile) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(srcFile);
            os = new FileOutputStream(destFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer,0,length);
            }
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }
    private static void copyFileUsingJava7Files(File src, File dest) throws IOException {
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
}
