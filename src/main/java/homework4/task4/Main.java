package homework4.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Ivan", "IT-31", 3, 4, 5, 4));
        students.add(new Student("Olya", "PI-21", 2, 3, 4, 4));
        students.add(new Student("Andrey", "MR-41", 4, 3, 2, 3));
        students.add(new Student("Valya", "IT-21", 3, 4, 4, 4));
        students.add(new Student("Yaroslav", "PI-11", 1, 5, 5, 5));
        students.add(new Student("Igor", "MR-11", 1, 2, 3, 2));

        printStudents(students, 3);
        checkStudentsGrades(students);
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void checkStudentsGrades(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.avgStudentGrade() < 3) {
                iterator.remove();
            } else {
                student.incCourse();
            }
        }
    }
}
