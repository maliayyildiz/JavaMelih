package Scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
        kullanicida iki sayi vermsni iste ve bu sayilarin toplamini
        "Girmis oldugun sayilarin toplami " toplamini ver
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayi gir");
        int num1 =  scanner.nextInt();
        System.out.println("ikinici sayiyi ben sana toplamini vereyim ");
        int num2 = scanner.nextInt();

        System.out.println("Girmis oldugun sayilarin toplami "+ (num1+num2));
    }
}
