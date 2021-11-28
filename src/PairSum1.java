class PairSum1 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,4,2,5,7};
		int k = 2;
		int curr_sum = 0;
		int n = arr.length;
		for(int i =0;i<k;i++)
		{
			curr_sum += arr[i];
		}
		
		int win_sum = curr_sum;

		for(int i =k;i<n;i++)
		{
			win_sum += arr[i] - arr[i-k];
			if(win_sum > curr_sum)
			{
				curr_sum = win_sum;
			}
		}
		System.out.println("PairSum "+curr_sum);	
	}
}
