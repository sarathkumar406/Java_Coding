import java.util.*;
class Missing_elements_range 
{
	public static void main(String[] args) 
	{
		Integer[] ar = {10, 12, 11, 15};
		int low = 10, high = 15;
		missingElements(ar,low,high);
	}

	static void missingElements(Integer[] arr, int low, int high)
	{
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
		
		for(int i =low;i<=high;i++)
		{
			if(!hs.contains(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}
