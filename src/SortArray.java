class SortArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,4,3,5,2};

		for (int i : arr )
		{
			System.out.print(i+" ");
		}


		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j =0;j<=arr.length-2;j++ )
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println();

		for (int i : arr )
		{
			System.out.print(i+" ");
		}
	}
}
