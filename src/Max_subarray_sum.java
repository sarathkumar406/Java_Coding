class Max_subarray_sum 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[] arr = {1,9,-1,-2,7,3,-1,2};
		int k = 4;
		int res = findMax(arr,k);
		System.out.println("res -------->>> "+res);
	}
	
	//Brute Force Solution
	/*
	public static int findMax(int[] arr, int k)
	{
		int maxSum = 0;
		for(int i = 0;i<arr.length-k;i++)
		{
			int wSum = 0;
			for(int j=i;j<i+k;j++)
			{
				wSum+=arr[j];
			}
			maxSum = Math.max(maxSum,wSum);
		}
		return maxSum;
	}
	*/

	//Sliding Window Approach

	public static int findMax(int[] A, int k)
	{
		int maxSum =0, wSum =0;
		for(int i = 0;i<k;i++)
		{
			wSum+=A[i];
		}
		for(int end=k;end< A.length;end++)
		{
			wSum+=A[end]-A[end-k];
			maxSum = Math.max(wSum,maxSum);
		}
		
		return maxSum;
	}
	
}
