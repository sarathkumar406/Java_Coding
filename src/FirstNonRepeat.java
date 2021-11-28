import java.util.*;
class FirstNonRepeat 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,1,2,2,3,4};
		LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
		for(int i =0;i<arr.length;i++){
			if(lhm.containsKey(arr[i])){
				lhm.put(arr[i],lhm.get(arr[i])+1);
			}
			else
			{
				lhm.put(arr[i],1);
			}
		}

		System.out.println(lhm);

		for(Map.Entry<Integer,Integer> entry : lhm.entrySet())
		{
			//System.out.println(entry.getKey());
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}
		
	}
}
