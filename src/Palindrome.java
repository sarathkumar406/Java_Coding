class Palindrome 
{
	public static void main(String[] args) 
	{
		int num = -121;
		boolean res = checkPalindrome(num);
		System.out.println(res);
	}
	static boolean checkPalindrome(int n){
		int reversed = 0;
		int temp = n;
		while(n>0)
		{
			int rem = n%10;
			reversed = reversed * 10 + rem;
			//System.out.println(rem);
			n/=10;
		}
		if(temp == reversed)
			return true;
		else
			return false;
		
	}
}
