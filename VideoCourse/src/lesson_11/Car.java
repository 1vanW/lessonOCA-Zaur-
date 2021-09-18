package lesson_11;

public class Car {

    public String color;
    public String engine;
    public int door;

    public Car(String color, String engine, int door) {
        this.color = color;
        this.engine = engine;
        this.door = door;
    }



}

class CarTest{

    public static void treasonDoor(Car car,int door){

        car.door = door;

    }

    public static void swapColor(Car car1, Car car2){
     String color = car1.color;
     car1.color = car2.color;
     car2.color = color;

// с помощью этого метода я поменял значения в объекте Car

    }

    public static void main(String[] args) {

        Car car1 = new Car("red","V8",4);
        Car car2 = new Car("white","v6",2);

        swapColor(car1,car2);

        System.out.println(car1.color);
        System.out.println(car2.color);

    }
}
