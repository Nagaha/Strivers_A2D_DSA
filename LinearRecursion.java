      public static void rec(int i,int ans[],int x){
        if(i==x){
            return;
        }
        ans[i]=i+1;
        rec(i+1,ans,x);
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int i=0;
        int ans[]=new int[x];
        rec(i, ans, x);
        return ans;
       
}
