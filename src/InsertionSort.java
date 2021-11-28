class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,1,5,6,3,8};
		int n = arr.length;
		int temp, j;
		for(int i =0;i<n;i++)
		{
			temp = arr[i];
			j = i-1;

			while(j>=0 && arr[j] > temp )
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}

		for (int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
