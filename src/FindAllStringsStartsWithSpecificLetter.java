import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class FindAllStringsStartsWithSpecificLetter 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("sarat","kumar","sajja");

		list.forEach(System.out::println);

		List<String> resList = list.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
		System.out.println(resList);

	}
}
