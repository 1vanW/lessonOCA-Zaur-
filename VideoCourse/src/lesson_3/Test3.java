package lesson_3;

public class Test3 {
    public static void main(String[] args) {

        int i1 = 5;

        int i2 = 11;

        double d1 = 5.5;

        double d2 = 1.3;

        long l = 20L;

        double result = 0;

        result = i2/d1 + d2 % i1 - l;

        System.out.println(result); // -16.7


        int a = 5 ;
        int b = 8;


        int res1 = a-- - --a + ++a + a++ +a;

        int res2 = ++b - b++ + ++b - --b;

        System.out.println(res1);
        System.out.println(res2);






















    }
}
