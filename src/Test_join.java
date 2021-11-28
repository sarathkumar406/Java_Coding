class MyThreadTest extends Thread 
{
	static Thread mt;
	public void run()
	{
			try{
			mt.join();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}

}
class Test_join
{
	public static void main(String[] args) throws InterruptedException
	{
		
		MyThreadTest.mt = Thread.currentThread();
		MyThreadTest t = new MyThreadTest();
		t.start();
		t.join();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}
}
	

