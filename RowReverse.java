public class RowReverse {
    public static void rowreverse(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] arr1={
            {1,2,3,4},
            {4,5,6,7},
            {7,8,9,10}
        };
        rowreverse(arr1);
    }
}