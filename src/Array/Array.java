package Array;

public class Array {
    public static void main(String[] args) {

        //create array
        int arr[]=new int[5];

        //insert data
        arr[0]=10;

        //print
        System.out.println(arr[1]);
//
//        int age[]; //declaration
//        age = new int[5]; //allocation

        int age[] = new int[5];

        age[0] = 1;
        age[1] = 2;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);  //by deafault take (0) value

        System.out.println(age.length);


        int marks[] = {33,34,24,21,55};
        System.out.println(marks[4]);

        String names[] = {"nilesh","ravi","ashish","Liladhar"};

        for(int i = 0; i < names.length; i++){
            System.out.println("Name is "+names[i]);
        }

        for(String name : names){
            System.out.println("for each "+name);
        }


        //insert using loop
        // 1 2 3 4 5
        for(int i=0;i<5;i++)
        {
            arr[i]=i;
        }

        //print using loop
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        for(int a:arr)
        {
            System.out.println(a);
        }


    }
}
