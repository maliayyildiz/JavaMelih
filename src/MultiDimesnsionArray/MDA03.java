package MultiDimesnsionArray;

public class MDA03 {
    public static void main(String[] args) {
      /*  Find the sum of the elements whose indexes are same
      in the given two multi dimensional arrays arr1 = { {1,2}, {3,4,5}, {6} }
      and arr2 = { {7,8,9}, {10,11}, {12} }
       */
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        int top = 0;

        for (int i = 0; i < arr1[i].length-1; i++) {
            for (int j = 0; j <arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
                top += arr1[i][j];
                System.out.println("top "+top);
            }
        }
        for (int k = 0; k < arr2[k].length-1; k++) {
            for (int j = 0; j < arr2[k].length; j++) {
                System.out.println(arr2[k][j]);
                top += arr2[k][j];
                System.out.println("top "+top);
            }
        }
        System.out.println(top);
    }
}
