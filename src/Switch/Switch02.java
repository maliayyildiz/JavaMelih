package Switch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numara gir : ");
        int sayi = scan.nextInt();

        switch (sayi){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
            System.out.println("Not Allowed!!");
        }
    }
}
