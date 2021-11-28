import java.util.*;
import java.util.stream.*;
class FindMaxOfPrimitiveArrayUsingStreams 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

		int max = Arrays.stream(arr).min().getAsInt();
		System.out.println(max);

		Integer[] arr1 = {20,30,10,40};
		List<Integer> list = Arrays.asList(arr1);

		int resMax = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(resMax);
	}
}
