class SumTwoElements 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 15, 20, 25, 30};
		int res = sumElments(arr);
	}

	private static int sumElments(int[] arr){
		int n = arr.length;
		System.out.println(n);
		
		int sum =0;
		while(n!=1)
		{
			int[] res = new int[n];
			int count =0;
			for(int i =1;i<=n-1;++i){
				int sumEle = arr[i-1]+arr[i];
				sum = sumEle;
				res[count++] = sum;
				++i;
				if(i==n-1 && n%2!=0){
					sum = arr[n-1];
					res[count++] = sum;
				}
				System.out.println("sum--->> "+sum);
				System.out.println("iiii"+i);
				System.out.println("count "+count);
			}
			n = res.length;
			System.out.println("n  -- "+n);
			arr = res;
			break;
			
			
		}
		return sum;
	}
}
