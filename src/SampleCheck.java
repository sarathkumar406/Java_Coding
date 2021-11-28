import java.util.*;

class SampleCheck 
{

	public static void main(String[] args) 
	{
		
		int[] arr = {1,4,3,5,2};
		int temp;
		for(int j =0;j<=arr.length-1;j++){
		for (int i =0;i<=arr.length-2 ;i++ )
		{
			if(arr[i] > arr[i+1])
			{
				 temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		}

		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
