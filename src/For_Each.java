import java.util.*;
class For_Each 
{
	public static void main(String[] args) 
	{
		int[] marks = { 125, 132, 95, 116, 110 };

		int max = marks[0];

		for(int m : marks){
			if(m > max)
			{
				max = m;
			}
		}
		System.out.println(max);
		System.out.println(Arrays.stream(marks).max().getAsInt());
		System.out.println("find any "+Arrays.stream(marks) 
                               .findAny() 
                               .getAsInt()); 
		Arrays.stream(marks).forEach(System.out::println);

		System.out.println(Arrays.stream(marks).reduce((x,y)->x+y));

		System.out.println("Any match -->> "+Arrays.stream(marks).anyMatch(e->e%2==0));


		 List<String> gamesList = new ArrayList<String>();  
			gamesList.add("Football");  
			gamesList.add("Cricket");  
			gamesList.add("Chess");  
			gamesList.add("Hocky"); 
//	Enhanced- for loop
		for(String al : gamesList){
			System.out.println(al);
		}
		
		System.out.println();
        System.out.println("------------Iterating by passing method reference---------------");  
		gamesList.forEach(System.out::println);

		        System.out.println("------------Lambda Expression---------------");  
				gamesList.forEach(game -> System.out.println(game));
				System.out.println("------------Stream foreach---------------");  
				gamesList.stream().forEach(System.out::println);
	}
}
