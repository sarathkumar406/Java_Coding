class Traversing 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,2,3};
		int n = arr.length;
		for(int i =0;i<n-1;i++)
		{
			arr[arr[i]%n] +=n; 
		}

		for(int i =0;i<arr.length;i++)
		{
			if(arr[arr[i]/n] > 1)
				System.out.println(arr[i]);
		}

	}
}
