package lesson_4;

public class StudentTest {

    public static void main(String[] args) {
        Student ivan = new Student();

        ivan.name = "ivan";

        ivan.avarageLanguage = 4.2;
        ivan.averageEconomy = 3.9;
        ivan.averageMath = 4.8;

        ivan.getAveragePoints(ivan);





        Student anna = new Student();

        anna.averageMath = 3.3;
        anna.averageEconomy = 3.5;
        anna.avarageLanguage = 4.9;

        anna.getAveragePoints(anna);

        Student max = new Student();



        max.avarageLanguage = 3.1;
        max.averageMath = 4.0;
        max.averageEconomy = 4.8;






    }
}
