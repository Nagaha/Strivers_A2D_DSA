public class Pattern16 {
    public static void main(String args[]){
        int ch=65;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)ch);
            }
            ch++;

            System.out.println();
        }
    }

}
