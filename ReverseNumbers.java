public static long reverseBits(long n) {
		// Write your code here
		long val=0;
		long rem=0;
		for(int i=0;i<32;i++){
			rem=n%2;
			n=n/2;
			val+=rem;
		}
		return val;
	}