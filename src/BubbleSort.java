class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,1,5,6,3,8};
		int n = arr.length;
		boolean flag = true;
		for (int i=0;i<n-1;i++)
		{
			flag = false;
			for (int j=0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag)
				break;
		}

		for (int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
