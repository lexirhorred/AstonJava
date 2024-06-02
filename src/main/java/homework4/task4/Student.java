package homework4.task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final HashMap<String, Byte> subGrades;

    public Student(String name, String group, int course, int mathGrade, int rusLanguageGrade, int astronomyGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subGrades = new HashMap<>() {{
            put("Math", (byte) mathGrade);
            put("Russian language", (byte) rusLanguageGrade);
            put("Astronomic", (byte) astronomyGrade);
        }};
    }

    public String getName() {
        return this.name;
    }

    public String getGroup() {
        return this.group;
    }

    public int getCourse() {
        return this.course;
    }

    public HashMap<String, Byte> getSubGrades() {
        return this.subGrades;
    }

    public void incCourse() {
        this.course += 1;
    }

    public double avgStudentGrade() {
        double avg = 0;
        for (Map.Entry<String, Byte> entry : subGrades.entrySet()) {
            avg += entry.getValue();
        }

        return avg /= subGrades.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.name.equals(student.getName()) &&
                this.group.equals(student.getGroup()) &&
                this.course == student.getCourse();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.group, this.course);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ". Group: " + this.group + " . Course: " + this.course + ".";
    }
}
