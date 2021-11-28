class UniqueChar 
{
	public static void main(String[] args) 
	{
		String str = "leetcode";

		int res = firstUniqueChar(str);
		System.out.println(res);
	}

	private static int firstUniqueChar(String str){

		int length = str.length();
		LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
		for(char c:ch){
			lhm.containsKey(ch).
		}

	}
}

