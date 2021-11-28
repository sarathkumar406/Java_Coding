class Fibonacci_Num 
{
	public static void main(String[] args) 
	{
		int n = 9;
		int res = fibonacci(n);
		System.out.println(res);
	}

	static int fibonacci(int n){

		if(n<=1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
}
