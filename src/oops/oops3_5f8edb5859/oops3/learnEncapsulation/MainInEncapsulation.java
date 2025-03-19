package oops3.learnEncapsulation;

import oops3.learnPackage.Person;
import oops3.package2.MainInPackage2;

public class MainInEncapsulation {

    public static void printHello() {
        System.out.println("Hello");
//        printHi();
    }

    public void printHi() {
        System.out.println("Hi");
//        printHello();
    }

    static {
        System.out.println("Called from the static block");
    }

    public static void main(String[] args) {

//        MainInEncapsulation.printHello();

//        printHi();

        System.out.println("From the main method");

        Person p1 = new Person();
        p1.setAge(12);

        Person p2 = new Person();
        Person p3 = new Person();

//        Person.count = 12;

        System.out.println(Person.count);
        System.out.println(Math.PI);

        System.out.println(Person.scientificName);

//
//
//        System.out.println(Math.max(3, 6));




    }

    static {
        System.out.println("Called from the second static block");
    }

}
