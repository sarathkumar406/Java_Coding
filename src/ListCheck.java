import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class ListCheck 
{
	public static void main(String[] args) 
	{
		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
		al.add(01);
		al.add(02);
		al.add(03);
		al.add(04);
		System.out.println(al);

		for(Integer i : al)
		{
			System.out.println(i);
			al.add();
		}
	}
}
