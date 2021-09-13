class findElementInfinityArr{
    
    static int binarySearch(int arr[] ,int l,int r ,int k){

        if(r>=l){
            int mid= l+(r-l)/2;

            if(arr[mid]==k){
                return mid;
            }

            if(arr[mid]>k)
                return binarySearch(arr, l, mid-1, k);

            return binarySearch(arr, mid+1, r, k);
            
        }
        return -1;
    }


    static int findPos(int arr[],int key){
        int l=0;int h=1;
        int val=arr[0];
    while(arr[h]<key){
       
        l=h;

       // h=2*h;
        if(2*h <arr.length-1)
           h=2*h;
        
        else
           h=arr.length-1;
     

       val=arr[h];
    }
    //l=h/2;
        return binarySearch(arr, l, h, key);
    }
    public static void main(String[] args) {
        int arr[]= new int[]{3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};

        int ans= findPos(arr,90);
        if(ans==-1){
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at "+ans+"th index");
    }
}