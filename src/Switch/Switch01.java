package Switch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*
        girilen rakam hangi gunu gosteriyor eger haftanin 7 gunune tekabul etmiyorsa su mesaji goster
        "Hafta da 7 gun var"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Gun numarasi gir : ");
        int day = scan.nextInt();
        switch(day){
            case 1 :
                System.out.println("Ptesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Ctesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:

                System.out.println("haftada 7 gun var");
        }

    }
}
