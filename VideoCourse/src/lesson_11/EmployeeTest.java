package lesson_11;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan",100.55);

        double sum = emp1.uvelichenie(emp1.salary);

        System.out.println(sum);
        System.out.println(emp1.salary);



    }
}
