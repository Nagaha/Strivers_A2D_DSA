 public static boolean palindromeNumber(int n){
        // Write your code here.
        int dup=n;
        int temp=0;
        int rev=0;
        while(n>0){
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        return dup==rev?true:false;
    }