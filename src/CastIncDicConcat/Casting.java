package CastIncDicConcat;

public class Casting {
    //byte<short<int<long<float<double
    //Auto Widening: kucuk olani buyuge cevir
    //Java auto widening kendisi yapiyor
    public static void main(String[] args) {

        byte num1 = 123;
        short num2 = num1;
        System.out.println(num2);

        int num3 = 2453;
        double num4 = num3;
        System.out.println(num4);

        //byte<short<int<long<float<double
        //Explicit Narrowing: buyuk olani kucuge cevir
        //Java explicit narrowing yapmaz senin yapmani ister
        //buyukten kucuge cevirirken data type degiskenin onune yazariz

        long num5 = 657;
        short num6 = (short) num5;
        System.out.println(num6);

        //float dene

        double num7 = 999;
        float num8 = (float) num7;
        System.out.println(num8);


    }
}
