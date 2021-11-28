class String_check 
{
	public static void main(String[] args) 
	{
		String str = "warriors";
		
		StringBuilder sb=new StringBuilder();  
		String[] s = str.split(" ");
		String[] res = new String[s.length];
		int count =0;
		for(String st : s)
		{
			StringBuilder sb1=new StringBuilder(st);
			if(st.length()>=5){
				res[count++]=sb1.reverse().toString();
			}
			else
			{
				res[count++]=st;
			}
		}
		String ss = "";
		int count1 = 1;
		for(int i =0;i<res.length;i++){
			if(count1== res.length)
				ss+=(res[i]);
			else
				ss+=(res[i]+" ");
			count1++;
			System.out.println(res[i]);
		}
		System.out.println("ssss "+ss);
		System.out.println(ss.length());
	}
}
