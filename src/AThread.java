class AThread extends Thread
{
	BThread bb = new BThread();
	AThread aaa = new AThread();
	public synchronized void d1(BThread b)
	{
		System.out.println("Thread1 starts execution of d1() method");
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
		}
		System.out.println("Thread1 trying to call B's last method");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside A, Last method");
	}
	public void m1()
	{
		this.start();
		aaa.d1(bb);//executed by main thread
	}
	public void run()
	{
		bb.d2(aaa);//executed by child thread
	}
	public static void main(String[] args) 
	{
		AThread aa = new AThread();
		aa.m1();

	}
}

class BThread 
{
	public synchronized void d2(AThread a)
	{
		System.out.println("Thread2 starts execution of d2() method");
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
		}
		System.out.println("Thread2 trying to call A's last method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B, Last method");
	}
	
}