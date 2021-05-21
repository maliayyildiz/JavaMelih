package StringMethods;

import java.util.Locale;
import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {
     /*
     Ask user ta enter his/her first and last name.
     If the first name is longer output will be “First name is longer.”
      If the length of last name is equal To the length of last name output will be
       “First name and last name have same length.
     ” Otherwise, output will be “Last name is longer”
      */
//        String name ="MARK";
//        //KRAM
//        System.out.println(name.substring(name.length()-1)+name.substring(2,3)+name.substring(1,2)+name.substring(0,1));
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad :");
        String name =  scan.nextLine();
        System.out.println("soyad: ");
        String soyad = scan.nextLine();
        System.out.println("tc no");
        String  tcno = scan.nextLine();

        name = name.substring(0,1).toUpperCase()+name.substring(1);
        soyad = soyad.substring(0,1).toUpperCase()+soyad.substring(1);
        tcno =  tcno.substring(0,4).replaceAll("\\d","*")+tcno.substring(5);
        System.out.println(name+" "+soyad+" "+tcno);
    }
}
