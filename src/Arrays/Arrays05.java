package Arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        String str = "What about Java, did you like it";

        String arr[] = str.split(",");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
