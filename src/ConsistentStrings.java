class  ConsistentStrings
{
	public static void main(String[] args) 
	{
		String[] a =  {"cc","acd","b","ba","bac","bad","ac","d"};
		String aa = "cad";
		int res = countConsistentStrings(aa,a);
		System.out.println("res  "+res);
	}

	public static int countConsistentStrings(String allowed, String[] words) {
        
		if(words!=null && words.length==0)
			return 0;
		int count =0;
		for(int i=0;i<words.length;i++)
		{
			String str = words[i];
			int count1 = 0;
			for(int j=0;j<str.length();j++)
			{
				int index = allowed.indexOf(str.charAt(j));
				if(index!=-1)
				{
					count1++;
				}
			}
			if(count1==str.length())
			{
				count++;
			}
		}
		return count;
    }
}
