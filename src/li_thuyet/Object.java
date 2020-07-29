package li_thuyet;

import java.io.*;

public class Object {
    void writeObjectFile(String path, Student student) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
    }

    Student readObjectFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        return student;
    }

    public static void main(String[] args) {
        Object objectFile = new Object();
        final String PATH = "student.txt";
        try {
            objectFile.writeObjectFile(PATH, new Student(1, "linh", "HN"));
            Student student = objectFile.readObjectFile(PATH);
            System.out.println(student);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}


