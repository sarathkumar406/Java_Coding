class Balance_String 
{
	public static void main(String[] args) 
	{
		String str = "RLLLLRRRLR";
		int bal = 0;
		int count = 0;
		for(int i =0;i<str.length();i++)
		{	
			if(str.charAt(i)=='L')
			{
				bal++;
			}
			else
			{
				bal--;
			}
			if(bal==0)
				count++;
		}

		System.out.println("count value ______ "+count);
	}
}
