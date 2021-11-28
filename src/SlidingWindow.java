class SlidingWindow 
{
	public static void main(String[] args) 
	{
		int[] arr =  {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		int max = Integer.MIN_VALUE;

		for(int i =0;i<arr.length-k+1;i++)
		{
			int sum = 0;
			for(int j=0;j<k;j++)
			{
				sum+=arr[i+j];
			}

			max = Math.max(sum,max);
		}
		System.out.println("max ___________ "+max);
	}
}
