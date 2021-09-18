package lesson_5;

public class Employee {

    int id;

    String surname;

    int age;

    double salary;

    String departament;

    public Employee(int id, String surname, int age, double salary, String departament) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.departament = departament;
    }


    double raisingSalary(double salary){
        return salary *= 2;
    }
}
