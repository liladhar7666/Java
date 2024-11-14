package Basic;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age is : ");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);

        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("user name : "+name);

        char c = name.charAt(0);
        System.out.println(c);

        char cc=sc.next().charAt(0);
        System.out.println(cc);

        System.out.println("char at 0th index "+name.charAt(0));

        float firstNumber = sc.nextFloat();
        long secondNumber = sc.nextLong();
        float result = (firstNumber+secondNumber);
        System.out.println(result);

        sc.close();
    }
}


