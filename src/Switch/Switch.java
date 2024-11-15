package Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = sc.nextInt();

//        if(day == 1){
//            System.out.println("today is monday");
//        } else if (day == 2) {
//            System.out.println("today is sunday");
//        }

        switch (day){
            case 1: case 2:
                System.out.println("today is sunday ");
                System.out.println("this is onn sunday ");
                break;
            case 3:
                System.out.println("today is monday ");
                break;
            case 4:
                System.out.println("today is Tuesday ");
                break;
            case 5:
                System.out.println("Today is wednesday ");
                break;
            case 6:
                System.out.println("today is Thursday ");
                break;
            case 7:
                System.out.println("today is friday ");
                break;
            case 8:
                System.out.println("Today is saturday ");
                break;
            default:
                System.out.println("Invalid day ");
        }


        int a = 4;

        switch(a)
        {
            case 1:
                System.out.println("1");
                return;
            case 3:
                System.out.println("2");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("default");
        }
    }
}
