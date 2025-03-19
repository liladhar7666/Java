package genericsAndWrapperClasses;

public class GenericMethods {

    public static void main(String[] args) {
        printData("Hello");
        printData(123);

        GenericMethods obj = new GenericMethods();
//        obj.doubleData("abc");
        obj.doubleData(123);

        CustomClass custom = new CustomClass();
//        obj.doubleData(custom);
    }

    static <E> void printData(E data) {
        System.out.println(data);
    }

    <E extends Number> void doubleData(E data) {
        System.out.println(data);

    }

}

class CustomClass {

}
