package CastIncDicConcat;

public class Increment {
    //Increment: degiskenin degerini arttirma
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);//10
        //1. yol:
        num = num+5;
        System.out.println(num);//15

        //2. yol
        num+=3;
        System.out.println(num);//18

        //3. yol  ++ , +1 demektie
        num++;//19
        System.out.println(num);
        num++;//20
        System.out.println(num);

    }
}
