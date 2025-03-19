package oops1;

public class MainClass {

    public static void main(String[] args) {

//        int age = 12;
//        Dog d1 = new Dog();
//        d1.name = "Tommy";
//        d1.bark();
//        d1.walk();
//
//        Dog d2 = new Dog();
//        d2.name = "Leo";
//        d2.walk();

//        Complex num1 = new Complex();
//        num1.a = 3;
//        num1.b = 5;
//        num1.print();

    }

}



class Dog { // factory
    String name;
    int age;
    String color;

    void walk() {
        System.out.println(name+" is walking");
    }

    void bark() {
        System.out.println(name+" is barking");
    }
}

class Cat {

}