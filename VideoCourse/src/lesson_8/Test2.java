package lesson_8;

public class Test2 {
    public static final double Pi = 3.14;

    public double circle(double R){

        return Pi * R * R;

    }

    public static double Okr(double R){
        return 2 * Pi * R;
    }

    public void RadiusInfo(double R){
        System.out.println("Radius " + R + " " +" Ploshad okrj " + Okr(R) + " " + circle(R));
    }

    public static void main(String[] args) {
        double ot = Test2.Okr(2);
        System.out.println(ot);
        Test2 test2 = new Test2();

        test2.RadiusInfo(2);
        double ot2 = test2.circle(2);

        System.out.println(ot2);


    }
}
