class SortingArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,5,6,3,8};

		int n = arr.length;
		System.out.println("Before sorting");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		boolean flag = true;
		for (int i=0;i<arr.length-1;i++)
		{
			flag = false;
			for (int j=0;j<arr.length-i-1;j++)
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
			{
				break;
			}
		}
		System.out.println();
		System.out.println("After sorting");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
