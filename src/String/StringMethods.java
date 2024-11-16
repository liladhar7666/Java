package String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

//        LowerCase ,Uppercase
        String name = "   LiLADhar123      ";
        String prem = name.toLowerCase();
        System.out.println(prem);

//        trim
        System.out.println(name.trim());

//     startsWith, endsWith, equals
        System.out.println("Mother".startsWith("Moth1"));
        System.out.println("Mother".endsWith("ther"));
        System.out.println("father".equals("father"));

//   charAt
        char temp = "carpet".charAt(3);
        System.out.println(temp);


//      valueOf
        int age = 125;
        String stringAge = String.valueOf(age);
        System.out.println(age+2);
        System.out.println(stringAge+3);

//        substring
        String sentence = "I love Java, Java is, a good , language";

        String substring = sentence.substring(2);
        System.out.println(substring);

//        split
//        String array me store
        String words[] = sentence.split("a");
        for(String word : words){
            System.out.print(word);
        }

//        replace
        String newSentence = sentence.replace("Java", "Cpp");

//        contains
//        System.out.println(sentence.contains("Good"));

//        tocharArray
        String color = "Brown is my fav color!";

        char letters[] = color.toCharArray();

        for(char letter: letters) {
            System.out.println(letter);
        }

//        isEmpty , isBlank
// if space is present that is  Blank , and if space is not present that are goes on the empty
        String animal = "     ";
        if(animal.isEmpty()) {
            System.out.println("empty");
        } else if(animal.isBlank()) {
            System.out.println("Blank");
        }

////        nextLine and next
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your First Name:");
//        String firstName = sc.nextLine();
////        they take the after spaces lines
//
//        System.out.println("Enter your Last Name");
//        String lastName = sc.next();
////        in next after spaces content cut
//
//        System.out.println("Your full Name is "+firstName+" "+lastName);
//        System.out.println(lastName);

//  .length
        String s="Liladhar Meshram";
        System.out.println(s.length()); //length

        for (int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
//    compareTo
        String s12="hello";
        String s13="he";
        int res = s12.compareTo(s13);
        System.out.println(res);

//        indexOf
        String s15="cricket player";
        System.out.println(s15.contains("crick"));
        System.out.println(s15.indexOf('i'));
        System.out.println(s15.lastIndexOf('i'));
    }
}
