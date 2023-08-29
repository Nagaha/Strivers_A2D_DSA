 public int reverse(int x) {
        long rev=0;
        boolean flag=false;
        if(x<0)  {flag=true;
        x=x*-1;
        }
        while(x>0){
            int temp=0;
            temp=x%10;
            rev=rev*10+temp;
            x/=10;
        }
        
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        if(flag==true) return (int)(-1*rev);
        return (int)rev;
    }