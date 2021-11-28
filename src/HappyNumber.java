class HappyNumber 
{
	public static void main(String[] args) 
	{
		int num = 2;
		
		boolean res = happyNumber(num);
		System.out.println(res);
	
	}

	static boolean happyNumber(int n)
	{
		if(n==1 || n==7)
			return true;
		int pro = n;
		int x = n;
		while(pro >9){
			pro = 0;
			while(x>0)
			{
				int rem = x%10;
				pro = pro+(rem * rem);
				x/=10;
			}
			if(pro==1)
				return true;
			x = pro;
		}
		if(pro == 7)
			return true;

		return false;
	}
		
	
}
