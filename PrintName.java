 static int i=0;
    public static void printNtimes(int n){
        // Write your code here.
        if(i==n) return;
             System.out.print("Coding Ninjas ");
             i++;
             printNtimes(n);
        }