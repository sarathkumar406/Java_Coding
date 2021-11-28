class SlidingTechnique_MaxEachSubarray 
{
	public static void main(String[] args) 
	{
		int[] arr =  {2, 5, -1, 7, -3, -1, -2};
		int k = 4;
		int n = arr.length;
		int sum=0;
		for(int i =0;i<n-k+1;i++)
		{
			int max = arr[i];
			int min = arr[i];
			for(int j=0;j<k;j++)
			{
				//System.out.print("  "+arr[j]+" ");
				max = Math.max(max,arr[i+j]);
				min = Math.min(min,arr[i+j]);
			}
			sum+=(min+max);
			System.out.println("Sum of each subarray : "+(min+max));
			//System.out.println("max of each subarray : "+max);
			//System.out.println(" ");
		}
		System.out.println("final results : "+sum);

	}
}
