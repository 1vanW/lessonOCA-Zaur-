package lesson_7_1;

import lesson_7.Employ;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employ emp1 = new Employ("Ivanov",2);
        Employ emp2 = new Employ(500,"Petrov",1);
        Employ emp3 = new Employ(200,"Sidorov",4);

        emp1.showSalary();
        emp2.showSalary();
        emp3.showSalary();

        emp1.showId();
        emp2.showId();
        emp3.showId();

        emp1.showSurname();
        emp2.showSurname();
        emp3.showSurname();
    }
}
