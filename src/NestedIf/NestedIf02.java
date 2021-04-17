package NestedIf;

import java.util.Scanner;

public class NestedIf02 {
    /*
    Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not.
 If it is ‘A’ the output will be “Valid Password” otherwise the output will be “Invalid Password”
If the initial of the password is lowercase then check if it is ‘z’ or not.
 If it is ‘z’ the output will be “Valid Password” otherwise the output will be “Invalid Password”
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        String password = scanner.nextLine();
        char ilkHarf = password.charAt(0);

        if( ilkHarf >='A' && ilkHarf <= 'Z'){
          if(ilkHarf=='A'){
              System.out.println("Valid Password");
          }else{
              System.out.println("Invalid password");
          }
        }else if(ilkHarf >= 'a' && ilkHarf <= 'z'){
            if(ilkHarf=='z'){
                System.out.println("Valid Password");
            }else{
                System.out.println("Invalid password");
            }
        }
        else{
            System.out.println("Lutfen ilk harfi harf olarak girin!");

        }




    }
}
