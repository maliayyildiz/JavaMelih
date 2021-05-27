package MethodCreation;

import java.util.Scanner;

public class MC02 {

      /*
	     Create a method outside of the main method +
         Ask user to enter two numbers
         Ask user which operation he wants to do
         Print the result after doing the operation which user asked
         Call the method from inside the main method
	    */
      public static void main(String[] args) {
         // simpleOperation();
          MC01.ali();
          MC01 a = new MC01();
          System.out.println(a.a);
      }
      static void simpleOperation(){
          Scanner scan = new Scanner(System.in);
          System.out.println("enter a value ");
          double n1 = scan.nextDouble();
          System.out.println("enter a value ");
          double n2 = scan.nextDouble();
          System.out.println("+,-,*,/");
          char op = scan.next().charAt(0);
          switch(op) {
              case '+':
                  System.out.println("The sum is " + (n1+n2));
                  break;
              case '-':
                  System.out.println("The difference is " + (n1-n2));
                  break;
              case '*':
                  System.out.println("The product is " + (n1*n2));
                  break;
              case '/':
                  System.out.println("The division is " + (n1/n2));
                  break;
              default:
                  System.out.println("Select just one of +, -, *, /");
          }
          scan.close();
      }
}
