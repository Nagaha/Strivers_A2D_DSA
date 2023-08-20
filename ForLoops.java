import java.util.Scanner;
public class ForLoops {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n==1 || n==2) System.out.println(1);
            else  {int n1=1,n2=1;
                int temp=0;
                while(--n>=2){
                    temp=n2+n1;
                    n1=n2;
                    n2=temp;
                }
                System.out.println(n2);}
        }

    }


