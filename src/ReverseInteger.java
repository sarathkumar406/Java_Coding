class ReverseInteger 
{
	public static void main(String[] args) 
	{
		int n = 1534236469;
		int rem = 0;
		int res = 0;
		if( n > -(Math.pow(2,32)) || n < (Math.pow(2,31)-1))
			return;
		while(n!=0){
			rem = n%10;
			res = (res * 10) + rem;
			n = n/10;
		}


		System.out.println(res);
		System.out.println(Math.pow(2,31));
	}
}
