import java.util.*;
/*
Approach -:
Sort the array 
take visited array of same length 
take 2 loop j starts from i+1
if visited[i]] is true  then we will skip the statement 


otherwise check while condition
and increment j++

if visited[j++]=true
return true we got the pair

Time Complexity = O(nLogn)

*/
public class ArrayOfDoubledPairs {
    public static void main(String[] args) {
        int [] arr = {-1,-2,3,6};
        System.out.print(canReorderDoubled(arr));
    }
    public static boolean canReorderDoubled(int[] arr){
        Arrays.sort(arr);
        boolean[] visited = new boolean[arr.length];

        for(int i=0,j=1;i<arr.length;i++){
        if(visited[i]){
            continue;
        }
        while(j<arr.length && 2*arr[i]!=arr[j] && arr[i]!=2*arr[j]){
            j++;
        }
        if(j==arr.length){
            return false;
        }
        visited[j++]=true;
    }
        return true;
    }
}