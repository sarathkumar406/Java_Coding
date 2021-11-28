class ParentThread extends Thread
{
	public static InheritableThreadLocal tl = new InheritableThreadLocal()
	{
		public Object childValue(Object p){
			return "CC";
		}
	};

	public void run(){
		tl.set("PP");
		System.out.println("Parent thread value ___ "+tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread
{
	public void run(){
	System.out.println("Child Thread value ---- >.. "+ParentThread.tl.get());
	}
}
class ThreadLocaldemo3 
{
	public static void main(String[] args) 
	{
		ParentThread pt = new ParentThread();
		pt.start();
	}
}
