class SmalletElement 
{
	public static void main(String[] args) 
	{
		int[] arr = {4,7,8,1,2};
		int total = arr.length;
		int n = 2;
		//int temp;
		for(int i =0;i<total;i++){
			for(int j=i+1;j<total;j++){
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[n-1]);
	}
}
