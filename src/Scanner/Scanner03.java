package Scanner;

import java.util.Scanner;

public class Scanner03 {
    /*
    bir program yaz bir karanin cevresini hesaplasin
    cevre kullanici vermis oldugu degere ogre hesapliyacak
    not: karenin bir kenar uzunlugu x ise
    not: ceveresi uzunlugu 4x tir.
     */
    public static void main(String[] args) {
        //3 adimda yapacaz
        Scanner scanner =new Scanner(System.in);

        System.out.println("Karenin cevresini hesaplamak icin bir kenar uzunlugu gir: ");

        int kenar = scanner.nextInt();

        System.out.println("Karenin cevresi "+ (kenar*4));

    }
}
