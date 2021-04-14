package ifStatement;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {
        /*
        kullanici bize kitap sayisi ve fiyati verecek
        eger kitap sayisi 1000 den fazlaysa "%10 indirim" ve total fiyat
        degilse "Indirim yok"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac kitap istiyorsun?");
        int kitapSayi = scanner.nextInt();
        System.out.println("Tanesine ne kadar verirsin?");
        int fiyat = scanner.nextInt();

        if (kitapSayi>1000){
            System.out.println("%10 indirim kazandin");
            System.out.println("Kitap maliyet "+kitapSayi*fiyat*0.9);
        }else{
            System.out.println("Kitap maliyeti "+kitapSayi*fiyat);
            System.out.println("Indirim yok");
        }

    }
}
