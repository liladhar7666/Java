package Modifier.PublicPackage;

public class PublicJava {
    public static void main(String[] args) {
        PublicClass p = new PublicClass();
        System.out.println(p.name);
    }
}


//package modifiers;
//
//public class ModifierPublic
//{
//    public String name="Nikita";
//    public void display()
//    {
//        System.out.println("Hello "+name);
//    }
//}
//
//class PublicTest {
//    public static void main(String[] args) {
//        ModifierPublic modifierPublic=new ModifierPublic();
//        modifierPublic.display();
//    }
//}



//
//
//package modifiers;
//
//
//class ModifierDefault {
//    String name = "ashwani";  //default modifier
//
//    void display() {  //default modifier
//        System.out.println("Hello " + name);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        ModifierDefault modifierDefault=new ModifierDefault();
//        modifierDefault.display();
//        System.out.println(modifierDefault.name);
//    }
//}