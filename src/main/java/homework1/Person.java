package homework1;

public class Person {
    static int totalMen;
    static int totalWomen;
    private final String gender;
    private String name;
    int age;

    static {
        totalMen++;
        totalWomen++;
    }

    public Person(String name, int age) {
        gender = "Мужской";
        this.name = name;
        this.age = age;
    }
    public Person(String gender, String name, int age) {
        this.gender = gender;
        if (this.gender.equals("Мужской")) {
            totalMen++;
        } else {
            totalWomen++;
        }
        this.name = name;
        this.age = age;
    }

    public void setFields(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
    }

    public void setFields(String name, int age) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }

        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля.");
        }
    }

    @Override
    public String toString() {
        return "Имя: " + this.name +
                ". Пол: " + gender +
                ". Возраст: " + age;
    }
}
