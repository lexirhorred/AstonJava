package homework5.task2;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = createEmployeeList(
                new Employee("Andrey", 29, "IT", 200000),
                new Employee("Jack", 31, "IT", 300000),
                new Employee("Yuryi", 40, "Finance", 130000),
                new Employee("Kirill", 25, "Finance", 90000),
                new Employee("Irina",23, "HR", 80000),
                new Employee("Victoria", 45, "HR", 120000),
                new Employee("Veronika", 25, "Marketing", 60000),
                new Employee("Konstantin", 45, "Marketing", 180000));

        List<Employee> newList = getEmployeesOver30YearsOld(list);
        newList.forEach(System.out::println);
        System.out.println();

        System.out.println("Numbers of employees from the 'IT' department: " + countEmployeesFromTheDepartment(list, "IT"));

        Optional<Employee> maxSalaryEmployee = getEmployeeWithMaxSalary(list);
        maxSalaryEmployee.ifPresent(emp -> System.out.println("Employee with max salary: " + emp));

        System.out.println("Names of employees from the department 'HR': " + getEmployeesNamesFromTheDepartment(list, "HR"));

        OptionalDouble avgSalary = avgEmployeesSalary(list);
        avgSalary.ifPresent(avg -> System.out.println("Average salary: " + avg));
    }

    public static List<Employee> createEmployeeList(Employee... emp) {
        return Stream.of(emp).toList();
    }

    public static List<Employee> getEmployeesOver30YearsOld(List<Employee> list) {
        Stream<Employee> stream = list.stream();
//        return stream.filter(x -> x.getAge() > 30).sorted((emp1, emp2) -> Integer.compare(emp1.getAge(), emp2.getAge())).toList();
        return stream.filter(emp -> emp.getAge() > 30).sorted(Comparator.comparingInt(Employee::getAge)).toList();
    }

    public static long countEmployeesFromTheDepartment(List<Employee> list, String department) {
        Stream<Employee> stream = list.stream();
        return stream.filter(emp -> emp.getDepartment().equals(department)).count();
    }

    public static Optional<Employee> getEmployeeWithMaxSalary(List<Employee> list) {
        return list.stream().max(Comparator.comparingDouble(Employee::getSalary));
    }

    public static List<String> getEmployeesNamesFromTheDepartment(List<Employee> list, String department) {
        return list.stream().filter(emp -> emp.getDepartment().equals(department)).map(Employee::getName).sorted().toList();
    }

    public static OptionalDouble avgEmployeesSalary(List<Employee> list) {
        return list.stream().mapToDouble(Employee::getSalary).average();
    }
}
