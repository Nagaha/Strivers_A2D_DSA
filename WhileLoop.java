import java.util.Scanner;
public class WhileLoop {
        public static void main(String[] args) {
            // Write your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int evensum=0;
            int oddsum=0;
            while(n!=0){
                if(n%2==0)  evensum+=n%10;
                else oddsum+=n%10;
                n=n/10;
            }
            System.out.println(evensum +" "+oddsum);
        }
    }

