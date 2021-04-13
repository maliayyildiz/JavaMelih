package ifStatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
      //  Type java code, if an integer is even, output will be “The integer is even”.
      //  If the integer is odd, output will be “The integer is odd”.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi ver");
        int sayi = scan.nextInt();

        if (sayi%2==0) {
            System.out.println("Integer is odd");
        }
        if (sayi%2==1){
            System.out.println("Integer is even");
        }


scan.close();
    }
}
