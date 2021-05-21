package whileloop;

import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        int x = scan.nextInt();
        System.out.println("Kaça kadar çarpsın: ");
        int z = scan.nextInt();
        int y = 0;
        while (x > 0) {
            System.out.print(x + " x " + y + " = " + x * y + "\n");
            if (y < z) {
                y += 1;
            } else if (y == z) {
                break;
            }

        }
    }
}