import java.util.*;
import java.util.stream.*;
class sample1 
{
	public static void main(String[] args) 
	{
		List<Integer> al = Arrays.asList(2,4,3);
		List<Integer> al2 = Arrays.asList(2,4,3);
		System.out.println(al.equals(al2));

		String s = new String("5");
		System.out.println(1+10+s+1+10);

		List<Double> aa = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		System.out.println(aa.stream().map(i->i/2).collect(Collectors.toList()));
	}
}
