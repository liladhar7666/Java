package genericsAndWrapperClasses;

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        Integer obj = new Integer(12);

        Integer obj2 = Integer.valueOf("12");

        System.out.println(obj2*4);

        Boolean myBoolean = Boolean.valueOf("false");

        Integer obj3 = 12; // autoboxing

        int age = obj; // unboxing

    }
}
