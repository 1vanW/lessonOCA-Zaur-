package lesson_4;

public class Student {

    int numberTicket;

    String name;

    int yearOfStudy;

    double averageMath;

    double averageEconomy;

    double avarageLanguage;


    public double getAveragePoints(Student st){

        double ocenka = (st.avarageLanguage + st.averageMath + st.averageEconomy)/3;

        System.out.println("Средняя оценка студента(ки) " + st.name +" " + ocenka);

        return ocenka;
    }





}
