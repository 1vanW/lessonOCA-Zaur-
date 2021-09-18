package lesson_6;

public class MethodOver {

    void show( int i1){
        System.out.println(i1);
    }

    void show(boolean b1){
        System.out.println(b1);
    }


}
class MethodOverTest{

    public static void main(String[] args) {
        MethodOver mo = new MethodOver();

        mo.show(100);

        mo.show(false);
    }

}
