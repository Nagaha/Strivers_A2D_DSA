import java.util.Scanner;
public class UserIO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class gets the input
        char c=sc.next().charAt(0);
        if((int)c>=65 && (int)c<=90){
            System.out.println(1);
        }
        else if((int)c>=97 && (int)c<=122){
            System.out.println(0);
        }
        else System.out.println(-1);;
    }
}