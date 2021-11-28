class ReverseArray_7 
{
	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,40,50};
		int[] res =	reverseArray(arr);
		for(int i =0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
	private static int[] reverseArray(int[] arr){

		int n = arr.length;
		int count = 0;
		int[] res = new int[n];
		for(int i =n-1;i>=0;i--){
			res[count++] = arr[i];
		}
		return res;
	}
}
