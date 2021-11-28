class SleepDemo extends Thread 
{
	public void run()
	{
			for(int i=0;i<10;i++)
			{
				System.out.println("I am Lazy Thread - "+i);
			}
		System.out.println("I am entering into sleeping state");
		try
		{
			Thread.sleep(5000);
		}

		catch(InterruptedException e)
		{
			System.out.println("I got interruption");
		}
	}
	public static void main(String[] args) 
	{
		SleepDemo t = new SleepDemo();
		t.start();
		t.interrupt();
		System.out.println("End of Main method");
	}
}
