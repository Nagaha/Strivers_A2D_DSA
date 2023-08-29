import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        ArrayList<Long> ans=new ArrayList();
        long fac=1;
        long i=1;
        while(fac<=n){
            ans.add(fac);
            i++;
            fac=fac*i;
        }
        return ans;

    }
}
