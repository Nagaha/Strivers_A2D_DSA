public class Pattern15 {
    public static void main(String args[]){
        int n=5;
        int ch=65;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print((char)ch);
                ch++;
            }
            ch=65;
            System.out.println();
        }
    }
}
