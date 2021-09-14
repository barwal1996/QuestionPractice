/*
T.C = O(n) Size Complexity= O(1)
Given an integer array of size n, find all elements that appear more than ⌊ n/2 ⌋ times.

Input: nums = [3,2,3]
Output: [3]
*/
import java.util.Scanner;

public class MajorityElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printMajorityElement(arr);
    }
    public static void printMajorityElement(int[] arr){
        int value = validCandidate(arr);
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(value==arr.length){
                count++ ;  //same element ,increase in freq
            }
            else{
                count--; // decrease the freq,map it with value
            }
        }
        if(value>arr.length/2){
            System.out.println("Majority Element is "+value);
        }
        else{
            System.out.println("No Majority Element exist ");
        }
    
    }
    public static int validCandidate(int[] arr){
        int val =arr[0];
        int count=1;

        for(int i=1;i<arr.length;i++){
            if(val==arr[i]){
                //if same element is present at next 
                count++;
            }
            else {
                //here we form the distinct pair , map it with val element
                
                count--;
            }
            if(count==0){
                val=arr[i];
                count=1;
            }
        }
        return val; //value has potential for majority candidate 
    }

}
