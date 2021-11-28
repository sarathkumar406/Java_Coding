import java.util.*;
class OddFrequency 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,3,40,50,60,70,70,55,55,33,3));
		Map<Integer,Integer> res = oddFrequencyCount(al);
		System.out.println(res);
	}

	private static Map<Integer,Integer> oddFrequencyCount(List<Integer> al){
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<al.size();i++){
			if(al.get(i)%2!=0)
			{
				if(hm.containsKey(al.get(i)))
				{
					hm.put(al.get(i),hm.get(al.get(i))+1);
				}
				else
				{
					hm.put(al.get(i),1);
				}
			}
		}
		return hm;
	}
}
