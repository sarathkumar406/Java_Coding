class TestGroup 
{
	public static void main(String[] args) 
	{
		
		ThreadGroup g1 = new ThreadGroup("tp");
		Thread t1 = new Thread(g1,"First Group");
		Thread t2 = new Thread(g1,"Second Group");
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1,"Third Group");
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		System.out.println(t3.getPriority());//3
			

	}
}
