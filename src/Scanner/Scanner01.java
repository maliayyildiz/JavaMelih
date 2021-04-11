package Scanner;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        java da kullanicidan bir data istedigimizde Sccanner class birze yardimci olur
        3 adim var
         */
        //object olusturma
        Scanner scanner = new Scanner(System.in);

        //2 adim
        System.out.println("Lutfen adini yaz");

        //3 adim
        String name = scanner.nextLine();
        System.out.println("Girmis oldugun isim "+name);
        scanner.close();
    }
}
