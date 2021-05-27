package staticKeywoed;

import Consructor.Q02;

public class Q03 {
    static int count =0;
    public Q03(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Q03 a = new Q03();
        Q03 b = new Q03();
        Q03 c = new Q03();
    }
}
