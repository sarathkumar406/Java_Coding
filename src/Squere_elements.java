class Squere_elements 
{
	public static void main(String[] args) 
	{
		int[] nums = {-4,-1,0,3,10};
		for(int i =0;i<nums.length;i++)
		{
			nums[i] = nums[i]*nums[i];
		}
		Arrays.sort(nums);
		for(int i =0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}
