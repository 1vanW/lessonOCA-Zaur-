package lesson_8;

public class Test {
    public int a = 10;
    public static int proizvedenie(int a, int b , int c){


        return a * b * c;

    }

    public static void delenie(int a , int b ){
        int sum = a/b;
        System.out.println("Частное  = " + sum + " Остаток " + a%b );
    }








    public static void main(String[] args) {

        System.out.println(proizvedenie(10,10,10));

        delenie(10,8);


        System.out.println(proizvedenie(2,10,3));

        delenie(10,4);


    }
}
