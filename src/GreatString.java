import java.util.Stack;
class GreatString 
{
	public static void main(String[] args) 
	{
		String s = "leEeetcode";
		String str = makeGood(s);
		System.out.println(str);
	}
	static String makeGood(String s){

		Stack<Character>  st = new Stack<>();

		for(int i =0;i<s.length();i++)
		{
			if(!st.isEmpty() && Math.abs(st.peek()-s.charAt(i))==32)
			{
				st.pop();
			}
			else
			{
				st.push(s.charAt(i));
			}
		}

		char res[] = new char[st.size()];
		for(int i=res.length-1;i>=0;i--){
			res[i] = st.pop();
		}
		return new String(res);
	}
}
