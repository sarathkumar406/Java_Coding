class Adder
{
	public static int add(int a, int b){
		System.out.println("first");
		return a+b;
	}

	public static double add(double a, double b){
		System.out.println("Second");
		return a+b;
	}
}
class MethodOverloading 
{
	public static void main(String[] args) 
	{
	
		System.out.println(Adder.add(4.0,2.0));
	}
}
