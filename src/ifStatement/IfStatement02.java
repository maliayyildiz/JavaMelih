package ifStatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi ver");
        int sayi = scan.nextInt();

        if(sayi==0){
            System.out.println("Bu sayi notr dur.");
        }
        if(sayi<0){
            System.out.println("Bu sayi negatiftir");
        }
        if(sayi>0){
            System.out.println("bu sayi pozitiftir");
        }

        System.out.println("sectigin sayi "+ sayi);

        scan.close();

    }
}
