class Asample
{
	public void getData(){
		System.out.println("Asample");
	}
}
class Bsample extends Asample
{
	private void getData(){
		System.out.pritln("Bsample");
	}
	public static void main(String[] args) 
	{
		Bsample b = new Bsample();
		b.getData();
		System.out.println("Hello World!");
	}
}

