class PatternCheck 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int count = 1;
		for(int i = n;i> 0;i--)
		{
			int ans = i;
			for(int j=1;ans > 0;j++)
			{
				if(ans >=2){
				System.out.print("*");
				System.out.print(count++);
				}else if(ans ==1)
				{
					System.out.print("*");
				}
				//System.out.println("ans --"+ans);
				ans-=2;
			}
			
			System.out.println("");
		}
	}
}
