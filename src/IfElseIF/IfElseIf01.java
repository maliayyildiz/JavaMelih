package IfElseIF;

import java.util.Scanner;

public class IfElseIf01 {
    public static void main(String[] args) {
        /*
        Type java code by using if-else if() statement,
if both of the two integers are positive, output will be the sum of them.
If both of the two integers are negative, output will be the multiplication of them.
Otherwise; output will be “I cannot add or multiply different signed numbers”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("give an integer: ");
        int first = scan.nextInt();
        System.out.println("give an integer: ");
        int second = scan.nextInt();

        if(first>0 && second>0){
            System.out.println("Sum of two integers are "+(first+second));
        }else if(first<0 && second<0){
            System.out.println("Multiplication of two integers are "+(first*second));
        }else {
            System.out.println("I cannot add or multiply different signed numbers");
        }

        scan.close();

    }
}
