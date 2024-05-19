package homework2.task2;

import java.util.ArrayList;
import java.util.List;

public class MutablePerson {
    private String name;
    private int age;
    private List<String> hobbies;

    public MutablePerson(String name, int age, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public List<String> getHobbies() {
        return this.hobbies;
    }
}
