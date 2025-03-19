package collectionAndLists;

import java.util.*;

public class ListMore {


    public static void main(String[] args) {

//        List<String> fruits = new Stack<>();

        Stack<String> fruits = new Stack<>();

        fruits.push("A");
        fruits.push("B");
        fruits.push("C");
        fruits.push("D");

        System.out.println(fruits.pop());
        System.out.println(fruits);
        System.out.println(fruits.peek());
        System.out.println(fruits);

        System.out.println(fruits.isEmpty());

//        fruits.add("Kiwi");
//        fruits.add("Papaya");
//        fruits.add("Mango");
//        fruits.add("Apple");
//
//        for(int i = 0; i<fruits.size(); i++) {
//            System.out.println("fruit is "+ fruits.get(i));
//        }
//
//        for(String fruit: fruits) {
//            System.out.println("for each fruit " +fruit);
//        }
//
//        Iterator<String> fe = fruits.iterator();
//        while(fe.hasNext()) {
//            System.out.println("iterator "+fe.next());
//        }
//
//        List<String> smallList = fruits.subList(1, 3);
//        System.out.println(smallList);

    }
}
