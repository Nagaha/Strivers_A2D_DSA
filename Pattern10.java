public class Pattern10 {
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){//First half of the arrow right angled triangle
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }//Inverted right angled triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
