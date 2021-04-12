package Operators;

import java.util.Scanner;

public class Operator03 {
    public static void main(String[] args) {
        /*
        Ask to user enter two integer values. Write a JAva program to swap
    two numbers by without using third variable.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give to number to swap ");
        System.out.println("first one :");
        int a = scanner.nextInt();
        System.out.println("second one :");
        int b = scanner.nextInt();

        System.out.println("you give me first number as "+ a+ " second number as "+b);
        //a =5  b =3   b=5 a=3
        a = a + b; //a =8
        b = a - b; //b =5
        a = a - b; //a = 3
        System.out.println("after swap first number as "+ a+ " second number as "+b);

    }
}
