package CastIncDicConcat;

public class Concatenation {
    public static void main(String[] args) {
        //Concatenation: stringleri birlestirme
        String str1 = "Melih";
        String str2 = "Ayyildiz";

        System.out.println(str1+" "+str2);//MelihAyyildiz
        System.out.println(str1+" "+str2);//Melih Ayyildiz

        System.out.println("Melih "+"Ayyildiz");//Melih Ayyildiz
        System.out.println("Melih"+" Ayyildiz");//Melih Ayyildiz

        String takim = "Trabzonspor";

        System.out.println(takim+6+1);//Trabzonspor61
        System.out.println(takim+(6+1));//Trabzonspor7

        System.out.println((6+1)+takim+(1-6));//7Trabzonspor-5


    }
}
