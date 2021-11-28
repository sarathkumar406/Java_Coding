import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class MyThread extends Thread
{
	static ReentrantLock l = new ReentrantLock();
	MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		do
		{
		try
		{
		if(l.tryLock(5000, TimeUnit.MILLISECONDS))
		{
			System.out.println(Thread.currentThread().getName()+
				".... got lock and perfrom safe operations");
				Thread.sleep(20000);
				System.out.println(Thread.currentThread().getName()+
				".... releases lock");
			l.unlock();
			break;
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+
				".... unable to get lock and please try again");
		}
		}
		catch (InterruptedException e)
			{
			}
		}
		while (true);
	}
}
class  ReentrantLockDemo4
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		t1.start();
		t2.start();
	}
}


//output : First Thread.... got lock and perfrom safe operations
//Second Thread.... unable to get lock and perfrom alternative operations