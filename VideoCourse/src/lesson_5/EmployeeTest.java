package lesson_5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Петров",40, 150,"Office");

        Employee e2 = new Employee(2,"Сидоров",25,120,"logistick");

        double salaryIndexe1 = e1.raisingSalary(e1.salary);
        System.out.println(salaryIndexe1);

        double salaryIndexe2 = e2.raisingSalary(e2.salary);

        System.out.println(salaryIndexe2);
    }
}
