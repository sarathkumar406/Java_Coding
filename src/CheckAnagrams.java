import java.util.*;
class CheckAnagrams 
{
	public static void main(String[] args) 
	{
		String[] arr = {"bfj","tro","ffa","rph"};
		HashMap<String,List<String>> hm = new HashMap<>();
		
		for(int i =0;i<arr.length;i++)
		{
			String str = arr[i];
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String s = new String(ch);

			if(hm.containsKey(s))
			{
				hm.get(s).add(str);
			}
			else
			{
				List<String> words = new ArrayList<>();
				words.add(str);
				hm.put(s,words);
			}
		}
	
	List<List<String>> res = new ArrayList<>();
		for(String str : hm.keySet())
		{
			List<String> values = hm.get(str);
			if(values.size() > 1)
			{
				res.add(values);
			}
		}

		System.out.println(""+res);
	}
}


//8179839919