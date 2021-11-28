class MaxValue_2 
{
	public static void main(String[] args) 
	{
		int[] arr = {110,20,40,80,90};
		int max = arrayMaxValue(arr);

		System.out.println("Max value from the given array is : "+max);
	}

	private static int arrayMaxValue(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++){
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
}
