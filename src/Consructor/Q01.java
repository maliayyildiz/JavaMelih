package Consructor;

public class Q01 {
    int x = 5;

    Q01(){
        System.out.println("-x"+x);
    }
    Q01(int x){
        this();
        System.out.println("-x"+x);
    }

    public static void main(String[] args) {
        Q01 a = new Q01(4);
        Q01 b = new Q01();
    }
}
