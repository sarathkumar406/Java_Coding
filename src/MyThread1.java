class MyThread1 extends Thread 
{
	public void run()
	{
		System.out.println("This line will be executed by :"+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		
		MyThread1 t = new MyThread1();
		
		t.start();
		System.out.println("This line will be executed by :"+Thread.currentThread().getName());
	}
}
