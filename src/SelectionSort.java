class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,1,5,6,3,8};
		int n = arr.length;
		int min, temp;
		for (int i=0;i<n-1;i++)
		{
			min = i;
			for(int j =i+1;j<n;j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}

			 temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
