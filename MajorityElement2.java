import java.util.ArrayList;
import java.util.Scanner;

/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Input: nums = [3,2,3]
Output: [3]

*/
public class MajorityElement2 {
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
        ArrayList<Integer> value = majorityElement2(arr);
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(value.equals(n)){
            }
            else{
            }
        }
        if(value.equals(n/3)){
            System.out.println("Majority Element is "+value);
        }
        else{
            System.out.println("No Majority Element exist ");
        }
    
    }
    public static boolean isGreaterThanNo3(int[] arr,int val) {
        int count=0;
        for(int ele: arr){
            if(ele==val){
                count++;
            }
        }
        return count>arr.length/3;
        }
    public static ArrayList<Integer> majorityElement2(int[] arr){
        int val1 = arr[0];int count1=1;
        int val2=arr[0]; int count2=0;

        int i=1;
        while(i<arr.length){
            if(arr[i]==val1){
                count1++;
            }
            else if(arr[i]==val2){
                count2++;
            }
            else{
                if(count1==0){
                    val1=arr[i];
                    count1=1;
                }
                else if (count2==0){
                    val2=arr[i];
                    count2=1;
                }
                else{
                    count1--;
                    count2--;
                }

            }
            i++;
        }
        //val1 and val2 are potential candidate
        ArrayList<Integer> res= new ArrayList<>();

        if(isGreaterThanNo3(arr,val1)==true){
            res.add(val1);
        }
        if((val1!=val2)&&isGreaterThanNo3(arr,val2)==true){
            res.add(val2);
        }
        return res; 
    }
}
