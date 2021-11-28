class PascalsTriangle 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int num = 1;
		for(int i =0;i<n;i++)
		{
			for(int space =1;space<=n-i;space++)
			{
				System.out.print(" ");
			}
			 num = 1;
			for(int j =0;j<=i;j++)
			{
				System.out.print(num+" ");
				num = num * (i-j) / (j+1);
			}
			System.out.println();
		}
	}
}
