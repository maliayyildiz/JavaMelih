package IfElseIF;

import java.util.Scanner;

public class IfElseIF02 {
    /*
    Type java code by using if-else if() statement.
 A school has following rules for grading system:
 1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
 Ask user to enter marks and print the corresponding grade.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your grade :");
        int grade = scanner.nextInt();

        if(grade<0){
            System.out.println("Bizi kandiramazsin");
        } else if  (grade<50){
            System.out.println("D");
        }else if(grade>=50 && grade<60){
            System.out.println("C");
        }else if(grade>=60 && grade<=79) {
            System.out.println("B");
        }else if(grade>=80 && grade<101) {
            System.out.println("A");
        }else{
            System.out.println("There is no above 100 grades in school system");
        }

    }
}
