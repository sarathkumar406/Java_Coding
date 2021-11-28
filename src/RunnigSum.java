class RunnigSum 
{
	public static void main(String[] args) 
	{
		int[] arr = {3,1,2,10,1};
		int[] res = new int[arr.length];
		int sum = arr[0];
		int count =0;
		res[count] = sum;
		for(int i = 1;i<arr.length;i++)
		{
			sum = sum+arr[i];
			res[++count] = sum;
		}

		for(int c : res)
		{
			System.out.print(c+" ");
		}
	}
}
