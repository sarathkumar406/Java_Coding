import java.util.*;
import java.util.Map.*;
class FirstRepeating_Element 
{
	public static void main(String[] args) 
	{
		int[] arr = {4,1,2,3,4,5,6,3,2,3,4};
		int n = arr.length;
		LinkedHashMap<Integer,Integer> al = new LinkedHashMap<>();
		for(int i =0;i<n;i++)
		{
			if(al.containsKey(arr[i]))
			{
			    al.put(arr[i],al.get(arr[i])+1);
			}
			else
			{
			    al.put(arr[i],1);
			}
		}
	   int res = -1;
	    for(Entry<Integer,Integer> entry : al.entrySet())
	    {
	        if(entry.getValue() > 1)
	        {
	            int t = entry.getKey().intValue();
				res = Index(arr,t);
				res+=1;
				break;
			 }
	    }
	    System.out.println(res);
	    //return -1;
		//System.out.println("no element found");
	}

	public static int Index(int[] arr,int t){
		   if (arr == null) return -1;
            int len = arr.length;
            int i = 0;
             while (i < len) {
            if (arr[i] == t) return i;
            else i=i+1;
			 }
	
	return -1;
	}

}
