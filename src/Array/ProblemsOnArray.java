package Array;

public class ProblemsOnArray {
    public static void main(String[] args) {

//        System.out.println(Integer.MAX_VALUE);

//        int numbers[] = {45,42,55,66,22,43,35,44,30};
//        int sum = 0;
//
//        for(int number : numbers){
//             sum+= number;
//        }
//        System.out.println("Sum is "+sum);

//        minimum number

        int numbers[] = {32,345,35,75,76,77};

        int min = Integer.MAX_VALUE;

        for(int number : numbers){
            if(number < min){
                min = number;
            }
        }
        System.out.println("minimum is "+min);



//        2D array
//        row->student roll number
//        column-> subject position

        int marks[][] = {
                {12, 98, 34},
                {12, 67, 87},
                {12, 98, 23},
                {14, 67, 36}
        };

        System.out.println(marks[2][1]);
        System.out.println(marks[2][2]);
        System.out.println(marks[1][2]);


//        marks[0][0] = 12;
//        marks[0][1] = 98;
//        marks[0][2] = 34;
//
//        marks[1][0] = 12;
//        marks[1][1] = 67;
//        marks[1][2] = 87;
//
//        marks[2][0] = 12;
//        marks[2][1] = 98;
//        marks[2][2] = 34;
//
//        marks[3][0] = 12;
//        marks[3][1] = 67;
//        marks[3][2] = 87;


    }
}
