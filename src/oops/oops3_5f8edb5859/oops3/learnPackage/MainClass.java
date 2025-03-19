package oops3.learnPackage;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

import oops3.learnEncapsulation.MainInEncapsulation;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();

        Teacher obj = new Teacher();
        obj.teachingClass = 12;
//        obj.id = 123;
        obj.degree = "PHD";

        MainInEncapsulation.printHello();
    }

}
