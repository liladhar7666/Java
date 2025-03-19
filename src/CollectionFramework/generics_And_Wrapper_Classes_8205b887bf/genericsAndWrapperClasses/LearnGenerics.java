package genericsAndWrapperClasses;

import java.util.ArrayList;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String, String> d1 = new Dog<>("asdf123", "Leo");
        Dog<String, Integer> d2 = new Dog<>("oeiur12", 123);

        Dog<Integer, String> d3 = new Dog<>(12, "Leo");

        System.out.println(d3.getId());

//        ArrayList<Integer> a = new ArrayList<>();
    }
}

class Dog<E, AB> {
    E id;
    AB name;

    public Dog(E id, AB name) {
        this.id = id;
        this.name = name;
    }

    E getId() {
        return id;
    }
}
