public class countPrime {
    public static void main(String[] args) {
        int p=countPrimes(10);
        System.out.println(p);
    }
    public static int countPrimes(int n){
        int count=0;
        int i;
        boolean[] m = new boolean[n];  //initially it is m[i]=false
        for(i=2;i<n;i++){
            if(m[i]){
                continue;
            }
            count++;
            for(int j=i;j<n;j=j+i){
                m[j]=true;
            }
        }
        return count;
    }
}
