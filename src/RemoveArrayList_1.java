import java.util.*;
class  RemoveArrayList_1
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("sarath");
		al.add("kumar");
		al.add("sajja");
		al.add("sai");
		al.add("prakash");
		al.add("sujatha");
		System.out.println(al);
		String search = "sarath";
		RemoveArrayListValue(al,search);
	}

	public static void RemoveArrayListValue(List<String> al, String str){
		
		System.out.println("List Values before remove : "+al);
		//Approach #1
		boolean res = al.remove(str);
		if(res){
			System.out.println("List Values after remove : "+al);
		}
		else{
			System.out.println("List doesn't contain value entered by you : "+str);
		}


		//Approach #2
		ArrayList<String> al1 = new ArrayList<>();
		for(int i =0;i<al.size();i++){
			if(al.get(i).equals(str)){
				continue;
			}
			al1.add(al.get(i));
		}
		System.out.println(al1);
		
	}
}
