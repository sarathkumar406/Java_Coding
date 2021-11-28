class Adding 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 15, 20, 25, 30,20,10};
		int n = arr.length;
		int[] a = add(arr,n);
		if(a.length!=1)
			add(a,a.length);
		
		System.out.println("Hello World!");
	}

	public static int[] add(int[] arr, int n){
		int[] a = new int[n/2+1];
		int count = 0;
		for(int i =0;i<n;i+=2)
		{
			System.out.println(i);
			System.out.println("n--"+n);
			if((i+1) < n){
				System.out.println(arr[i]+arr[i+1]);
				a[count++] = arr[i]+arr[i+1];
			}
			else{
				System.out.println(arr[i]);
				a[count++] = arr[i];
			}
		}
	}
}
