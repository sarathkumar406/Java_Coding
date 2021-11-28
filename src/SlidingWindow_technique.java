class SlidingWindow_technique 
{
	public static void main(String[] args) 
	{
		int[] arr =  {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		int n = arr.length;
		int curr_sum = 0;

		for(int i =0;i<k;i++)
		{
			curr_sum+=arr[i];
		}
		
		int win_sum = curr_sum;

		for(int i=k;i<n;i++)
		{
			win_sum += arr[i] - arr[i-k];
			//curr_sum = Math.max(curr_sum,win_sum);
			if(win_sum > curr_sum)
			{
				curr_sum = win_sum;
			}
			System.out.println("max of each subarray : "+curr_sum);
		}
		
		System.out.println(curr_sum);
	}
}
