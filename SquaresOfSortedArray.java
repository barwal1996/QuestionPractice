import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr= {-4,-1,0,3,10};
        int res[] = sortedSquares(arr);
        Arrays.sort(res);
        for(int i=0;i<arr.length;i++){
            
           System.out.println(res[i]);
       }
    }
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sortedSquares(int[] arr){

        int n = arr.length;
        int i=0,j=n-1;
        int[] sq = new int[n];

        for(int p=n-1;p>=0;p--){
            if(Math.abs(i)>Math.abs(j)){
                sq[p]=arr[i]*arr[i];
                i++;
            }
            else{
                sq[p]=arr[j]*arr[j];
                j--;
            }
        }
        display(arr);
        return sq;
    }
}
