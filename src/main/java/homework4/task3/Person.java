package homework4.task3;


import java.util.Objects;

class Person {
    private final String firstName;
    private final String lastName;

    public Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person p = (Person) o;
//            return Objects.equals(firstName, p.firstName) && Objects.equals(lastName, p.lastName);
        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}