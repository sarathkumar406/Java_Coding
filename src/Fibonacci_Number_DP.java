class Fibonacci_Number_DP 
{
	public static void main(String[] args) 
	{
		int n = 9;
		int res = fibonacci_dp(n);
		System.out.println("res ---->>> "+res);
	}

	static int fibonacci_dp(int n){
		int[] fib  = new int[n+2];
		fib[0] = 0;
		fib[1] = 1;

		for(int i =2;i<=n;i++)
		{
			fib[i] = fib[i-1]+fib[i-2];
		}

		return fib[n];
	}
}
