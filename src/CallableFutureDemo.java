import java.util.concurrent.*;
class MyCallable implements Callable
{
	int num;
	MyCallable(int num)
	{
		this.num = num;
	}
	public Object call() throws Exception
	{
		System.out.println(Thread.currentThread().getName()+ "is resposible to find sum of first "+num+" numbers ");
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		return sum;
	}
}
class CallableFutureDemo 
{
	public static void main(String[] args) throws Exception
	{
		MyCallable[] jobs ={
			new MyCallable(10),
			new MyCallable(20),
			new MyCallable(30),
			new MyCallable(40),
			new MyCallable(50),
			new MyCallable(60),
		};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyCallable job:jobs)
		{
			Future f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}


/* OUtput :

pool-1-thread-1is resposible to find sum of first 10 numbers
55
pool-1-thread-2is resposible to find sum of first 20 numbers
210
pool-1-thread-3is resposible to find sum of first 30 numbers
465
pool-1-thread-1is resposible to find sum of first 40 numbers
820
pool-1-thread-2is resposible to find sum of first 50 numbers
1275
pool-1-thread-3is resposible to find sum of first 60 numbers
1830

*/