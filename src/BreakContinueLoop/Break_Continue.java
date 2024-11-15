package BreakContinueLoop;

public class Break_Continue {
    public static void main(String[] args) {

        for(int i = 0; i <= 20; i+=2){
            System.out.println(i);
            if (i >= 10) break;
        }

        for(int i = 0; i <= 20; i+=1){
            if(i == 2 || i == 8) continue;
            if(i >= 15)break;
            System.out.println("gave toffee to "+i);
        }

        int i = 0;
        while(i <= 5){
            System.out.println(i);
            i++;
            if(i == 3) break;
        }

        for(int count=0; count < 10; count++){
            for (int j = 1; j < 5; j++){
                System.out.print(j+" ");
            }
            System.out.println("printed"+count);
        }

        for(int l = 0;l < 8; l++){
            for(int m = 0; m <= l; m++){
                System.out.print("* ");
            }
            System.out.println();
        }

        outerLoop:
        for( i = 0; i<10; i++) {
            int j = 0;
            while(j <= 5) {
                if(j == 3) break outerLoop;
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }


        for(i = 0; i <= 3;i++){
            System.out.println(i);
            if(i == 2){
                break;
            }
        }

        System.out.println("-----------------------------------Continue--------------------------------------------");
//      continue
        for(i = 0; i<10;i++){
            if(i < 3) continue;
            System.out.println(i);

        }

    }
}
