package Basic;

public class Operators {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);//--->0
        System.out.println(b%a);//--->0


        int c=2;
        c++; //c=c+1;
        System.out.println(c);
        --c;
        System.out.println(c);
        //pre ---> ++c --c  pahle incre/dec then oper
        //post --> c++ c--; //pahle oper then incre/dec

        int d=5;
        int k= ++d + --d + d++ - --d + d++;
        //6 +  5   + 5 - 5 + 5
        System.out.println(k);

        int g=10;
        int res=g++ - g-- + ++g + ++g + --g + g-- + g++ + --g;
        //10 - 11 +   11 +   12 +  11 + 11 +  10 + 10 =

        System.out.println(res);



//        int a,b;
//        a=12;
//        b=10;
//
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a>=b);
//        System.out.println(a<=b);
//
//        System.out.println("--------------------------------");
//        boolean a1=false;
//        boolean a2=false;
//        System.out.println(a1&&a2);
//        System.out.println(a1||a2);
//        System.out.println(!(a1&&a2));


//
//        int a=2; //assignment
//        a+=10; //a=a+1;
//        System.out.println(a);
//
//
//        int b=10;
//        int c=20;
//        boolean res =(b>c) ? false : true;
//
//        System.out.println(res);


//        boolean first = true;
//        boolean second = false;
//
//        System.out.println(first && second);
//        System.out.println(first || second);
//        System.out.println(!second);

//        int a = 12;
//        a = a + 1 ;
//        a++;
//        a--;
//        a--;
//        System.out.println(a);

//        int a = 12;
//        int b = 7;
////          double c = a /(double)b;
//          double c = a%b;
//          a-= b;// a = a-b;
//        System.out.println(a);
//





    }
}
