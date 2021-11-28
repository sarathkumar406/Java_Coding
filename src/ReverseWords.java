class ReverseWords 
{
	public static void main(String[] args) 
	{
		String str = "sarath kumar";
		String[] s = str.split(" ");
		StringBuffer sb1 = new StringBuffer();
		for(int i =0;i<s.length;i++)
		{
			StringBuffer sb = new StringBuffer(s[i]);
			sb1.append(sb.reverse().toString()+" ");
		}
		System.out.println(sb1.toString().trim());
	}
}
