import java.util.Arrays;

public class SameSet {

	public static void main(String[] args) {
		
		String str = "sarath";
		String str1 = "htasra";
		checkSameSet(str,str1);
	}

	private static void checkSameSet(String str, String str1) {
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(ch.length!=ch1.length)
		{
			System.out.println("Length of the two Strings should be Same");
			return;
		}
		boolean res = true;
		for(int i =0;i<ch.length;i++) {
			if(ch[i]!=ch1[i]) {
				res = false;
			}
			
		}
		if(res)
		{
			System.out.println("Same Set of Characters");
		}
		else
		{
			System.out.println("Not a Same Set of Characters");
		}
		
	}

}
