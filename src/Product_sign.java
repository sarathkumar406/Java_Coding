class Product_sign 
{
	public static void main(String[] args) 
	{
	//	int[] arr = {1,5,0,2,-3};
//		int[] arr = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
		int[] arr = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
		ArraySign(arr);
	}
	static void ArraySign(int[] arr)
	{
		int product = 1;
		for(int i =0;i<arr.length;i++)
		{
			int p = 1;
			if(arr[i]>0)
				p = 1;
			else if(arr[i] < 0)
				p = -1;
			else
				p = arr[i];

			product*=p;
			System.out.println("product "+product);
		}
		System.out.println(product);
		if(product>0)
			System.out.println("1");
		else if(product<0)
			System.out.println("-1");
		else
			System.out.println("0");
	}
}
