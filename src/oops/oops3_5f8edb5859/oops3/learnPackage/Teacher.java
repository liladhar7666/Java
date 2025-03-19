package oops3.learnPackage;

public class Teacher {

    public int teachingClass;

    private int id;

    String degree; // default or package-private

    protected int studentsCount;

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        obj.id = 123;
    }

}
