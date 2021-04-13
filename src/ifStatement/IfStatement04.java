package ifStatement;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi gir");
        // sayi <10 "kazandin"  degilse kaybettin
        int sayi = scanner.nextInt();

        if(sayi<10){
            System.out.println("KAzandin");
        }else{
            System.out.println("Kaybettin");
        }
        System.out.println("Oyun biter.");

        scanner.close();

    }
}
