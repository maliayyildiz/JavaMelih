package Operators;

public class Operator02 {
    /*
    Ask to user enter two integer values. Write a JAva program to swap
    two numbers by using third variable.
    a= 3  b=5 after swapping it should be a =5 b =3
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c;
        System.out.println("before swap a = "+a +" "+"b = "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("before swap a = "+a +" "+"b = "+b);


    }
}
