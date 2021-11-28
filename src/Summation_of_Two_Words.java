import java.util.*;
class Summation_of_Two_Words 
{
	public static void main(String[] args) 
	{
		String firstWord = "acb", secondWord = "cbah", targetWord = "cdb";
		int firstWordSum = 0;
		int secondWordSum = 0;
		int targetWordSum = 0;
		for(int i =0;i<firstWord.length();i++)
		{
			int n = (int)firstWord.charAt(i);
			int count = n-97;
			 firstWordSum = firstWordSum*10+count;
		}
		for(int i =0;i<secondWord.length();i++)
		{
			int n = (int)secondWord.charAt(i);
			int count = n-97;
			 secondWordSum = secondWordSum*10+count;
		}
		for(int i =0;i<targetWord.length();i++)
		{
			int n = (int)targetWord.charAt(i);
			int count = n-97;
			 targetWordSum = targetWordSum*10+count;
		}
		if(targetWordSum == (firstWordSum + secondWordSum))
			System.out.println(true);
		else
			System.out.println(false);
		
//		System.out.println("hellowolrd"+10+20);
	}
}
