package lesson_5;

public class Car {
    Car(String a, String b){
        color = a;
        engine = b;
    }



    String color;
    String engine;
    int speed;


    int gaz(int a){

        speed += a;
        return  speed;

    }

    int tormoz(int a){
        speed -= a;
        return speed;
    }

    void showInfo(){

        System.out.println("Color: " + color + " Engine: " + engine + " Speed: "+ speed);

    }

}
