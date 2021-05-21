package whileloop;

import sun.tools.jstat.Scale;

public class Q01 {
    public static void main(String[] args) {
        int i =1;
        while(i<5){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println("==========");
        int j =1;
        while(j<60){
            System.out.print(j + " ");
            j+=2;
        }
        System.out.println();
        System.out.println("==========");

        int k =1;
        int l = 1;
        while(k<=9){
            l+=1;
            System.out.println(k +" * "+k+" =");
        }

    }
}
