package lesson_10.p1.p2.p3.p4;

import lesson_10.A;
import lesson_10.p1.B;
import lesson_10.p1.p2.p3.C;
import lesson_10.p1.p2.p3.p4.p5.E;
import static lesson_10.p1.B.abc;
import static lesson_10.p1.B.deg;

public class D {

    public static void main(String[] args) {
        A a = new A();
        C c =new C();
        E e =new E();
        System.out.println(B.abc);
        System.out.println(B.deg);
        B.showStatic();
    }
}
