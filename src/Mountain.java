class Mountain 
{
	public static void main(String[] args) 
	{
		int[] arr = {5,6,1,2,3,4,5,4,3,2,0,1,2,-2,4};
		int res = mountainCheck(arr);
		System.out.println(res);
	}

	private static int mountainCheck(int[] a){
		int n = a.length;
		int largest = 0;
		for(int i=1;i<=n-2;)
		{
			if(a[i] > a[i-1] && a[i] > a[i+1])
			{
				//do some work
				int cnt = 1;
				int j =i;
				//backward direction
				while(j>=1 && a[j] > a[j-1])
				{
					j--;
					cnt++;
				}
				//forward direction
				while(i<=n-2 && a[i] >a[i+1])
				{
					i++;
					cnt++;
				}
				largest = Math.max(largest,cnt);
			}
			else
			{
				i++;
			}
		
		}
		return largest;
	}
}
