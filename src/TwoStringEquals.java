class TwoStringEquals 
{
	public static void main(String[] args) 
	{
		String[] word1 = {"a", "cb"};
		String[] word2 = {"a", "bc"};

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		for(int i =0;i<word1.length;i++)
		{
			sb1.append(word1[i]);
		}
		for(int i =0;i<word2.length;i++)
		{
			sb2.append(word2[i]);
		}

		if(sb1.toString().equals(sb2.toString()))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
