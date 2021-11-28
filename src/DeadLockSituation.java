class DeadLockSituation 
{
	public static void main(String[] args) 
	{
		final String resource1 = "sarat";
		final String resource2 = "kumar";

		// thread t1 tries lock resource1 and resource2

		Thread t1 = new Thread(){

			public void run() {
				synchronized(resource1)
				{
					System.out.println("Thread1 : lock resource1");
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						System.out.println(e);
					}
					
				

				synchronized(resource2){
					System.out.println("Thread 1: locked resource 2");

				}

				}
			}
		};
		//thread t2 will tries to lock resource2 and then resource1
		Thread t2 = new Thread(){

			public void run(){
				synchronized(resource2)
				{
					System.out.println("Thread2 : lock resource2");
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						System.out.println(e);
					}
				

				synchronized(resource1){
					System.out.println("Thread 2: locked resource 1");
				}
				}
			}
		};
	
	t1.start();
	t2.start();

	}
}
