package lesson_13;

public class Test2 {
    public static void main(String[] args) {
        Student st2 = new Student(5);


        switch ((int) st2.grade){
            case 2:
                System.out.println("Студент двоечник");
                break;
            case 3:
                System.out.println("Студент троечник");
                break;
            case 4:
                System.out.println("Студент ударник");
                break;
            case 5:
                System.out.println("Студент отличник");
        }
    }

}
