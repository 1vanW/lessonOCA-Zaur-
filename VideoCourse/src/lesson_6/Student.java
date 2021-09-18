package lesson_6;

public class Student {
    int id;
    String name;
    String surname;
    int course;

    Student(int id1, String name1, String surname1, int course1){
        id = id1;
        name =name1;
        surname = surname1;
        course = course1;

    }
    Student(String name1, String surname1, int course1){
        this(0,name1,surname1,course1);
    }

    Student(){

    }

}
