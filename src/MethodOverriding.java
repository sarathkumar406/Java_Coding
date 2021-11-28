class A
{
	public double msg()
	{
		return 10;
	}
}
class MethodOverriding extends A
{
	public double msg()
	{
		return 20;
	}
	public static void main(String[] args) 
	{
		MethodOverriding m = new MethodOverriding();
		double n = m.msg();
		System.out.println(n);
	}
}
