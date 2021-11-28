import java.util.*;
class DuplicateConsecutiveCharacters 
{
	public static void main(String[] args) 
	{
		String str = "aabbbcdede"; // abcdede
		// 1 (a,a)  2 (a,b) 3 (b,b) i = 1 equals j =1 
		//a , b,
		int j=0;
		char[] arr = str.toCharArray();

		for(int i =0;i<arr.length;i++)
		{
			if(arr[j]!=arr[i])
			{
				j++;
				arr[j] = arr[i];
			}
		}
		

		char[] res = Arrays.copyOfRange(arr,0,j+1);
			
		for(char c : res)
		{
			System.out.print(c);
		}
		System.out.println();
		//System.out.println("String str ________ "+sb.toString());

	}
}
