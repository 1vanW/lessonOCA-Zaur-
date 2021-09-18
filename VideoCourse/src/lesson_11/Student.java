package lesson_11;

public class Student {
    public String name;
   public int course;
   public double greade;

    public Student(String name, int course, double great) {
        this.name = name;
        this.course = course;
        this.greade = great;
    }



    public static void swap(Student a, Student b){
        Student c = a;
        a = b;
        b = c;

        System.out.println(a.name);
        System.out.println(b.name);

    } // здесь имя не меняется

    public static void changeName(Student s1){
        s1.name = "Василий";
    } // имя меняется

    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3,9.5);
        Student st2 = new Student("Anna",1,5.2);
        Student st3 = new Student("Anna",1,5.2);
        Student st4 = st1;

//        swap(st1,st2);
////
////        System.out.println(st1.name);
////        System.out.println(st2.name);
//
//        changeName(st2);
//        System.out.println(st2.name);





    }

}
