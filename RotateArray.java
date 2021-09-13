public class RotateArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        rotate(arr, 3);
    }
    public static void rotate(int[] arr,int k) {
        reverse(arr, 0, arr.length-1); // {7,6,5,4,3,2,1}
        reverse(arr, 0, k-1); // {5,6,7,4,3,2,1}
        reverse(arr, k, arr.length-1); //{5,6,7,1,2,3,4}
        
        display(arr);
    }
    public static void display(int[] arr) {
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }        
    }
    public static void reverse(int[] arr,int start,int end) {
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
