package oops4;

public class LearnAbstract {

    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();\
        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(4);
        c1.honks();
    }

}

abstract class Human {

    void speak() {

    }

    abstract void eat();
}


abstract class Vehicle {
    abstract void accelerate();
    abstract int brakes(int wheels);

    void honks() {
        System.out.println("Vehicle honks");
    }
}

class Scooter extends Vehicle {

    void accelerate() {

    }

    int brakes(int wheels) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Car is Accelerating");
    }

    int brakes(int wheels) {
        System.out.println("Car breaks are pushed");
        return wheels;
    }

    void honks() {
        System.out.println("Car is honked");
    }

}


