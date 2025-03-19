package Modifier.Protected;

public class Protected {
    public static void main(String[] args) {
        protectedJava p=new protectedJava();
        System.out.println(p.a);
        p.m1();
    }
}




//package modifiers;
//
//
//
//public class ModifierProtected{
//    protected String name="ashwani";
//    protected void display()
//    {
//        System.out.println("Hello "+name);
//    }
//}
//
//class ModifierProtectedChild extends ModifierProtected
//{
//
//}
//
//class TestProtected{
//
//}
//class ProtectedTest {
//    public static void main(String[] args) {
//        ModifierProtectedChild modifierProtectedChild=new ModifierProtectedChild();
//        System.out.println(modifierProtectedChild.name);
//        modifierProtectedChild.display();
//    }
//}
