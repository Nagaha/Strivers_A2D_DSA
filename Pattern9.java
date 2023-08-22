public class Pattern9 {
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){//Straight pyramid
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }//Inverted pyramid
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n*2-2*i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
