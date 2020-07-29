package li_thuyet;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws EOFException {
        ListStudent listStudent = new ListStudent();
        final String PATH = "studentList.txt";

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Trung", "HP"));
        students.add(new Student(2, "Binh", "HN"));
        students.add(new Student(3, "Dung", "DN"));
        List<Student> studentList = new ArrayList<>();
        try {
            listStudent.writeFile(PATH, students);
            studentList = ListStudent.readFile(PATH);

        } catch (EOFException e) {
            throw new EOFException();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

