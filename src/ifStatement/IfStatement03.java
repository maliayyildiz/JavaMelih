package ifStatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        /*
        kullanica yasini sor
        eger yasi 18 ten kucukse "calisamaz"
        eger 18 den buyukse ve 65 ten kucukse "calsiman lazim"
        65 ten buyukse "emekli oldun"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("yas gir");
        int yas = scanner.nextInt();
       //if else
        if(yas<18){
            System.out.println("Calsimaz");
        }
        else if(yas>65){
            System.out.println("Emekli");
        }
        else if(yas>65){
            System.out.println("Emekli");
        }
        else{
            System.out.println("calismalisin");
        }



    }
}
