import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElementGeneral {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 1, 2, 2, 3, 5, 4,2, 2, 3, 1, 1, 1 };
        
        int k = 4;
        ArrayList<Integer> res = MajorityElement(arr,k);
        System.out.println(res);
    }

    private static ArrayList<Integer> MajorityElement(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= arr.length;
        //1.Fill hashMap(Frequency Map)
        for(int i=0;i<n;i++){
            int key = arr[i];
            if(map.containsKey(key) == true){
                map.put(key, map.get(key)+1);
            }
            else{
                map.put(key, 1);
            }

        }
            ArrayList<Integer> res = new ArrayList<>();
            //2. travel in hashMap and fill the result 
            for(int key:map.keySet()){
                if(map.get(key)>n/k){
                    res.add(key);
                }
            }

             Collections.sort(res);
            return res;
    }
}
