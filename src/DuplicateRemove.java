import java.util.*;
class DuplicateRemove 
{
	public static void main(String[] args) 
	{
		List<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,30,40,40));
		removeDeuplicate(al);
		
	}

	private static void removeDeuplicate(List<Integer> al){

		Set<Integer> as = new LinkedHashSet<>();
		as.addAll(al);
		al.clear();
		al.addAll(as);
		System.out.println(al);
	}
}
