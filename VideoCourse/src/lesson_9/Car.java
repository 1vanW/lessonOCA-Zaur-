package lesson_9;

public class Car {
    String color;
    String engine;
    public static int count;
    int z;



    public Car(){
        count++;

    }

   public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor(){
        System.out.println("Цвет машины " + color);
        this.changeColor("Красный");
    }

    public void changeColor(String color){
        System.out.println("Цвет машины изменился ");
        int price = 5000;
        this.color = color;
        price+=1000;
    }
}
