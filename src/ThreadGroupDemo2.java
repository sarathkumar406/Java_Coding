class ThreadGroupDemo2 
{
	public static void main(String[] args) 
	{
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread t1 : t)
		{
			System.out.println(t1.getName() +" _______ " +t1.isDaemon());
		}
	}
}
