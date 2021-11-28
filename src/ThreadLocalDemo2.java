class CustomerThread extends Thread
{
	static Integer custId  = 0;
	private static ThreadLocal tl = new ThreadLocal()
	{
		protected Integer initialValue()
		{
			return ++custId;
		}
	};

	CustomerThread(String name)
	{
		super(name);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Executing with customer id : "+tl.get());
	}
}
class ThreadLocalDemo2
{
	public static void main(String[] args) 
	{
		CustomerThread c1 = new CustomerThread("Customer thread -1");
		CustomerThread c2 = new CustomerThread("Customer thread -2");
		CustomerThread c3 = new CustomerThread("Customer thread -3");
		CustomerThread c4 = new CustomerThread("Customer thread -4");
		//CustomerThread c5 = new CustomerThread("Customer thread -5");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		//c5.start();
	}
}
