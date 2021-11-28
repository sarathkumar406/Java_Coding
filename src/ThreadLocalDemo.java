
class ThreadLocalDemo 
{
	public static void main(String[] args) 
	{
		ThreadLocal tl = new ThreadLocal(){
			public Object initialValue(){
				return "abc";
			}
		};
		System.out.println(tl.get());//null
		tl.set("sarat");
		System.out.println(tl.get());//sarat
		tl.remove();
		System.out.println(tl.get());//null

	}
}
