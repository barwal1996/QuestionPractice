public class findMissingNum {
    public static void main(String[] args) {
        int arr[]={3,0,1,5,6,2};
       
     findMissingNumber(arr);
    // System.out.println(miss);
    }
    static int findMissingNumber(int[] nums){
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;

        int calcSum = 0;
        for (int num : nums) {
            calcSum += num;
        }
        int res= sum-calcSum;
        System.out.println(res);
        return sum - calcSum;
    }
}
