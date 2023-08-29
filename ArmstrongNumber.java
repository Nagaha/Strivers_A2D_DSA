public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int sum=0;
		int temp=0;
		while(n>0){
			temp=n%10;
			sum=sum+(temp*temp*temp);
			n=n/10;
		}
		System.out.println(sum==x?true:false);

	}