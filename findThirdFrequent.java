public class findThirdFrequent {
    public static void main(String[] args) {
        String str = "AmitKomalammyapa";
        str=str.toLowerCase();
        char[] string = str.toCharArray();
        int i;
        int[] freq = new int[str.length()];

        for(i=0;i<str.length();i++){
            freq[i]=1;
            for(int j=i+1;j<str.length();j++){
                if(string[i]==string[j]){
                    freq[i]++;

                    string[j]='0';//to avoid printing visited char
                }
            }

        }

        //displaying
        for( i=0;i<freq.length;i++){
            if(string[i]!=' ' && string[i]!='0'){
                System.out.println(string[i]+ " - "+freq[i]);
               
            }
            
        }System.out.println("-----");
        
    }
}    

