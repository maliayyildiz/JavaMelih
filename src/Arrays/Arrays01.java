package Arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //array nasil olusturulur
        int arr[] = new int[4];
        //konsola yazdirmak
        System.out.println(Arrays.toString(arr));//[0,0,0,0]
        //nasil eleman tanimlariz
        arr[0]=10;
        System.out.println(Arrays.toString(arr));
        //arrayin uzunlugunu nasil buluruz
        System.out.println(arr.length);//4
        //String te length()  ama arrays length => prantezsiz
        
        int brr[] ={21,22,23,24,25};
        System.out.println(Arrays.toString(brr));
        System.out.println(brr[1]);//22
       // System.out.println(brr[5]);//
        //eger arraryde length den fazla eleman cagirirsan CTE vermez ama RTE verir
        
        //specific element e ulasmak icin
        System.out.println(brr[2]);//23


        //butun elemanlari konsola yaz
        for(int i = 0; i<brr.length; i++){
            System.out.print(brr[i]+" ");
        }
        //ascending order
        //natural order
    }
}
