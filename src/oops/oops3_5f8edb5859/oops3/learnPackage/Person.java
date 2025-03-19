package oops3.learnPackage;

public class Person {

    public static int count = 0;

    public static final String scientificName = "Home Sapiens";

    public Person() {
        count++;
    }

    public int age;
    private String name;

    boolean canBeChanged = true;

    public void setAge(int age) {
        if(canBeChanged) {
            if(age > 0) {
                this.age = age;
            }
        }
    }

    boolean canBeAccessed = false;

    public int getAge() {
        if(canBeAccessed) return age;
        return -1;
    }

}
