class Find_Zeros_Ones 
{
	public static void main(String[] args) 
	{
		String[] str = {"10","0","1"};
		int a = 1;
		int b = 1;
		int res = findMaxForm(str,a,b);
		System.out.println("result is : "+res );
	}

	
    public static int findMaxForm(String[] S, int M, int N) {

		int[][] dp = new int[M+1][N+1];

		for(String str : S)
		{
			int zeros =0, ones =0;
			for(char c : str.toCharArray())
			{
				if(c=='0')
				{
					zeros++;
				}
				else
				{
					ones++;
				}
			}
			for(int i =M;i>=zeros;i--)
			{
				for(int j =N;j>=ones;j--)
				{
				dp[i][j] = Math.max(dp[i][j],dp[i-zeros][j-ones]+1);
				}
			}
		}
		return dp[M][N];
	}
}
