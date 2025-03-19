package oops2;

import java.util.Scanner;

public class Car extends Vehicle {

    String color;

    void start() {
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        super.start();
        System.out.println(this);
        System.out.println(this.model+"Car is starting");
    }

    Car braking() {
        return this;
    }

    Car() {
        super(2);
//        this(3);
        System.out.println("Car is being created");

    }

    Car(int wheelsCount) {

    }

    public static void main(String[] args) throws Exception {
        Car obj = new Car();
        obj.accelerate();

//        System.out.println(obj.wheelsCount);
//        obj.wheelsCount = 4;
//        obj.model = "I10";
//        obj.color = "Red";
//        obj.start();
//        System.out.println(obj.wheelsCount);
    }
}

class Scooter {

    void braking(Car car) {
        System.out.println(car.model+" is braking");
    }

}
