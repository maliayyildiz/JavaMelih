package Variables;

public class Variables01 {
    public static void main(String[] args) {
        //java da bir yaziyi veya degeri konsolda gormek icin kullanilan komut
        System.out.println("Hello World");
        System.out.println("Merhaba Melih");
// eger yazdirmak istedigmiz komutu ayni satirda gormek istiyorsak o zaman

        System.out.print("Melih ");
        System.out.println("Ayyildiz");
/*
eger "" sadece yazi olarak konsolda gorunur System.out.println("erkek"); sonuc konsolda erkek
ager degisken adi olarak tanimlarsam degiskenin degerini verir  System.out.println(erkek); sonuc konsolda false
 */
        boolean erkek = false;
        System.out.println(erkek);
        boolean kadin = true;
        System.out.println(kadin);
//int
        int age = 36;
        System.out.println(age);
        // float  olustur ve bunu yazdir  ondalik (float  ta degerin sonuna f/F ullanmak sart)
        float pi = 3.14F;
        System.out.println(pi);

        double piGercek = 3.14159;
        System.out.println(piGercek);
        //char dergeri yazarken '' kullanmaliyiz
        char initial = 'M';
        System.out.println(initial);
        //String olustur ve kendi adini konsl da gor. ""

        String name = "Melih";
        System.out.println(name);


    }
}
