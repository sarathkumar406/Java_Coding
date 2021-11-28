class GreaterThanInitialSum 
{
	public static void main(String[] args) 
	{
		int[] arr = {4, 2, 1, 10, 6};
		int n = arr.length;
		int sum = 0;
		for(int i = 0;i<n;i++)
		{
			sum+= arr[i];
		}
		System.out.println("minimum value to be assigned for greater sum :" +((int)(sum/n)+1));
	}
}
