import java.util.*;
class Duplicates_array 
{
	public static void main(String[] args) 
	{
		int[] arr = {4,4,1,2,3,2,3,3,4,4};
		ArrayList<Integer> al = duplicates(arr);
		System.out.println(al);
	}
	public static ArrayList<Integer> duplicates(int[] arr)
	{
		Set<Integer> s = new TreeSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0;i<arr.length;i++)
		{
			if(s.contains(arr[i]))
			{
				if(!al.contains(arr[i]))
					al.add(arr[i]);
			}
			else
			{
				s.add(arr[i]);
			}
		}
		System.out.println(s);
		if(al.size()==0)
			al.add(-1);

		return al;
		
	}
}

/*1- Traverse the given array from i= 0 to n-1 elements
     Go to index arr[i]%n and increment its value by n.
2- Now traverse the array again and print all those 
   indexes i for which arr[i]/n is greater than 1.

This approach works because all elements are in range
from 0 to n-1 and arr[i]/n would be greater than 1
only if a value "i" has appeared more than once.
*/