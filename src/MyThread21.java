class MyThread21 extends Thread 
{
	Display d;
	MyThread12(){
		this.d = d;
	}
	public void run()
	{
		d.displayC();
	}
	
}
