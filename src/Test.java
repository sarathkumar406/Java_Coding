class MyThreadTest extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}

}
class Test_join
{
	public static void main(String[] args) throws InterruptedException
	{
		
		MyThreadTest t = new MyThreadTest();
		t.start();
		t.join(10000);
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
	}
}
	

