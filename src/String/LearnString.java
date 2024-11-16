package String;

public class LearnString {
    public static void main(String[] args) {

        //how to create object
        //1 using string literals
        //2 using new keyword
       /* String s1=new String("hello");
        System.out.println(s1.hashCode());

        String s2="hello";
        System.out.println(s2.hashCode());*/

        String s1="hello";
        String s2="hello";
        System.out.println(s2==s1);

        String s3=new String("hey");
        String s4=new String("hey");
        System.out.println(s3==s4);
        String s5="hey";
        System.out.println(s3==s5);
        System.out.println(s3.hashCode());
        System.out.println(s5.hashCode());

        //== memory address
        //equals content

        System.out.println(s3.equals(s5));

        String name = "Liladhar";
        String sameName = "Liladhar";
        String newName = new String("Liladhar");

        System.out.println(name);
        System.out.println(newName);

        //String pool  __ heap
        if(name == sameName){
            System.out.println("Both are same ");
        }

        if(name == newName){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are not same");
        }

        if(name.equalsIgnoreCase(newName)){
            System.out.println("name and newName have same values");
        }else{
            System.out.println("Not same");
        }

        String s=new String("hello");
        String l="hey";
        System.out.println(s==l);
        String p="hey";
        System.out.println(l==p);
        System.out.println(s.equals(l));

        char ch[]={'a','b','c'};
        String s7=new String(ch);
        System.out.println(s7);


        //== reference
        //equals==content


        String city=new String("Agra");
        String city1 = new String("Delhi");
        String city2=city;

        System.out.println(city1==city);  // reference com
        System.out.println(city2==city);

        String f1="Agra";
        System.out.println(city==f1);
        System.out.println(city.equals(f1)); //content com


        String f2="Arjun";
        String f3="Arjun";
        System.out.println(f3==f2);

    }
}
