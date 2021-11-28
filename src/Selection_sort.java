import java.util.Arrays;
import java.util.ArrayList;
class Selection_sort 
{
	public static void main(String[] args) 
	{
		int[] A = {7,4,10,8,3,1};
		int n = A.length;
		
		for(int i =0;i<n-1;i++)
		{
			int min = i;
			System.out.println("min values "+min);
			for(int j = i+1; j<n;j++)
			{
				if(A[j] < A[min])
				{
					min = j;
				}
			}
			if(min!=i)
			{
				int temp = A[i];
				A[i] = A[min];
				A[min] = temp;
				
			}
		}
		for(int i =0;i<n;i++){
			System.out.print(A[i]+" ");
		}
	}

	//public static void swap(int A[i] , int A[min]){
		
		
				//System.out.println("===i=after=="+A[i]+" =====min======"+A[min]);
	//}
}
