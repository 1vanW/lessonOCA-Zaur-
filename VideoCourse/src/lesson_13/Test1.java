package lesson_13;

public class Test1 {


}
class Student{
     public double grade;

    public Student(double grade){
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);

        if(st1.grade == 2){
            System.out.println("Студент двоечник");
        }
        else if(st1.grade == 3){
            System.out.println("Студент троечник ");
        }
        else if(st1.grade == 4){
            System.out.println("Студент ударник");
        }
        else if(st1.grade== 5){
            System.out.println("Студент отличник");
        }
        else{
            System.out.println("Ошибка оценки");
        }




    }
}