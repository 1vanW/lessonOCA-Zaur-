package lesson_12;
import lesson_11.*;

public class Test10 {



    public static void methodOne(Student s1, Student s2){
        // этот метод сравнивает студентов по ссылкам
        if(s1 == s2 ){
            System.out.println("Это один тот же объект");
        }
        else {
            System.out.println("Это 2 разных объекта ");
        }
    }

    public static void methodTwo(Student s1, Student s2){
        // этот метод сравнивает двух студентов по содержимому класса
        if (s1.name.equals(s2.name) && (s1.course == s2.course) && (s1.greade == s2.greade)) {

                    System.out.println("Это один и тот же студент");

            }


        else{
            System.out.println("Это 2 разных студента");
        }
    }



    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3,9.5);
        Student st2 = new Student("Anna",1,5.2);
        Student st3 = new Student("Anna",1,5.2);
        Student st4 = st1;

        methodOne(st1,st2);

        methodOne(st1,st4);

        methodTwo(st3,st2);

    }

}
