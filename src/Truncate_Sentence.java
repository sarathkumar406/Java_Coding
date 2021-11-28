class Truncate_Sentence 
{
	public static void main(String[] args) 
	{
		int t = 4;
		String str = "Hello how are you Contestant";
		String res = truncateSentence(str,t);
		System.out.println(res);
	}
	public static String truncateSentence(String s, int k) {
       
		StringBuffer sb = new StringBuffer();
		if(s!=null)
		{
			String[] ss = s.split(" ");
			for(int i =0;i<k;i++){
				sb.append(ss[i]+" ");
			}
		}
		return sb.toString().trim();
    }
}
