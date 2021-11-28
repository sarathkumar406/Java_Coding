class RunningSum2 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,1,1,1,1};
		int sum = arr[0];
		int count =0;
		for(int i = 1;i<arr.length;i++)
		{
			sum = sum+arr[i];
			arr[++count] = sum;
		}

		for(int c : arr)
		{
			System.out.print(c+" ");
		}
	}
}
