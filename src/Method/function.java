package Method;


class Student{
    public void study(){
        System.out.println("Study");
    }
    public int sum(int a,int b){
        int c = a + b;
        return c;
    }
    public String userName(){
        return "kali das";
    }
}
public class function {
    public static void main(String[] args) {

       Student student = new Student();
       student.study();

        System.out.println(student.sum(10,10));
        int res = student.sum(10,10);

        System.out.println(res);

        String name = student.userName();
        System.out.println(name);

        System.out.println(1);
        System.out.println(2);
        greet();
        System.out.println(3);
        System.out.println(4);

        int averageFromFunction = average(4,6,true);
        int doubleOfAvg = averageFromFunction * 2;
        System.out.println("hello");
        System.out.println(doubleOfAvg);

    }

    static void greet(){
        System.out.println(5);
        System.out.println("Hello world");
        System.out.println(6);
    }

//    avg
    public static int average(int a,int b,boolean shouldAverage){
        if(shouldAverage == false){
            return -1;
        }
        int avg = (a+b)/2;
        System.out.println("return the avg");
        return avg;
    }

    static int minimum(int a, int b){
        return a<b ? a : b;
    }

}

