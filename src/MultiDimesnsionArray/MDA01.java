package MultiDimesnsionArray;

public class MDA01 {
    public static void main(String[] args) {
        //Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
        int top=0;
        int arr [][] = {{1,2,3},{4,5,6}};
        for (int i= 0; i<arr.length; i++){
            for (int j= 0; j<arr[i].length; j++){
                top+=arr[i][j];
        }
        }
        System.out.println(top);
    }
}
