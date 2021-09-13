import java.util.ArrayList;
import java.util.Arrays;

public class KthfrequentNum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.asList(1, 4, 4, 4, 2, 2, 2, 5, 5,5, 5, 5, 7, 7, 8, 8, 8, 8);    
        int k=3; //find 3rd frequent number 
        ArrayList<Integer> a = new ArrayList<>(findKthMostOccuring(arr, k));
        System.out.println("[");
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i)+" ");
        }
        if(a.size() >= 1){
            System.out.println((int)a.get(a.size()-1)+"]");
        }

    }
    static int findKthMostOccuring(ArrayList<Integer> arr,int k){
        return k;
    }

}
