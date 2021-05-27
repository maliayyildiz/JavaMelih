package Arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        String ayyildiz[] = {"Ozgur","Ayse","Melih","Betul","Rana"};
        System.out.println(Arrays.toString(ayyildiz)); //[Ozgur, Ayse, Melih, Betul, Rana]

        //sort()
        Arrays.sort(ayyildiz);
        System.out.println(Arrays.toString(ayyildiz)); //[Ayse, Betul, Melih, Ozgur, Rana]

    }
}
