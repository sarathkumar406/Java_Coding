class BalancedArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {5,5,2,5,8};
		int n = arr.length;
		System.out.println(balanceArray(arr,n));
	}

	private static int balanceArray(int[] arr, int n){

		int even =0, odd = 0;
		for(int i =0;i<n;i++)
		{
			if(i % 2 ==0)
				even+=arr[i];
			else
				odd+=arr[i];
		}
		int ans = 0;
		int prevOdd = 0, prevEven =0;
		for(int i =0;i<n;i++)
		{
			int x = even - prevEven;
			int y = odd - prevOdd;

			if(i%2==0)
				x-=arr[i];
			else
				y-=arr[i];
			if(prevOdd + x == prevEven + y)
				ans++;
			if(i%2==0)
				prevEven+=arr[i];
			else
				prevOdd+=arr[i];
		}
		return ans;
	}
}
