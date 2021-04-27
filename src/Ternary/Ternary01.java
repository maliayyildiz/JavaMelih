package Ternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
/*
Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”.
 If the integer is odd, the output will be “The integer is odd”.
 */
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Give an integer ");
        int digit = scanner.nextInt();

        if(digit%2==0){
            System.out.println("cift");
        }else if (digit%2==1){
            System.out.println("tek");
        }

        System.out.println(digit%2==0 ? ("Cift") : ("tek"));

    }
}
