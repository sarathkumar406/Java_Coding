import java.util.*;
public class UpdateStudentRecords_3
{

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("sarath", "Nellore"));
		al.add(new Student("kumar", "Mumbai"));
		al.add(new Student("sajja", "Mumbai"));
		al.add(new Student("sai", "Mumbai"));

		System.out.println(al);

		int rs = updateRecord(al);
		System.out.println(rs);

	}

	private static int updateRecord(ArrayList<Student> al) {
		int count =0;
		for(int i =0;i<al.size();i++) 
		{
			if(al.get(i).getCity().equals("Mumbai"))
			{
				al.get(i).setCity("Delhi");
				count++;
			}
		}
			
		return count;

	}
}



