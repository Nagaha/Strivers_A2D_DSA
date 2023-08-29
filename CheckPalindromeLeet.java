 public boolean isPalindrome(int x) {
        int temp=0;
        int rev=0;
        int y=x;
        if(x<0){
            return false;
        }
        else{
            while(x>0)
             {temp=x%10;
             rev=rev*10+temp;
             x=x/10;}
        }
        return rev==y?true:false;
    }