public static int sumOfAllDivisors(int n){
        int sum=0;
        // Write your code here.
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i%j==0) sum+=j;
            }
        }
        return sum;
    }