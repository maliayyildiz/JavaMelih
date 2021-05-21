package forloop;

public class Question01 {
    public static void main(String[] args) {
        for (int i =10; i<57; i++){
            System.out.print(i+" ");
            if (i%10==0){ System.out.println();}
        }
        System.out.println();
        System.out.println("================");

        for (int i =100; i>43; i-=2){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("================");
        for (int i =200; i>33; i--){
            if (i%2==1) {
                System.out.print(i + " ");
            }
        }
    }
}
