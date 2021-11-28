class Test_Thread extends Thread 
{
	public void run(){
		
			System.out.println(Thread.currentThread().getName()+" Child In Control");
 System.out.println("Is alive? " + Thread.currentThread().isAlive());
		
	}
	

	
	public static void main(String[] args) throws Exception
	{
		Test_Thread t = new Test_Thread();
		t.start();

		
			t.join(10000);
			System.out.println(Thread.currentThread().getName()+" In Control");
			//System.out.println("Current thread: " +
                                  //  t.getName());
  
  
        // Checks if this thread is alive
        System.out.println("Is alive? " + t.isAlive());
		System.out.println(Thread.currentThread().getName()+" In Control");
		
		
	}
}

//o/p : strat method
//		Main Thread		-- both Threads are executed 
//		run method