import java.util.concurrent.locks.*;
class MyThread extends Thread
{
	static ReentrantLock l = new ReentrantLock();
	MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+
				".... got lock and perfrom safe operations");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
			}
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+
				".... unable to get lock and perfrom alternative operations");
		}
	}
}
class  ReentrantLockDemo3
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