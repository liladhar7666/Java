package IfElse;

public class ifElse {
    public static void main(String[] args) {
//        int age = 4;
//        if(age >= 18){
//            System.out.println("you can vote");
//            System.out.println("good morning");
//        }else{
//            System.out.println("you cannot vote");
//        }
//
//        //else-if
//
//        int day = 3;
//
//        if(day == 1){
//            System.out.println("go to home!!");
//        } else if (day == 2) {
//            System.out.println("go to villege");
//        } else if (day == 3) {
//            System.out.println("go to party");
//        }else{
//            System.out.println("go to office");
//        }
//
//        System.out.println("went somewhere today");
//
////        given three no, find maximum number:
//        int a = 50;
//        int b = 5;
//        int c = 889;
//
////        if(a > b){
////            System.out.println("a is bigger than b :");
////            if(a > c){
////                System.out.println("a is bigger than c");
////                System.out.println("a is the lagest:"+a);
////            }else{
////                System.out.println("c is bigger than a");
////                System.out.println("c is the lagest"+c);
////            }
////        }else{
////            System.out.println("b is the largest");
////            if(b > c){
////                System.out.println("b is bigger than c");
////                System.out.println("b is largest: "+b);
////            }else{
////                System.out.println("c is bigger than b");
////                System.out.println("c is largest "+c);
////            }
////        }
//
//        int max = 0;
////
////        if(a > b){
////            max = a;
////        }else{
////            max = b;
////        }
//
//        max = a > b ? a > c ? a : c : b > c ? b : c ;
//
//        System.out.println("value of max"+max);
//
//
////        int time = 10;
////
////        if(time >= 10 ){
////            if(time <=20){
////                System.out.println("office is open");
////            }else{
////                System.out.println("office is closed");
////            }
////        }else{
////            System.out.println("office is closed ");
////        }
//
//        int time = 18;
//
////        if(time >= 10 && time <=20){
////            System.out.println("office is open ");
////        }else{
////            System.out.println("office is closed ");
////        }
//
//        if(time == 12 || time == 18){
//            System.out.println("Time for snacks");
//        }else{
//            System.out.println("Time to work");
//        }



        //lays toffee biscut kurkure chips kitkat lolipop
//
//        int rs=10;
//        if(rs>2)
//        {
//            System.out.println("toffee leli...");
//            rs=rs-2; //8
//            if(rs>5)
//            {
//                System.out.println("munch bhi le li...");
//                rs=rs-5; //3
//                if(rs>5)
//                {
//                    System.out.println("Lays bhi le liy...");
//
//                }
//                else{
//                    System.out.println("lays nhi le paya...");
//                    if(rs>2)
//                    {
//                        System.out.println("orange wali toffee leli...");
//                        rs=rs-2;
//                        if(rs>=1)
//                        {
//                            System.out.println("kaccha mango le liya...");
//                            rs=rs-1;
//                            if (rs>=1)
//                            {
//                                System.out.println("bubelgum le liya...");
//                            }
//                            else {
//                                System.out.println("ek bhi paisa nhi ha....");
//                            }
//                        }
//                        else {
//                            System.out.println("paise khtam...");
//                        }
//
//                    }
//                    else {
//                        System.out.println("Orange wali nhi le paya...");
//                    }
//                }
//            }
//            else{
//                System.out.println("munch nhi le paya...");
//            }
//
//        }
//        System.out.println("program ended....");



        String ladki="Mera naan angle priya ha " +
                "age meri 24 " +
                "main cute hu meri good thinking" +
                "main infosys me kaam krti hu" +
                "rang mera sabla ha " +
                "meri height 5.6 hai";
        if(ladki.contains("23"))
        {
            System.out.println("ladki mujhe pasand ha");

        }
        else {
            System.out.println("ladki ki umer mujh se nhi mili kuch or batao...");
            if (ladki.contains("LPA")) {
                System.out.println("Job wali ladki mujhe pasand ha....");
            } else {
                System.out.println("Bhai job nhi ha kuch or batao...");
                if (ladki.contains("sabla") && ladki.contains("5.6")) {
                    System.out.println("finally match mil gaya....");
                } else {
                    System.out.println("mujhe kuch bhi pasand hi ha...");
                }
            }
        }

    }
}
