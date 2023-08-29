public static String isPrime(int num) {
		//Your code goes here
		int count=0;
		if(num<=1) return "NO";
		for(int i=1;i<=num;i++){
			if(num%i==0) count++;
		}
		if(count>2) return "NO";
		return "YES";
	}