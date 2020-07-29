package li_thuyet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListStudent {
    List<Student> students = new ArrayList<>();

    void writeFile(String path, List<Student> students) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (Student student : students) {
            objectOutputStream.writeObject(student);
        }
    }

    static List<Student> readFile(String path) throws IOException, ClassNotFoundException, EOFException {
        List<Student> students = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = null;
        try {
            while ((student = (Student) objectInputStream.readObject()) != null) {
                System.out.println(student);
                students.add(student);
            }
        } catch (EOFException ex) {
            System.out.println("End of file");
        }
        return students;
    }
}


