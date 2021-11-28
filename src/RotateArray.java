class RotateArray 
{
	public static void main(String[] args) 
	{
		int[] ar = {1,2,3,4,5,6,7};

		//
		//[1,2,3,4,5,6,7]
//3
		int k =3;
		int[] res = new int[ar.length];
		int count =0;
		for(int i =k;i<ar.length;i++)
		{
			res[count++] = ar[i];
		}
		System.out.println(count);
		for(int i =0;i<k;i++)
		{
			res[count++] = ar[i];
		}

		for(int i =0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}
