static class t1 extends Thread 
{
	public void run()
	{
		synchronized (lock1){

			synchronized (lock2){
				System.out.println("t1 lock2");
			}
		}
	}
}
static class t2 extends Thread 
{
	public void run()
	{
		synchronized (lock2){

			synchronized (lock1){
				System.out.println("t2 lock1");
			}
		}
	}
}


class check_deadlock
{
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	public static void main(String[] args) 
	{
		t1 T1 = new t1();
		t2 T2 = new t2();
		T1.start();
		T2.start();
	}
}
