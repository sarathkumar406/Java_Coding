class ThreadA 
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadB b = new ThreadB();
		b.start();
		Thread.sleep(10000);
		synchronized(b){
			System.out.println("Main Thread trying to call  wait() method");
			b.wait(10000);
			System.out.println("Main thread got notification...");
		}
		System.out.println(b.total);
	}
}
class ThreadB extends Thread
{
	int total = 0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child thread starts calculation...");
			for(int i =1;i<=100;i++)
			{
				total +=i;
			}
			this.notify();
		}
	}
}



