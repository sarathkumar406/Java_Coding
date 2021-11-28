class A
{
	void print(){
		System.out.println(" Class A");
	}
}

class B extends A 
{
	void print()
	{
		System.out.println(" Class B");
	}	
	
	public static void main(String[] args) 
	{
		//B b = (B)new A();

		A a = new B();
		A a1 = new A();
		B b = new B();
		A a2 = new B();
		a.print();
		a1.print();
		b.print();
	}
}
