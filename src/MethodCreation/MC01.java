package MethodCreation;

public class MC01 {
    int a =5;
    static void ali(){
        System.out.println("Ali methodu");
    }

    static int age(){
        int age = 4;
        System.out.println(age);
    return age;
    }

    static String melih(String soyad, int age){
        System.out.println(soyad+" "+age);
        return soyad;
    }
    static int mult(int a, int b){
       return a*b;
    }
    public static void main(String[] args) {
        ali();
        age();
        melih("ayyildiz",2);
        System.out.println(mult(2,3));
    }
}
