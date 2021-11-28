import java.util.concurrent.*;
class MyRunnable implements Runnable
{
	String name;
	MyRunnable(String name)
	{
		this.name = name;
	}
	public void run(){
		System.out.println(name+"....Job started by Thread: "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
		}
		System.out.println(name+"....Job Completed by Thread: "+Thread.currentThread().getName());
	}
}
class ExecutorFrameworkDemo 
{
	public static void main(String[] args) 
	{
		MyRunnable[] jobs = {
			new MyRunnable("sarath"),
			new MyRunnable("kumar"),
			new MyRunnable("sajja"),
			new MyRunnable("sai"),
			new MyRunnable("prakash"),
			new MyRunnable("Nani"),
			};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyRunnable job : jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}
}

/*output:
kumar....Job started by Thread: pool-1-thread-2
sajja....Job started by Thread: pool-1-thread-3
sarath....Job started by Thread: pool-1-thread-1
sarath....Job Completed by Thread: pool-1-thread-1
sajja....Job Completed by Thread: pool-1-thread-3
prakash....Job started by Thread: pool-1-thread-3
kumar....Job Completed by Thread: pool-1-thread-2
Nani....Job started by Thread: pool-1-thread-2
sai....Job started by Thread: pool-1-thread-1
Nani....Job Completed by Thread: pool-1-thread-2
sai....Job Completed by Thread: pool-1-thread-1
prakash....Job Completed by Thread: pool-1-thread-3
*/