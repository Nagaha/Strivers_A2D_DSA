public static int calcGCD(int n, int m){
        // Write your code here.
        int gcd=0;
        for(int i=1;i<=Math.max(n,m);i++){
            if(n%i==0 && m%i==0){
                gcd=Math.max(gcd,i);
            }
        }
        return gcd;
    }