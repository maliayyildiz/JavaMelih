package ifStatement;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        //kullanicaya bit harf girmesini istiyoruz
        //eger harf isminin ilk harfiyse "Kazandin" degil "Kaybettin"
        //initial = isminin ilk harfi

        /*
        Scanner class is helping us to get data from User
        Scanner sinifi kullanicidan veri almamiza yardimci olur
         */

        //M uzunlgu = 1
        //0  index
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir buyuk harf gir :");
        char harf = scan.nextLine().charAt(0);

        if(harf=='M'){
            System.out.println("Kazandin");
        }else{
            System.out.println("Kaybettin");
        }

    }
}
