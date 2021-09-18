package lesson_5;

public class testMethod {

    int sum(int a, int b, int c){

        int result = a + b + c;

        return result;
    }



    public static void main(String[] args) {
        testMethod testMethod = new testMethod();

        int treeInt = testMethod.sum(20,30,50);

        System.out.println(treeInt);
    }
}
