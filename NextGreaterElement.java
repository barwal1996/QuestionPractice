/*
Time complexity = O(n)
Given a positive integer n, find the smallest integer which has exactly the same digits existing
 in the integer n and is greater in value than n. If no such positive integer exists, return -1.

Note that the returned integer should fit in 32-bit integer, if there is a valid answer but 
it does not fit in 32-bit integer, return -1.


*/
import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter given number ");
        String num = sc.next();
        String res = nextGreaterElement(num);
        System.out.println(res);
    }    
    public static String nextGreaterElement(String str){
        char[] arr = str.toCharArray();  //convert string into character array
        //find  firstdip
        int i=arr.length-2; //pichla last element kya hi krega sliye -2 kia
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i==-1){
            return "-1";
        }
        //agar aisa ni hai to we have to swap the first dip with the number just usse bada
        int k = arr.length-1;
        while(arr[i]>=arr[k]){
            k--;
        }
        //swap from i and k
        char temp = arr[i];
        arr[i]=arr[k];
        arr[k]=temp;

        //concatenate from 0 to ith index
        String res = "";
        for(int j =0;j<=i;j++){
            res += arr[j];
        }
        //conatenate form k to  i+1 index (reverse order )
        for(int j=arr.length-1;j>i;j--){
            res+=arr[j];

        }

        return res;
    }
}
