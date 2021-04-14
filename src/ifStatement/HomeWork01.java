package ifStatement;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        /*
        Type java code by using if statement. When you enter the initial of the day of a week, output should be all possible names of the days.
For example; if the initial is ’S’ output should be “Saturday or Sunday”
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir gunun ilk harfini harf olarak gir :");
        char harf = scanner.nextLine().charAt(0);

        if (harf=='m'){
            System.out.println("Monday");
        } else if (harf=='M'){
            System.out.println("Monday");
        }else if (harf=='t'){
            System.out.println("Tuesday & Thursday");
        } else if (harf=='T'){
            System.out.println("Tuesday & Thursday");
        }else if (harf=='w'){
            System.out.println("Wednesday");
        } else if (harf=='W'){
            System.out.println("Wednesday");
        }else if (harf=='f'){
            System.out.println("Friday");
        } else if (harf=='F'){
            System.out.println("Friday");
        }else if (harf=='s'){
            System.out.println("Saturday & Sunday");
        } else if (harf=='S'){
            System.out.println("Saturday & Sunday");
        }





    }
}
