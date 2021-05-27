package Arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //iki arrays birbirine esit  mi?

        int arr[] = {1,2,3};
        int arr2[] = {3,2,1};
        int arr3[] = {1,2,3};
        //ayni elementler ayni index olmali esit olmasi icin
        //ayni indexlerde farkli elementler varsa esit degildir
        //arr ile arr3 esit arrr2 esit degil

        //1. yol
        int count =0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==arr3[i]){
                count++;
            }
        }
        if(count==arr.length){
            System.out.println("aynilar");
        }else{
            System.out.println("ayni degiller");
        }

        //2.yol
        //equals() esitligi kontolr et bu boolean (true/false)
        System.out.println(Arrays.equals(arr,arr2)); //false
        System.out.println(Arrays.equals(arr,arr3)); //true
        System.out.println(Arrays.equals(arr3,arr2));//false


    }
}
