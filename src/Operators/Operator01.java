package Operators;

import java.util.Scanner;

public class Operator01 {
    public static void main(String[] args) {
        /*
        ask to user for 2 integers and then name them  as a,  b.
        calculate the result of a + b * (a-a%b)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first integer :");
        int a = scan.nextInt();
        System.out.println("enter second integer :");
        int b = scan.nextInt();

        System.out.println(a + b * (a - a % b));





    }
}
