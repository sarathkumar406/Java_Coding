class Sample1233 
{
	public static void main(String[] args) 
	{
		String str = "I am a good boy";
		StringBuilder sb = new StringBuilder();
		String[] s = str.split(" ");
		for(int i =0;i<s.length;i++)
		{
			for(int j = s[i].length()-1;j>=0;j--)
			{
				sb.append(s[i].charAt(j));
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
		
	}
}
