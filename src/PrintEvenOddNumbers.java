class PrintNumbers
{
	private boolean print;
	
	public synchronized void printOddNumbers(int num){
		//System.out.println("odd method print "+print);
		if(print)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
			System.out.print(num+" ");	
			print = true;
			notify();
	}

	public synchronized void printEvenNumbers(int num){
		if(!print){
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{e.printStackTrace();
			}
			System.out.print(num+" ");
			
		}
		print = false;
			notify();

	}


	
}
class EvenPrintNumbers implements Runnable
{
	private PrintNumbers pn;
	private int num;

	public EvenPrintNumbers(PrintNumbers pn, int num)
	{
		this.pn = pn;
		this.num = num;
	}
	
	@Override
	public void run(){
		for(int i =2;i<=num;i+=2)
		{
			pn.printEvenNumbers(i);
		}
	}
}

class OddPrintNumbers implements Runnable
{
	private PrintNumbers pn;
	private int num;
	
	public OddPrintNumbers(PrintNumbers pn,int num)
	{
		this.pn = pn;
		this.num = num;
	}
	
	@Override
	public void run()
	{
		System.out.println("odd number Thread");
		for(int i=1;i<=num;i+=2)
		{
			pn.printOddNumbers(i);
		}
	}
}

class PrintEvenOddNumbers 
{
	public static void main(String[] args) 
	{
		PrintNumbers pn = new PrintNumbers();

		Thread t1 = new Thread(new EvenPrintNumbers(pn,20));
		Thread t2 = new Thread(new OddPrintNumbers(pn,20));

		t1.start();
		t2.start();
	}
}
